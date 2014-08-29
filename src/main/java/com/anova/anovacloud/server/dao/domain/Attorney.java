

package com.anova.anovacloud.server.dao.domain;

import java.util.ArrayList;
import java.util.List;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;
import com.anova.anovacloud.shared.dto.BaseEntity;
import com.anova.anovacloud.shared.dto.AttorneyDto;

@Index
@Entity
public class Attorney extends BaseEntity {
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

    public Attorney() {
        firstName = "";
        lastName = "";
        displayName = "";
        role = "";
        email = "";
        mailAddress ="";
        phone ="";
        fax = "";
    }
    public Attorney(String displayName, String attorneyname, String hashPassword, String firstName, String lastName,
    			String role, String email, String mailAddress, String phone, String fax) {
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
    
    @Override
    public void setId(Long id) {
        this.id = id;
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
        String s = "{ Attorney ";
        s += "id=" + id + " ";
        s += "displayName=" + displayName + " ";
        s += "attorneyname=" + attorneyname + " ";
        s += "hashPassword=" + hashPassword + " ";
        s += "firstName=" + firstName + " ";
        s += "lastName=" + lastName + " ";
        s += "role=" + role + " ";
        s += "email=" + email + " ";
        s += "mailAddress=" + mailAddress + " ";
        s += "phone=" + phone + " ";
        s += "fax=" + fax + " ";
        s += "}";
        return s;
    }
    
    public static List<AttorneyDto> createDto(List<Attorney> attorneys) {
        if (attorneys == null) {
            return null;
        }

        List<AttorneyDto> attorneyDto = new ArrayList<>();
        for (Attorney attorney : attorneys) {
            attorneyDto.add(createDto(attorney));
        }

        return attorneyDto;
    }
    public static AttorneyDto createDto(Attorney attorney) {
        if (attorney == null) {
            return null;
        }
        AttorneyDto attorneyDto = new AttorneyDto();
        attorneyDto.setFirstName(attorney.getFirstName());
        attorneyDto.setId(attorney.getId());
        attorneyDto.setLastName(attorney.getLastName());
        attorneyDto.setAttorneyname(attorney.getAttorneyname());
        attorneyDto.setDisplayName(attorney.getDisplayName());
        attorneyDto.setHashPassword(attorney.getHashPassword());
        attorneyDto.setRole(attorney.getRole());
        attorneyDto.setEmail(attorney.getEmail());
        attorneyDto.setMailAddress(attorney.getMailAddress());
        attorneyDto.setPhone(attorney.getPhone());
        attorneyDto.setFax(attorney.getFax());

        return attorneyDto;
    }

    public static Attorney create(AttorneyDto attorneyDto) {
        if (attorneyDto == null) {
            return null;
        }

        Attorney attorney = new Attorney();
        attorney.setFirstName(attorneyDto.getFirstName());
        attorney.setHashPassword(attorneyDto.getHashPassword());
        attorney.setId(attorneyDto.getId());
        attorney.setLastName(attorneyDto.getLastName());
        attorney.setAttorneyname(attorneyDto.getAttorneyname());
        attorney.setDisplayName(attorneyDto.getDisplayName());
        attorney.setRole(attorneyDto.getRole());
        attorney.setEmail(attorneyDto.getEmail());
        attorney.setMailAddress(attorneyDto.getMailAddress());
        attorney.setPhone(attorneyDto.getPhone());
        attorney.setFax(attorneyDto.getFax());

        return attorney;
    }
}
