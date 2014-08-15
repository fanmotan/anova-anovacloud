

package com.anova.anovacloud.client.application.customer;

import com.anova.anovacloud.shared.dto.CustomerDto;
import com.gwtplatform.mvp.client.UiHandlers;

public interface CustomerDetailUiHandlers extends UiHandlers {
    void onSave(CustomerDto customerDto);
}
