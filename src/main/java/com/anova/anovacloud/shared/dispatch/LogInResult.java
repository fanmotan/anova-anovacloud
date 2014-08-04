

package com.anova.anovacloud.shared.dispatch;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.anova.anovacloud.shared.dto.ActionType;
import com.anova.anovacloud.shared.dto.CurrentUserDto;

public class LogInResult {
    private ActionType actionType;
    private CurrentUserDto currentUserDto;
    private String loggedInCookie;

    public LogInResult() {
    }

    @JsonCreator
    public LogInResult(@JsonProperty("actionType") ActionType actionType,
                       @JsonProperty("currentUserDto") CurrentUserDto currentUserDto,
                       @JsonProperty("loggedInCookie") String loggedInCookie) {
        this.actionType = actionType;
        this.currentUserDto = currentUserDto;
        this.loggedInCookie = loggedInCookie;
    }

    public CurrentUserDto getCurrentUserDto() {
        return currentUserDto;
    }

    public String getLoggedInCookie() {
        return loggedInCookie;
    }

    public ActionType getActionType() {
        return actionType;
    }
}
