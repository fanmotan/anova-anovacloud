

package com.anova.anovacloud.client.application.userRole.ui;

import java.io.IOException;

import com.google.gwt.text.shared.AbstractRenderer;
import com.anova.anovacloud.shared.dto.UserRoleDto;

public class UserRoleRenderer extends AbstractRenderer<UserRoleDto> {
    @Override
    public String render(UserRoleDto userRoleDto) {
        return userRoleDto == null ? "" : userRoleDto.getRoleName();
    }
    @Override
    public void render(UserRoleDto userRoleDto, Appendable appendable)
            throws IOException {
        render(userRoleDto);
    }

}
