

package com.anova.anovacloud.shared.dispatch;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.anova.anovacloud.shared.dto.ActionType;

public class LogInRequest {
    private ActionType actionType;
    private String username;
    private String password;
    private String loggedInCookie;

    public LogInRequest() {
    }

    @JsonCreator
    public LogInRequest(@JsonProperty("username") String username,
                        @JsonProperty("password") String password) {
        actionType = ActionType.VIA_CREDENTIALS;
        this.password = password;
        this.username = username;
    }

    public LogInRequest(String loggedInCookie) {
        actionType = ActionType.VIA_COOKIE;
        this.loggedInCookie = loggedInCookie;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getLoggedInCookie() {
        return loggedInCookie;
    }
}
