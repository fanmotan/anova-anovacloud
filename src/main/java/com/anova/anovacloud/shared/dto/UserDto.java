
package com.anova.anovacloud.shared.dto;

public class UserDto extends BaseEntity {
	private String displayName;
    private String username;
    private String hashPassword;
    private String firstName;
    private String lastName;
    private String role;
    private String email;
    private String mailAddress;
    private String phone;
    private String fax;

    public UserDto() {
        firstName = "";
        lastName = "";
        displayName = "";
        role = "";
        email = "";
        mailAddress ="";
        phone ="";
        fax = "";
    }

    public UserDto(String displayName,
                   String firstName,
                   String lastName,
                   String username,
                   String hashPassword,
                   String role,
    			   String email,
    			   String mailAddress,
    			   String phone,
    			   String fax) {
    	this.displayName = displayName;
        this.username = username;
        this.hashPassword = hashPassword;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.email = email;
        this.mailAddress = mailAddress;
        this.phone = phone;
        this.fax = fax;
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
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        String s = " { User ";
        s += firstName + " "+lastName; 
        s += "}";
        return s;
    }
}
