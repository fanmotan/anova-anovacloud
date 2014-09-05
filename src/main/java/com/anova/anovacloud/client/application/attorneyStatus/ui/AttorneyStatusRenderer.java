

package com.anova.anovacloud.client.application.attorneyStatus.ui;

import java.io.IOException;

import com.google.gwt.text.shared.AbstractRenderer;
import com.anova.anovacloud.shared.dto.AttorneyStatusDto;

public class AttorneyStatusRenderer extends AbstractRenderer<AttorneyStatusDto> {
    @Override
    public String render(AttorneyStatusDto attorneyStatusDto) {
        return attorneyStatusDto == null ? "" : attorneyStatusDto.getStatusName();
    }
    @Override
    public void render(AttorneyStatusDto attorneyStatusDto, Appendable appendable)
            throws IOException {
        render(attorneyStatusDto);
    }

}
