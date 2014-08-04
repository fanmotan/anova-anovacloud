
package com.anova.anovacloud.client.security;

import com.anova.anovacloud.shared.dto.CurrentUserDto;
import com.anova.anovacloud.shared.dto.UserDto;

public class CurrentUser {
    private Boolean loggedIn;
    private UserDto userDto;

    public CurrentUser() {
        loggedIn = false;
    }

    public void fromCurrentUserDto(CurrentUserDto currentUserDto) {
        setLoggedIn(currentUserDto.isLoggedIn());
        setUser(currentUserDto.getUser());
    }

    public void reset() {
        setLoggedIn(false);
        setUser(null);
    }

    public Boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(Boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public UserDto getUser() {
        return userDto;
    }

    public void setUser(UserDto userDto) {
        this.userDto = userDto;
    }
/*
	public boolean isAdmin() {
		if(userDto.getRole() != null && userDto.getRole().equals("admin"))
		{
			return true;
		}
		else{
		return false;
		}
	}
	*/
}
