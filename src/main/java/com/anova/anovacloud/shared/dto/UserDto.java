
package com.anova.anovacloud.shared.dto;

public class UserDto extends BaseEntity {
	private String displayName;
    private String username;
    private String hashPassword;
    private String firstName;
    private String lastName;
    private String email;
    private UserRoleDto userRole;
    
	
	public UserDto() {
		
    }

    public UserDto(String displayName,
                   String firstName,
                   String lastName,
                   String username,
                   String hashPassword,
    			   String email,
    			   UserRoleDto userRole) {
    	this.displayName = displayName;
        this.username = username;
        this.hashPassword = hashPassword;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userRole = userRole;
    }

    public UserRoleDto getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRoleDto userRole) {
		this.userRole = userRole;
	}

	public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }
    
   
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
   
    @Override
    public String toString() {
        String s = " { User ";
        s += firstName + " "+lastName; 
        s += "}";
        return s;
    }
}
