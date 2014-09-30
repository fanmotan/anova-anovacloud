package com.anova.anovacloud.client.application.customer;

import java.util.List;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.anova.anovacloud.client.application.customer.CustomerPresenter.MyView;
import com.anova.anovacloud.client.application.customer.renderer.CustomerCell;
import com.anova.anovacloud.client.resources.MobileDataListStyle;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class CustomerMobileView extends ViewWithUiHandlers<CustomerUiHandlers> implements MyView {
    interface Binder extends UiBinder<Widget, CustomerMobileView> {
    }

    @UiField(provided = true)
    CellList<CustomerDto> customerList;

    private final ListDataProvider<CustomerDto> customerDataProvider;
    private final SingleSelectionModel<CustomerDto> selectionModel;

    @Inject
    CustomerMobileView(Binder uiBinder,
                           CustomerCell customerCell,
                           MobileDataListStyle mobileDataListStyle) {
        customerList = new CellList<>(customerCell, mobileDataListStyle);

        initWidget(uiBinder.createAndBindUi(this));

        customerDataProvider = new ListDataProvider<>();
        customerDataProvider.addDataDisplay(customerList);
        selectionModel = new SingleSelectionModel<>();
        customerList.setSelectionModel(selectionModel);

        selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
            @Override
            public void onSelectionChange(SelectionChangeEvent event) {
                getUiHandlers().onDetail(selectionModel.getSelectedObject());
            }
        });
    }

    @Override
    public void displayCustomers(List<CustomerDto> customerDtos) {
        customerDataProvider.getList().clear();
        customerDataProvider.getList().addAll(customerDtos);
    }

    @Override
    public void addCustomer(CustomerDto customerDto) {
        customerDataProvider.getList().add(customerDto);
    }
/*
    @Override
    public void removeCustomer(CustomerDto customerDto) {
        customerDataProvider.getList().remove(customerDto);
    }
*/
    @Override
    public void replaceCustomer(CustomerDto oldCustomer, CustomerDto newCustomer) {
        List<CustomerDto> customerDtos = customerDataProvider.getList();
        int index = customerDtos.indexOf(oldCustomer);

        customerDtos.add(index, newCustomer);
        customerDtos.remove(index + 1);
    }
}
