package com.anova.anovacloud.client.application.customer;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.inject.Inject;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.Widget;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.anova.anovacloud.shared.dto.CustomerStatusDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import com.anova.anovacloud.client.application.customerStatus.ui.CustomerStatusRenderer;

public class CustomerDetailView extends ViewWithUiHandlers<CustomerDetailUiHandlers>
        implements CustomerDetailPresenter.MyView, Editor<CustomerDto> {
    interface Binder extends UiBinder<Widget, CustomerDetailView> {
    }

    interface Driver extends SimpleBeanEditorDriver<CustomerDto, CustomerDetailView> {
    }

    @UiField
    TextBox name;
    @UiField
    TextBox code;
    @UiField
    TextArea address;
    @UiField
    TextBox email;
    @UiField
    TextBox phone;
    @UiField
    TextBox fax;
    @UiField(provided = true)
    ValueListBox<CustomerStatusDto> customerStatus;

    private final Driver driver;

    @Inject
    CustomerDetailView(Binder uiBinder,
                           Driver driver) {
        this.driver = driver;

        initWidget(uiBinder.createAndBindUi(this));
        customerStatus = new ValueListBox<>(new CustomerStatusRenderer());
        driver.initialize(this);

        name.getElement().setAttribute("placeholder", "Customer Name");
        code.getElement().setAttribute("placeholder", "Customer Ref Num");
        address.getElement().setAttribute("placeholder", "Customer Address");
        email.getElement().setAttribute("placeholder", "Customer Email");
        phone.getElement().setAttribute("placeholder", "Customer Phone");
        fax.getElement().setAttribute("placeholder", "Customer Fax");
    }

    @Override
    public void edit(CustomerDto customerDto) {
    	if (customerDto.getCustomerStatus() == null) {
            customerDto.setCustomerStatus(customerStatus.getValue());
        }
        name.setFocus(true);
        driver.edit(customerDto);
    }
    
    @Override
    public void setAllowedCustomerStatuss(List<CustomerStatusDto> customerStatusDtos) {
    	Collections.sort(customerStatusDtos, new Comparator<CustomerStatusDto>() {
		    public int compare(CustomerStatusDto c1, CustomerStatusDto c2) {
		        return c1.getStatusValue().compareTo(c2.getStatusValue());
		    }
		});
        customerStatus.setValue(customerStatusDtos.isEmpty() ? null : customerStatusDtos.get(0));
        customerStatus.setAcceptableValues(customerStatusDtos);
    }

    @Override
    public void getCustomer() {
        getUiHandlers().onSave(driver.flush());
    }
}

