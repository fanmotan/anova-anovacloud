
package com.anova.anovacloud.shared.dto;

public class AttorneyDto extends BaseEntity {
	private String displayName;
    private String firstName;
    private String lastName;
    private String mailAddress;
	private String email;
    private String phone;
    private String fax;
    private AttorneyStatusDto attorneyStatus;

   

	public AttorneyDto() {
       
    }

    public AttorneyDto(String displayName,
                   String firstName,
                   String lastName,
                   String mailAddress,
    			   String email,
    			   String phone,
    			   String fax,
    			   AttorneyStatusDto attorneyStatus) {
    	this.displayName = displayName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mailAddress = mailAddress;
        this.email = email;
        this.phone = phone;
        this.fax = fax;
        this.attorneyStatus = attorneyStatus;
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

    public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public AttorneyStatusDto getAttorneyStatus() {
		return attorneyStatus;
	}

	public void setAttorneyStatus(AttorneyStatusDto attorneyStatus) {
		this.attorneyStatus = attorneyStatus;
	}
    @Override
    public String toString() {
        String s = " { Attorney ";
        s += displayName ;
        s += "}";
        return s;
    }
}
