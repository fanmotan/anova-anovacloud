
package com.anova.anovacloud.client.application.matterAction.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import com.anova.anovacloud.client.application.matterAction.event.MatterActionAddedEvent.MatterActionAddedHandler;
import com.anova.anovacloud.shared.dto.MatterActionDto;

public class MatterActionAddedEvent extends GwtEvent<MatterActionAddedHandler> {
    public interface MatterActionAddedHandler extends EventHandler {
        void onMatterActionAdded(MatterActionAddedEvent event);
    }

    public static Type<MatterActionAddedHandler> getType() {
        return TYPE;
    }

    public static void fire(HasHandlers source, MatterActionDto matterActionDto) {
        source.fireEvent(new MatterActionAddedEvent(matterActionDto));
    }

    private static final Type<MatterActionAddedHandler> TYPE = new Type<>();

    private MatterActionDto matterActionDto;

    public MatterActionAddedEvent(MatterActionDto matterActionDto) {
        this.matterActionDto = matterActionDto;
    }

    @Override
    public Type<MatterActionAddedHandler> getAssociatedType() {
        return TYPE;
    }

    public MatterActionDto getMatterAction() {
        return matterActionDto;
    }

    @Override
    protected void dispatch(MatterActionAddedHandler handler) {
        handler.onMatterActionAdded(this);
    }
}
