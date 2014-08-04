

package com.anova.anovacloud.client.application.user;

import com.anova.anovacloud.shared.dto.UserDto;
import com.gwtplatform.mvp.client.UiHandlers;

public interface UserUiHandlers extends UiHandlers {
    void onDetail(UserDto userDto);

    void onEdit(UserDto userDto);

    void onDelete(UserDto userDto);

    void onCreate();
}
