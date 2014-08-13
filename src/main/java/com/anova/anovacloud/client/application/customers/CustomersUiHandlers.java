

package com.anova.anovacloud.client.application.customers;

import com.anova.anovacloud.shared.dto.CustomerDto;
import com.gwtplatform.mvp.client.UiHandlers;

public interface CustomersUiHandlers extends UiHandlers {
	void onEdit(CustomerDto customerDto);

    void onDelete(CustomerDto customerDto);

    void onCreate();

    void fetchData(int offset, int limit);
}
