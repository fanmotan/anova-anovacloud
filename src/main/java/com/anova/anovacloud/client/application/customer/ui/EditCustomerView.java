package com.anova.anovacloud.client.application.customer.ui;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.inject.Inject;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.customer.ui.EditCustomerPresenter.MyView;
import com.anova.anovacloud.client.application.customerStatus.ui.CustomerStatusRenderer;
import com.anova.anovacloud.shared.dto.AttorneyStatusDto;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.anova.anovacloud.shared.dto.CustomerStatusDto;
import com.gwtplatform.mvp.client.PopupViewWithUiHandlers;

public class EditCustomerView extends PopupViewWithUiHandlers<EditCustomerUiHandlers> implements MyView,
        Editor<CustomerDto> {
    interface Binder extends UiBinder<Widget, EditCustomerView> {
    }

    interface Driver extends SimpleBeanEditorDriver<CustomerDto, EditCustomerView> {
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
    EditCustomerView(Binder uiBinder,
                         Driver driver,
                         EventBus eventBus) {
        super(eventBus);
        customerStatus = new ValueListBox<>(new CustomerStatusRenderer());
        this.driver = driver;
        initWidget(uiBinder.createAndBindUi(this));
        driver.initialize(this);
    }

    @Override
    public void edit(CustomerDto customerDto) {
    	if (customerDto.getCustomerStatus() == null) {
            customerDto.setCustomerStatus(customerStatus.getValue());
        }
    
    //	driver.flush();
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
    
    @UiHandler("save")
    void onSaveClicked(ClickEvent ignored) {
        getUiHandlers().onSave(driver.flush());
    }

    @UiHandler("close")
    void onCloseClicked(ClickEvent ignored) {
        getUiHandlers().onCancel();
    }
}
