

package com.anova.anovacloud.shared.dto;

import java.util.ArrayList;
import java.util.List;

public class CustomerDto extends BaseEntity {
    private String name;
    private String code;
    private String address;
    private String phone;
    private String email;
    private String fax;
    private CustomerStatusDto customerStatus;
	
	public CustomerDto() {
        
    }

    public CustomerDto(String name, String code, String address, String email, String phone, String fax, CustomerStatusDto customerStatus) {
        this.name = name;
        this.code = code;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.fax = fax;
        this.customerStatus = customerStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
    
    public CustomerStatusDto getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(CustomerStatusDto customerStatus) {
		this.customerStatus = customerStatus;
	}
	
	 @Override
	    public String toString() {
	        String s = " { Customer ";
	        s += name + "-"+code; 
	        s += "}";
	        return s;
	    }

}
