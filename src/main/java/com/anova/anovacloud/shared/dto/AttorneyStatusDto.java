

package com.anova.anovacloud.shared.dto;


public class AttorneyStatusDto extends BaseEntity {
    private String statusName;
    private String statusValue;
    
	public AttorneyStatusDto() {
       
    }

    public AttorneyStatusDto(String statusValue, String statusName) {
        this.statusName = statusName;
        this.statusValue = statusValue;
    }
   
    public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getStatusValue() {
		return statusValue;
	}

	public void setStatusValue(String statusValue) {
		this.statusValue = statusValue;
	}
}
