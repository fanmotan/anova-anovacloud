

package com.anova.anovacloud.client.application.matters.matter;

import java.util.ArrayList;
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
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.Widget;
import com.anova.anovacloud.client.application.matters.matter.MatterPresenter.MyView;
import com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor;
import com.anova.anovacloud.client.application.caseStatus.ui.CaseStatusRenderer;
import com.anova.anovacloud.client.application.customer.ui.CustomerRenderer;
import com.anova.anovacloud.shared.dto.CaseStatusDto;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class MatterView extends ViewWithUiHandlers<MatterUiHandlers> implements MyView, Editor<MatterDto> {
    interface Binder extends UiBinder<Widget, MatterView> {
    }

    interface Driver extends SimpleBeanEditorDriver<MatterDto, MatterView> {
    }

    @UiField
    TextBox caseNum;
    @UiField
    TextBox clientRef;
    @UiField(provided = true)
    ValueListBox<CustomerDto> customer = null;
    @UiField(provided = true)
    ValueListBox<CaseStatusDto> caseStatus = null;
    @UiField
    MatterPropertiesEditor matterProperties;

    private final Driver driver;

    @Inject
    MatterView(Binder uiBinder,
            Driver driver) {
        customer = new ValueListBox<>(new CustomerRenderer());
        caseStatus = new ValueListBox<>(new CaseStatusRenderer());
        this.driver = driver;
        initWidget(uiBinder.createAndBindUi(this));
        driver.initialize(this);
    }

    @Override
    public void edit(MatterDto matterDto) {
        if (matterDto.getCustomer() == null) {
            matterDto.setCustomer(customer.getValue());
        }
        if (matterDto.getCaseStatus() == null) {
            matterDto.setCaseStatus(caseStatus.getValue());
        }

        driver.edit(matterDto);
    }

    @Override
    public void setAllowedCustomers(List<CustomerDto> customerDtos) {
    	List <CustomerDto> results = new ArrayList<>();
		for (CustomerDto customerDto : customerDtos){
			if (customerDto.getCustomerStatus()!= null && customerDto.getCustomerStatus().getStatusName().equalsIgnoreCase("active"))
			{
				results.add(customerDto);
			}
		}
		Collections.sort(results, new Comparator<CustomerDto>() {
		    public int compare(CustomerDto c1, CustomerDto c2) {
		        return c1.getName().compareTo(c2.getName());
		    }
		});
        customer.setValue(results.isEmpty() ? null : results.get(0));
        customer.setAcceptableValues(results);
    }
    
    @Override
    public void setAllowedCaseStatuss(List<CaseStatusDto> caseStatusDtos) {
    	Collections.sort(caseStatusDtos, new Comparator<CaseStatusDto>() {
		    public int compare(CaseStatusDto c1, CaseStatusDto c2) {
		        return c1.getStatusValue().compareTo(c2.getStatusValue());
		    }
		});
    	caseStatus.setValue(caseStatusDtos.isEmpty() ? null : caseStatusDtos.get(0));
    	caseStatus.setAcceptableValues(caseStatusDtos);
    }

    @Override
    public void resetFields(MatterDto matterDto) {
        driver.edit(matterDto);
    }

    @Override
    public void getMatter() {
    }

    @UiHandler("save")
    void onSaveClicked(ClickEvent ignored) {
        getUiHandlers().onSave(driver.flush());
    }

    @UiHandler("close")
    void onCancelClicked(ClickEvent ignored) {
        getUiHandlers().onCancel();
    }
}
