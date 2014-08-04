

package com.anova.anovacloud.client.application.matters.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import com.anova.anovacloud.client.application.matters.event.MatterAddedEvent.MatterAddedHandler;
import com.anova.anovacloud.shared.dto.MatterDto;

public class MatterAddedEvent extends GwtEvent<MatterAddedHandler> {
    public interface MatterAddedHandler extends EventHandler {
        void onMatterAdded(MatterAddedEvent event);
    }

    public static Type<MatterAddedHandler> getType() {
        return TYPE;
    }

    public static void fire(HasHandlers source, MatterDto matterDto) {
        fire(source, matterDto, false);
    }

    public static void fire(HasHandlers source, MatterDto matterDto, Boolean isNew) {
        source.fireEvent(new MatterAddedEvent(matterDto, isNew));
    }

    private static final Type<MatterAddedHandler> TYPE = new Type<>();

    private final MatterDto matterDto;
    private final Boolean isNew;

    public MatterAddedEvent(MatterDto matterDto) {
        this(matterDto, false);
    }

    public MatterAddedEvent(MatterDto matterDto, Boolean isNew) {

        this.matterDto = matterDto;
        this.isNew = isNew;
    }

    @Override
    public Type<MatterAddedHandler> getAssociatedType() {
        return TYPE;
    }

    public MatterDto getMatter() {
        return matterDto;
    }

    public Boolean isNew() {
        return isNew;
    }

    @Override
    protected void dispatch(MatterAddedHandler handler) {
        handler.onMatterAdded(this);
    }
}
