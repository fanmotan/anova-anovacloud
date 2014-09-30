package com.anova.anovacloud.client.application.customer.ui;

import com.anova.anovacloud.shared.dto.CustomerDto;
import com.gwtplatform.mvp.client.UiHandlers;

public interface EditCustomerUiHandlers extends UiHandlers {
    void createNew();

    void edit(CustomerDto customerDto);

    void onSave(CustomerDto customerDto);

    void onCancel();
}
