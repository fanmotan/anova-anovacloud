

package com.anova.anovacloud.shared.dto;


public class MatterActionStatusDto extends BaseEntity {
    private String statusName;
    
	public MatterActionStatusDto() {
       
    }

    public MatterActionStatusDto(String statusName) {
        this.statusName = statusName;
    }
   
    public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	 
}
