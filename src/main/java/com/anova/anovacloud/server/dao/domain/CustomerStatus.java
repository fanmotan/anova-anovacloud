

package com.anova.anovacloud.server.dao.domain;

import java.util.ArrayList;
import java.util.List;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;
import com.anova.anovacloud.shared.dto.BaseEntity;
import com.anova.anovacloud.shared.dto.CustomerStatusDto;

@Index
@Entity
public class CustomerStatus extends BaseEntity {
    private String statusName;
 

	public CustomerStatus() {
        this.statusName = "";
    }

    public CustomerStatus(String statusName) {
        this.statusName = statusName;
    }

    public static List<CustomerStatusDto> createDto(List<CustomerStatus> customerStatuss) {
        if (customerStatuss == null) {
            return null;
        }

        List<CustomerStatusDto> customerStatussDto = new ArrayList<>();
        for (CustomerStatus customerStatus : customerStatuss) {
            customerStatussDto.add(createDto(customerStatus));
        }

        return customerStatussDto;
    }

    public static CustomerStatusDto createDto(CustomerStatus customerStatus) {
        if (customerStatus == null) {
            return null;
        }

        CustomerStatusDto customerStatusDto = new CustomerStatusDto();
      
        customerStatusDto.setId(customerStatus.getId());
        customerStatusDto.setStatusName(customerStatus.getStatusName());

        return customerStatusDto;
    }

    public static List<CustomerStatus> create(List<CustomerStatusDto> customerStatusDtos) {
        if (customerStatusDtos == null) {
            return null;
        }

        List<CustomerStatus> customerStatuss = new ArrayList<>();
        for (CustomerStatusDto customerStatusDto : customerStatusDtos) {
            customerStatuss.add(create(customerStatusDto));
        }

        return customerStatuss;
    }

    public static CustomerStatus create(CustomerStatusDto customerStatusDto) {
        if (customerStatusDto == null) {
            return null;
        }

        CustomerStatus customerStatus = new CustomerStatus();
        customerStatus.setId(customerStatusDto.getId());
        customerStatus.setStatusName(customerStatusDto.getStatusName());

        return customerStatus;
    }

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
   
}
