

package com.anova.anovacloud.client.application.customer.ui;

import com.google.gwt.text.shared.AbstractRenderer;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.anova.anovacloud.shared.dto.MatterDto;

public class CustomerRenderer extends AbstractRenderer<CustomerDto> {
    @Override
    public String render(CustomerDto customerDto) {
    	if (customerDto == null){
    		return "";
    	}
        return customerDto.getName()+"-"+customerDto.getRefNum();
    }
    
}
