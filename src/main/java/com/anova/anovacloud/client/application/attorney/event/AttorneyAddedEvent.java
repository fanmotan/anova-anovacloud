
package com.anova.anovacloud.client.application.attorney.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import com.anova.anovacloud.client.application.attorney.event.AttorneyAddedEvent.AttorneyAddedHandler;
import com.anova.anovacloud.shared.dto.AttorneyDto;

public class AttorneyAddedEvent extends GwtEvent<AttorneyAddedHandler> {
    public interface AttorneyAddedHandler extends EventHandler {
        void onAttorneyAdded(AttorneyAddedEvent event);
    }

    public static Type<AttorneyAddedHandler> getType() {
        return TYPE;
    }

    public static void fire(HasHandlers source, AttorneyDto attorneyDto) {
        source.fireEvent(new AttorneyAddedEvent(attorneyDto));
    }

    private static final Type<AttorneyAddedHandler> TYPE = new Type<>();

    private AttorneyDto attorneyDto;

    public AttorneyAddedEvent(AttorneyDto attorneyDto) {
        this.attorneyDto = attorneyDto;
    }

    @Override
    public Type<AttorneyAddedHandler> getAssociatedType() {
        return TYPE;
    }

    public AttorneyDto getAttorney() {
        return attorneyDto;
    }

    @Override
    protected void dispatch(AttorneyAddedHandler handler) {
        handler.onAttorneyAdded(this);
    }
}
