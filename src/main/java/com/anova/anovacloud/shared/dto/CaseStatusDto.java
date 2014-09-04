

package com.anova.anovacloud.shared.dto;


public class CaseStatusDto extends BaseEntity {
    private String statusName;
    
	public CaseStatusDto() {
       
    }

    public CaseStatusDto(String statusName) {
        this.statusName = statusName;
    }
   
    public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	 
}
