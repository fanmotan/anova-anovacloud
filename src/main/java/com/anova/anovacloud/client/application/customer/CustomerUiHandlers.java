

package com.anova.anovacloud.client.application.customer;

import com.anova.anovacloud.shared.dto.CustomerDto;
import com.gwtplatform.mvp.client.UiHandlers;

public interface CustomerUiHandlers extends UiHandlers {
    void onDetail(CustomerDto customerDto);

    void onEdit(CustomerDto customerDto);

   // void onDelete(CustomerDto customerDto);

    void onCreate();
}
