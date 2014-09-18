

package com.anova.anovacloud.shared.dto;


public class AttorneyRoleDto extends BaseEntity {
    private String roleName;
    private String roleValue;
    
	public String getRoleValue() {
		return roleValue;
	}

	public void setRoleValue(String roleValue) {
		this.roleValue = roleValue;
	}

	public AttorneyRoleDto() {
       
    }

    public AttorneyRoleDto(String roleValue, String roleName) {
        this.roleName = roleName;
        this.roleValue = roleValue;
    }
   
    public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	 
}
