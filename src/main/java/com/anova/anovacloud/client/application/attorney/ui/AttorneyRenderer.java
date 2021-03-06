

package com.anova.anovacloud.client.application.attorney.ui;

import com.google.gwt.text.shared.AbstractRenderer;
import com.anova.anovacloud.shared.dto.AttorneyDto;

public class AttorneyRenderer extends AbstractRenderer<AttorneyDto> {
    @Override
    public String render(AttorneyDto attorneyDto) {
    	if (attorneyDto == null){
    		return "";
    	}
        return attorneyDto.getDisplayName();
    }
    
}
