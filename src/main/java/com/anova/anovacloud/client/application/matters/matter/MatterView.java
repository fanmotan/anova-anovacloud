

package com.anova.anovacloud.client.application.matters.matter;

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
import com.anova.anovacloud.client.application.customers.customer.CustomerRenderer;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class MatterView extends ViewWithUiHandlers<MatterUiHandlers> implements MyView, Editor<MatterDto> {
    interface Binder extends UiBinder<Widget, MatterView> {
    }

    interface Driver extends SimpleBeanEditorDriver<MatterDto, MatterView> {
    }

    @UiField
    TextBox matterNum;
    @UiField
    TextBox matterSerialNum;
    @UiField(provided = true)
    ValueListBox<CustomerDto> customer;
    @UiField
    MatterPropertiesEditor matterProperties;

    private final Driver driver;

    @Inject
    MatterView(Binder uiBinder,
            Driver driver) {
        customer = new ValueListBox<>(new CustomerRenderer());
        this.driver = driver;

        initWidget(uiBinder.createAndBindUi(this));

        driver.initialize(this);
    }

    @Override
    public void edit(MatterDto matterDto) {
        if (matterDto.getCustomer() == null) {
            matterDto.setCustomer(customer.getValue());
        }

        driver.edit(matterDto);
    }

    @Override
    public void setAllowedCustomers(List<CustomerDto> customerDtos) {
        customer.setValue(customerDtos.isEmpty() ? null : customerDtos.get(0));
        customer.setAcceptableValues(customerDtos);
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
