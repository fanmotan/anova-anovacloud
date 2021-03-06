

package com.anova.anovacloud.server.dao.domain;

import java.util.ArrayList;
import java.util.List;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Load;
import com.anova.anovacloud.server.dao.objectify.Deref;
import com.anova.anovacloud.shared.dto.BaseEntity;
import com.anova.anovacloud.shared.dto.CustomerDto;

@Index
@Entity
public class Customer extends BaseEntity {
    private String name;
    private String code;
    private String address;
    private String email;
    private String phone;
    private String fax;
    @Load
    private Ref<CustomerStatus> customerStatus;

    public Customer() {
        this.name = "";
        this.code = "";
        this.address = "";
        this.email = "";
        this.phone = "";
        this.fax= "";
    }

    public Customer(String name, String code, String address, String email, String phone, String fax, CustomerStatus customerStatus) {
        this.name = name;
        this.code = code;    
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.fax = fax;
       this.setCustomerStatus(customerStatus);
    }

    public CustomerStatus getCustomerStatus() {
		return Deref.deref(customerStatus);
	}
	public void setCustomerStatus(CustomerStatus customerStatus) {
		if (customerStatus != null) {
            this.customerStatus = Ref.create(customerStatus);
        } else {
            this.customerStatus = null;
        }
	}
   
    @Override
    public void setId(Long id) {
        this.id = id;
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
    

    public static List<CustomerDto> createDto(List<Customer> customers) {
        if (customers == null) {
            return null;
        }

        List<CustomerDto> customerDto = new ArrayList<>();
        for (Customer customer : customers) {
            customerDto.add(createDto(customer));
        }

        return customerDto;
    }

    public static CustomerDto createDto(Customer customer) {
        if (customer == null) {
            return null;
        }

        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setName(customer.getName());
        customerDto.setCode(customer.getCode());
        customerDto.setAddress(customer.getAddress());
        customerDto.setEmail(customer.getEmail());
        customerDto.setPhone(customer.getPhone());
        customerDto.setFax(customer.getFax());
        customerDto.setCustomerStatus(CustomerStatus.createDto(customer.getCustomerStatus()));

        return customerDto;
    }

    public static Customer create(CustomerDto customerDto) {
        if (customerDto == null) {
            return null;
        }

        Customer customer = new Customer();
        customer.setId(customerDto.getId());
        customer.setName(customerDto.getName());
        customer.setCode(customerDto.getCode());
        customer.setAddress(customerDto.getAddress());
        customer.setEmail(customerDto.getEmail());
        customer.setPhone(customerDto.getPhone());
        customer.setFax(customerDto.getFax());
        customer.setCustomerStatus(CustomerStatus.create(customerDto.getCustomerStatus()));
        

        return customer;
    }
}
