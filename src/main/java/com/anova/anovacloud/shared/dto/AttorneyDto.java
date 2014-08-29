
package com.anova.anovacloud.shared.dto;

public class AttorneyDto extends BaseEntity {
	private String displayName;
    private String attorneyname;
    private String hashPassword;
    private String firstName;
    private String lastName;
    private String role;
    private String email;
    private String mailAddress;
    private String phone;
    private String fax;

    public AttorneyDto() {
        firstName = "";
        lastName = "";
        displayName = "";
        role = "";
        email = "";
        mailAddress ="";
        phone ="";
        fax = "";
    }

    public AttorneyDto(String displayName,
                   String firstName,
                   String lastName,
                   String attorneyname,
                   String hashPassword,
                   String role,
    			   String email,
    			   String mailAddress,
    			   String phone,
    			   String fax) {
    	this.displayName = displayName;
        this.attorneyname = attorneyname;
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

    public String getAttorneyname() {
        return attorneyname;
    }

    public void setAttorneyname(String attorneyname) {
        this.attorneyname = attorneyname;
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
        String s = " { Attorney ";
        s += firstName + " "+lastName; 
        s += "}";
        return s;
    }
}
