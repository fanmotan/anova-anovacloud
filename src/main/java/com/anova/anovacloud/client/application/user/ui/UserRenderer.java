

package com.anova.anovacloud.client.application.user.ui;

import com.google.gwt.text.shared.AbstractRenderer;
import com.anova.anovacloud.shared.dto.UserDto;

public class UserRenderer extends AbstractRenderer<UserDto> {
    @Override
    public String render(UserDto userDto) {
    	if (userDto == null){
    		return "";
    	}
        return userDto.getDisplayName()+" "+userDto.getFirstName()+" "+userDto.getLastName()+" "+userDto.getUsername()+" "+userDto.getHashPassword()+" "+userDto.getRole()+" "+userDto.getEmail()+" "+userDto.getMailAddress()+" "+userDto.getPhone()+" "+userDto.getFax();
    }
    
}
