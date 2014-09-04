

package com.anova.anovacloud.server.dao;

import java.util.ArrayList;
import java.util.List;

import com.anova.anovacloud.server.dao.domain.Customer;
import com.anova.anovacloud.shared.dto.CustomerDto;


public class CustomerDao extends BaseDao<Customer> {
    public CustomerDao() {
        super(Customer.class);
    }
    	/*
    public List<Customer> getActiveCustomers() {
    	
       List<Customer> customers = ofy().query(Customer.class).filter("customerStatus.statusName =", "active").order("name").list();
       return customers;
    }
   */
    public List <CustomerDto> getActiveCustomers(List<CustomerDto> customerDtos)
	{
		List <CustomerDto> results = new ArrayList<>();
		for (CustomerDto customerDto : customerDtos){
			String status = customerDto.getCustomerStatus().getStatusName();
			if (status != null && status.equalsIgnoreCase("active"))
			{
				
						results.add (customerDto);
			}
					
		}

		return results;

}
    
}
