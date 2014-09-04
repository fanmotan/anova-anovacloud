

package com.anova.anovacloud.client.application.customerStatus.ui;

import java.io.IOException;

import com.google.gwt.text.shared.AbstractRenderer;
import com.anova.anovacloud.shared.dto.CustomerStatusDto;

public class CustomerStatusRenderer extends AbstractRenderer<CustomerStatusDto> {
    @Override
    public String render(CustomerStatusDto customerStatusDto) {
        return customerStatusDto == null ? "" : customerStatusDto.getStatusName();
    }
    @Override
    public void render(CustomerStatusDto customerStatusDto, Appendable appendable)
            throws IOException {
        render(customerStatusDto);
    }

}
