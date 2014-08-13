

package com.anova.anovacloud.client.application.customers.customer;

import com.anova.anovacloud.shared.dto.CustomerDto;
import com.gwtplatform.mvp.client.UiHandlers;

public interface CustomerUiHandlers extends UiHandlers {

    void onSave(CustomerDto customerDto);

    void onCancel();
    

}
