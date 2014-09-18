

package com.anova.anovacloud.client.application.matterActionStatus.ui;

import java.io.IOException;

import com.google.gwt.text.shared.AbstractRenderer;
import com.anova.anovacloud.shared.dto.MatterActionStatusDto;

public class MatterActionStatusRenderer extends AbstractRenderer<MatterActionStatusDto> {
    @Override
    public String render(MatterActionStatusDto matterActionStatusDto) {
        return matterActionStatusDto == null ? "" : matterActionStatusDto.getStatusName();
    }
    @Override
    public void render(MatterActionStatusDto matterActionStatusDto, Appendable appendable)
            throws IOException {
        render(matterActionStatusDto);
    }

}
