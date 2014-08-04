

package com.anova.anovacloud.client.application.user;

import com.anova.anovacloud.shared.dto.UserDto;
import com.gwtplatform.mvp.client.UiHandlers;

public interface UserDetailUiHandlers extends UiHandlers {
    void onSave(UserDto userDto);
}
