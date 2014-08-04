

package com.anova.anovacloud.server.dao;

import com.anova.anovacloud.server.dao.domain.Customer;

public class CustomerDao extends BaseDao<Customer> {
    public CustomerDao() {
        super(Customer.class);
    }
}
