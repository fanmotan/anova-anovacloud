

package com.anova.anovacloud.shared.dto;


public class CustomerStatusDto extends BaseEntity {
    private String statusName;
    
	public CustomerStatusDto() {
       
    }

    public CustomerStatusDto(String statusName) {
        this.statusName = statusName;
    }
   
    public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	 
}
