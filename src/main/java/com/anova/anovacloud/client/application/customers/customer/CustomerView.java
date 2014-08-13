

package com.anova.anovacloud.client.application.customers.customer;

import javax.inject.Inject;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.anova.anovacloud.client.application.customers.customer.CustomerPresenter.MyView;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class CustomerView extends ViewWithUiHandlers<CustomerUiHandlers> implements MyView,
        Editor<CustomerDto> {
    interface Binder extends UiBinder<Widget, CustomerView> {
    }

    interface Driver extends SimpleBeanEditorDriver<CustomerDto, CustomerView> {
    }

    @UiField
    TextBox name;
    @UiField
    TextBox refNum;
    @UiField
    TextBox address;
    @UiField
    TextBox email;
    @UiField
    TextBox phone;
    @UiField
    TextBox fax;

    private final Driver driver;

    @Inject
    CustomerView(Binder uiBinder, Driver driver) {
    	this.driver = driver;
        initWidget(uiBinder.createAndBindUi(this));

        driver.initialize(this);
    }

    @Override
    public void edit(CustomerDto customerDto) {
        driver.edit(customerDto);
    }
    
    @Override
    public void resetFields(CustomerDto customerDto) {
        driver.edit(customerDto);
    }

    @Override
    public void getCustomer() {
    }

    @UiHandler("save")
    void onSaveClicked(ClickEvent ignored) {
        getUiHandlers().onSave(driver.flush());
    }

    @UiHandler("close")
    void onCloseClicked(ClickEvent ignored) {
        getUiHandlers().onCancel();
    }

	
}
