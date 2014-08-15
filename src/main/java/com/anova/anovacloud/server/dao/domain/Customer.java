

package com.anova.anovacloud.server.dao.domain;

import java.util.ArrayList;
import java.util.HashSet;
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
    private String refNum;
    private String address;
    private String email;
    private String phone;
    private String fax;
    private String status;

    

	@Load
    private HashSet<Ref<Matter>> matters;

    public Customer() {
        this.name = "";
        this.refNum = "";
        this.address = "";
        this.email = "";
        this.phone = "";
        this.fax= "";
        this.status= "";
    }

    public Customer(String name, String refNum, String address, String email, String phone, String fax, String status) {
        this.name = name;
        this.refNum = refNum;    
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.fax = fax;
        this.status = status;
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
    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    public List<Matter> getMatters() {
        if (this.matters == null) {
            return null;
        }

        List<Matter> rmatters = new ArrayList<>();
        for (Ref<Matter> matter : matters) {
            rmatters.add(Deref.deref(matter));
        }

        return rmatters;
    }

    public void setMatters(List<Matter> matters) {
        if (matters == null) {
            this.matters = null;
        } else {
            for (Matter matter : matters) {
                if (this.matters == null) {
                    this.matters = new HashSet<>();
                }
                this.matters.add(Ref.create(matter));
            }
        }
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
        customerDto.setMatters(Matter.createDto(customer.getMatters()));
        customerDto.setId(customer.getId());
        customerDto.setName(customer.getName());
        customerDto.setRefNum(customer.getRefNum());
        customerDto.setAddress(customer.getAddress());
        customerDto.setEmail(customer.getEmail());
        customerDto.setPhone(customer.getPhone());
        customerDto.setFax(customer.getFax());
        customerDto.setStatus(customer.getStatus());

        return customerDto;
    }

    public static Customer create(CustomerDto customerDto) {
        if (customerDto == null) {
            return null;
        }

        Customer customer = new Customer();
        customer.setMatters(Matter.create(customerDto.getMatters()));
        customer.setId(customerDto.getId());
        customer.setName(customerDto.getName());
        customer.setRefNum(customerDto.getRefNum());
        customer.setAddress(customerDto.getAddress());
        customer.setEmail(customerDto.getEmail());
        customer.setPhone(customerDto.getPhone());
        customer.setFax(customerDto.getFax());
        customer.setStatus(customerDto.getStatus());
        

        return customer;
    }
}
