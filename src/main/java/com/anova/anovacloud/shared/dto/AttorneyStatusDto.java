

package com.anova.anovacloud.shared.dto;


public class AttorneyStatusDto extends BaseEntity {
    private String statusName;
    
	public AttorneyStatusDto() {
       
    }

    public AttorneyStatusDto(String statusName) {
        this.statusName = statusName;
    }
   
    public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	 
}
