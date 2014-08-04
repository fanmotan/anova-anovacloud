

package com.anova.anovacloud.client.application.user.ui;

import com.anova.anovacloud.shared.dto.UserDto;
import com.gwtplatform.mvp.client.UiHandlers;

public interface EditUserUiHandlers extends UiHandlers {
    void createNew();

    void edit(UserDto userDto);

    void onSave(UserDto userDto);

    void onCancel();
}
