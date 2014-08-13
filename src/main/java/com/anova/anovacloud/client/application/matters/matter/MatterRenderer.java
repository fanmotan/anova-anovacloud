
package com.anova.anovacloud.client.application.matters.matter;

import com.google.gwt.text.shared.AbstractRenderer;
import com.anova.anovacloud.client.application.customers.customer.CustomerRenderer;
import com.anova.anovacloud.shared.dto.MatterDto;

public class MatterRenderer extends AbstractRenderer<MatterDto> {
    @Override
    public String render(MatterDto matterDto) {
        if (matterDto == null) {
            return "";
        }

        CustomerRenderer customerRenderer = new CustomerRenderer();
        String customer = customerRenderer.render(matterDto.getCustomer());

        return customer + " " + matterDto.getMatterNum() + " "+matterDto.getMatterSerialNum();
    }
}
