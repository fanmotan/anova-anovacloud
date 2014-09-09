

package com.anova.anovacloud.client.application.caseStatus.ui;

import java.io.IOException;

import com.google.gwt.text.shared.AbstractRenderer;
import com.anova.anovacloud.shared.dto.CaseStatusDto;

public class CaseStatusRenderer extends AbstractRenderer<CaseStatusDto> {
    @Override
    public String render(CaseStatusDto caseStatusDto) {
        return caseStatusDto == null ? "" : caseStatusDto.getStatusName();
    }
    @Override
    public void render(CaseStatusDto caseStatusDto, Appendable appendable)
            throws IOException {
        render(caseStatusDto);
    }

}
