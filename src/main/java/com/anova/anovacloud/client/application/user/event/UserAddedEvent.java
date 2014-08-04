
package com.anova.anovacloud.client.application.user.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import com.anova.anovacloud.client.application.user.event.UserAddedEvent.UserAddedHandler;
import com.anova.anovacloud.shared.dto.UserDto;

public class UserAddedEvent extends GwtEvent<UserAddedHandler> {
    public interface UserAddedHandler extends EventHandler {
        void onUserAdded(UserAddedEvent event);
    }

    public static Type<UserAddedHandler> getType() {
        return TYPE;
    }

    public static void fire(HasHandlers source, UserDto userDto) {
        source.fireEvent(new UserAddedEvent(userDto));
    }

    private static final Type<UserAddedHandler> TYPE = new Type<>();

    private UserDto userDto;

    public UserAddedEvent(UserDto userDto) {
        this.userDto = userDto;
    }

    @Override
    public Type<UserAddedHandler> getAssociatedType() {
        return TYPE;
    }

    public UserDto getUser() {
        return userDto;
    }

    @Override
    protected void dispatch(UserAddedHandler handler) {
        handler.onUserAdded(this);
    }
}
