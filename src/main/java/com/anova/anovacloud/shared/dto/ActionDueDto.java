
package com.anova.anovacloud.shared.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActionDueDto implements Dto {
    private String caseNumber;
    private String clientRefNum;
    private String title;
    private String status;
    private String dueDate;
    private String actionDue;
    private String atty;
    private String actionRemarks;

    public ActionDueDto() {
    }

    public ActionDueDto(@JsonProperty("caseNumber") String caseNumber,
                                 @JsonProperty("clientRefNum") String clientRefNum,
                                 @JsonProperty("title") String title,
                                 @JsonProperty("status") String status,
                                 @JsonProperty("dueDate") String dueDate,
                                 @JsonProperty("actionDue") String actionDue,
                                 @JsonProperty("atty") String atty,
                                 @JsonProperty("actionRemarks") String actionRemarks) {
        this.caseNumber = caseNumber;
        this.clientRefNum = clientRefNum;
        this.title = title;
        this.status = status;
        this.dueDate = dueDate;
        this.actionDue = actionDue;
        this.atty = atty;
        this.actionRemarks = actionRemarks;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public String getClientRefNum() {
        return clientRefNum;
    }
    
    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }
    public String getDueDate() {
        return dueDate;
    }

    public String getActionDue() {
        return actionDue;
    }
    public String getAtty() {
        return atty;
    }

    public String getActionRemarks() {
        return actionRemarks;
    }
    
}
