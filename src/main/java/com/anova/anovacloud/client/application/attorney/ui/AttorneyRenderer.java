

package com.anova.anovacloud.client.application.attorney.ui;

import com.google.gwt.text.shared.AbstractRenderer;
import com.anova.anovacloud.shared.dto.AttorneyDto;

public class AttorneyRenderer extends AbstractRenderer<AttorneyDto> {
    @Override
    public String render(AttorneyDto attorneyDto) {
    	if (attorneyDto == null){
    		return "";
    	}
        return attorneyDto.getDisplayName()+" "+attorneyDto.getFirstName()+" "+attorneyDto.getLastName()+" "+attorneyDto.getAttorneyname()+" "+attorneyDto.getHashPassword()+" "+attorneyDto.getRole()+" "+attorneyDto.getEmail()+" "+attorneyDto.getMailAddress()+" "+attorneyDto.getPhone()+" "+attorneyDto.getFax();
    }
    
}
