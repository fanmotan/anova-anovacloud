

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
    private String firstName;
    private String lastName;
    private String mailAddress;
    private String email;
    private String phone;
    private String fax;

    public Attorney() {
        firstName = "";
        lastName = "";
        displayName = "";
        mailAddress = "";
        email = "";
        phone ="";
        fax = "";
    }
    public Attorney(String displayName, String firstName, String lastName,String mailAddress, String email, String phone, String fax) {
        this.displayName = displayName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mailAddress = mailAddress;
        this.email = email;
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
        s +=  displayName;
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
        attorneyDto.setDisplayName(attorney.getDisplayName());
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
        attorney.setId(attorneyDto.getId());
        attorney.setLastName(attorneyDto.getLastName());
        attorney.setDisplayName(attorneyDto.getDisplayName());
        attorney.setEmail(attorneyDto.getEmail());
        attorney.setMailAddress(attorneyDto.getMailAddress());
        attorney.setPhone(attorneyDto.getPhone());
        attorney.setFax(attorneyDto.getFax());

        return attorney;
    }
}
