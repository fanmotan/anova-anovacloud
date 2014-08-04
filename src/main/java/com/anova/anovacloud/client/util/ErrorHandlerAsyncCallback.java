

package com.anova.anovacloud.client.util;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.http.client.Response;
import com.anova.anovacloud.client.application.event.DisplayMessageEvent;
import com.anova.anovacloud.client.application.widget.message.Message;
import com.anova.anovacloud.client.application.widget.message.MessageStyle;
import com.anova.anovacloud.client.util.exceptiontranslators.ForeignTranslator;
import com.anova.anovacloud.client.util.exceptiontranslators.NotNullTranslator;
import com.anova.anovacloud.client.util.exceptiontranslators.Translator;
import com.gwtplatform.dispatch.rest.shared.RestCallback;

public abstract class ErrorHandlerAsyncCallback<R> implements RestCallback<R> {
    private final HasHandlers hasHandlers;

    public ErrorHandlerAsyncCallback(HasHandlers hasHandlers) {
        this.hasHandlers = hasHandlers;
    }

    @Override
    public void onFailure(Throwable caught) {
        Message message = new Message(translateCauses(caught), MessageStyle.ERROR);
        DisplayMessageEvent.fire(hasHandlers, message);
    }

    @Override
    public void setResponse(Response response) {
        GWT.log("HTTP " + response.getStatusCode() + ": " + response.getStatusText());
    }

    private String translateCauses(Throwable caught) {
        StringBuilder sb = new StringBuilder(translateCause(caught));

        for (Throwable t = caught.getCause(); t != null; t = t.getCause()) {
            sb = sb.append(translateCause(t)).append("<br />");
        }

        return sb.toString();
    }

    private String translateCause(Throwable caught) {
        String message = caught.getMessage();

        Translator translator = new NotNullTranslator(message);
        if (translator.isMatching()) {
            return translator.getTranslatedMessage();
        }

        translator = new ForeignTranslator(message);
        if (translator.isMatching()) {
            return translator.getTranslatedMessage();
        }

        return message;
    }
}
