

package com.anova.anovacloud.shared.dto;


public class AttorneyRoleDto extends BaseEntity {
    private String roleName;
    
	public AttorneyRoleDto() {
       
    }

    public AttorneyRoleDto(String roleName) {
        this.roleName = roleName;
    }
   
    public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	 
}
