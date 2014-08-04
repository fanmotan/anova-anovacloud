

package com.anova.anovacloud.client.application.customer;

import javax.inject.Inject;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class CustomerDetailView extends ViewWithUiHandlers<CustomerDetailUiHandlers>
        implements CustomerDetailPresenter.MyView, Editor<CustomerDto> {
    interface Binder extends UiBinder<Widget, CustomerDetailView> {
    }

    interface Driver extends SimpleBeanEditorDriver<CustomerDto, CustomerDetailView> {
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
    CustomerDetailView(Binder uiBinder,
                           Driver driver) {
        this.driver = driver;

        initWidget(uiBinder.createAndBindUi(this));

        driver.initialize(this);

        name.getElement().setAttribute("placeholder", "Customer Name");
        refNum.getElement().setAttribute("placeholder", "Customer Ref Num");
        address.getElement().setAttribute("placeholder", "Customer Address");
        email.getElement().setAttribute("placeholder", "Customer Email");
        phone.getElement().setAttribute("placeholder", "Customer Phone");
        fax.getElement().setAttribute("placeholder", "Customer Fax");
    }

    @Override
    public void edit(CustomerDto customerDto) {
        name.setFocus(true);
        driver.edit(customerDto);
    }

    @Override
    public void getCustomer() {
        getUiHandlers().onSave(driver.flush());
    }
}

