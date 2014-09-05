

package com.anova.anovacloud.client.application.attorney.ui;

import java.util.List;

import javax.inject.Inject;

import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.event.DisplayMessageEvent;
import com.anova.anovacloud.client.application.attorney.event.AttorneyAddedEvent;
import com.anova.anovacloud.client.application.attorney.ui.EditAttorneyPresenter.MyView;
import com.anova.anovacloud.client.application.widget.message.Message;
import com.anova.anovacloud.client.application.widget.message.MessageStyle;
import com.anova.anovacloud.client.resources.EditAttorneyMessages;
import com.anova.anovacloud.client.rest.AttorneyService;
import com.anova.anovacloud.client.rest.AttorneyStatusService;
import com.anova.anovacloud.client.util.AbstractAsyncCallback;
import com.anova.anovacloud.client.util.ErrorHandlerAsyncCallback;
import com.anova.anovacloud.shared.dto.AttorneyDto;
import com.anova.anovacloud.shared.dto.AttorneyStatusDto;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.proxy.RevealRootPopupContentEvent;

public class EditAttorneyPresenter extends PresenterWidget<MyView> implements EditAttorneyUiHandlers {
    public interface MyView extends PopupView, HasUiHandlers<EditAttorneyUiHandlers> {
        void edit(AttorneyDto attorneyDto);
        void setAllowedAttorneyStatuss(List<AttorneyStatusDto> attorneyStatusDtos);
    }

    private final RestDispatch dispatcher;
    private final AttorneyService attorneyService;
    private final AttorneyStatusService attorneyStatusService;
    private final EditAttorneyMessages messages;

    private AttorneyDto attorneyDto;

    @Inject
    public EditAttorneyPresenter(EventBus eventBus,
                                     MyView view,
                                     RestDispatch dispatcher,
                                     AttorneyService attorneyService,
                                     AttorneyStatusService attorneyStatusService,
                                     EditAttorneyMessages messages) {
        super(eventBus, view);

        this.dispatcher = dispatcher;
        this.attorneyService = attorneyService;
        this.attorneyStatusService = attorneyStatusService;
        this.messages = messages;

        getView().setUiHandlers(this);
    }

    @Override
    public void createNew() {
        attorneyDto = new AttorneyDto();
        reveal();
    }

    @Override
    public void onCancel() {
        getView().hide();
    }

    @Override
    public void edit(AttorneyDto attorneyDto) {
        this.attorneyDto = attorneyDto;

        reveal();
    }

    @Override
    public void onSave(AttorneyDto attorneyDto) {
        dispatcher.execute(attorneyService.saveOrCreate(attorneyDto),
                new ErrorHandlerAsyncCallback<AttorneyDto>(this) {
                    @Override
                    public void onSuccess(AttorneyDto savedAttorney) {
                        DisplayMessageEvent.fire(EditAttorneyPresenter.this,
                                new Message(messages.attorneySaved(), MessageStyle.SUCCESS));
                        AttorneyAddedEvent.fire(EditAttorneyPresenter.this, savedAttorney);

                        getView().hide();
                    }
                });
    }

    private void reveal() {
    	dispatcher.execute(attorneyStatusService.getAttorneyStatuss(), new AbstractAsyncCallback<List<AttorneyStatusDto>>() {
            
    		@Override
            public void onSuccess(List<AttorneyStatusDto> statuss) {			
                onGetAttorneyStatusSuccess(statuss);
            }
        });
    }
    private void onGetAttorneyStatusSuccess(List<AttorneyStatusDto> attorneyStatusDtos) {
        getView().setAllowedAttorneyStatuss(attorneyStatusDtos);
        getView().edit(attorneyDto);
        RevealRootPopupContentEvent.fire(this, this);
    }
}
