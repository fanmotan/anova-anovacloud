

package com.anova.anovacloud.shared.dto;


public class UserRoleDto extends BaseEntity {
    private String roleName;
    
	public UserRoleDto() {
       
    }

    public UserRoleDto(String roleName) {
        this.roleName = roleName;
    }
   
    public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	 
}
