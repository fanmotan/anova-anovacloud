

package com.anova.anovacloud.shared.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentUserDto implements Dto {
    private Boolean loggedIn;
    private UserDto user;

    public CurrentUserDto() {
    }

    @JsonCreator
    public CurrentUserDto(@JsonProperty("loggedIn") Boolean loggedIn,
                          @JsonProperty("user") UserDto user) {
        this.loggedIn = loggedIn;
        this.user = user;
    }

    public Boolean isLoggedIn() {
        return loggedIn;
    }

    public UserDto getUser() {
        return user;
    }

    @Override
    public String toString() {
        String s = " { CurrentUserDto ";
        s += "loggedIn=" + loggedIn + " ";
        s += "user=" + user + " ";
        s += " CurrentUserDto }";
        return s;
    }
}
