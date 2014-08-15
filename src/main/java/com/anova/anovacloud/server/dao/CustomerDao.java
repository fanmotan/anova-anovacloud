

package com.anova.anovacloud.server.dao;

import java.util.List;

import com.anova.anovacloud.server.dao.domain.Customer;


public class CustomerDao extends BaseDao<Customer> {
    public CustomerDao() {
        super(Customer.class);
    }
    /*	
    public List<Customer> getActiveCustomers() {
    	
       List<Customer> customers = ofy().query(Customer.class).filter("status", "active").order("name").list();
       return customers;
    }
    */
}
