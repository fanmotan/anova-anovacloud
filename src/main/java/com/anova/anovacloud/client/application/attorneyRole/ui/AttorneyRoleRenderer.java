

package com.anova.anovacloud.client.application.attorneyRole.ui;

import java.io.IOException;

import com.google.gwt.text.shared.AbstractRenderer;
import com.anova.anovacloud.shared.dto.AttorneyRoleDto;

public class AttorneyRoleRenderer extends AbstractRenderer<AttorneyRoleDto> {
    @Override
    public String render(AttorneyRoleDto attorneyRoleDto) {
        return attorneyRoleDto == null ? "" : attorneyRoleDto.getRoleName();
    }
    @Override
    public void render(AttorneyRoleDto attorneyRoleDto, Appendable appendable)
            throws IOException {
        render(attorneyRoleDto);
    }

}
