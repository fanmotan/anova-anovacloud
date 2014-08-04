

package com.anova.anovacloud.shared.dto;

import java.util.ArrayList;
import java.util.List;

public class CustomerDto extends BaseEntity {
    private String name;
    private String refNum;
    private String address;
    private String phone;
    private String email;
    private String fax;
    
    private List<MatterDto> matters;

    public CustomerDto() {
        this.name = "";
        this.refNum = "";
        this.address = "";
        this.email = "";
        this.phone = "";
        this.fax = "";
        this.matters = new ArrayList<>();
        
    }

    public CustomerDto(String name, String refNum, String address, String email, String phone, String fax) {
        this.name = name;
        this.refNum = refNum;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.fax = fax;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getRefNum() {
        return refNum;
    }

    public void setRefNum(String refNum) {
        this.refNum = refNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
    
    public List<MatterDto> getMatters() {
        return matters;
    }

    public void setMatters(List<MatterDto> matters) {
        this.matters = matters;
    }
}
