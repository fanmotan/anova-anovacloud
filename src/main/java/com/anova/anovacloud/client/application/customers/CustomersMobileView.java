

package com.anova.anovacloud.client.application.customers;

import java.util.List;
import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.Range;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.anova.anovacloud.client.application.customers.CustomersPresenter.MyView;
import com.anova.anovacloud.client.application.customers.renderer.CustomerCell;
import com.anova.anovacloud.client.application.ui.ShowMorePagerPanel;
import com.anova.anovacloud.client.resources.MobileDataListStyle;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class CustomersMobileView extends ViewWithUiHandlers<CustomersUiHandlers> implements MyView {
    interface Binder extends UiBinder<Widget, CustomersMobileView> {
    }

    private static final int PAGE_SIZE = 20;

    @UiField(provided = true)
    ShowMorePagerPanel pagerPanel;

    private CellList<CustomerDto> customerList;
    private AsyncDataProvider<CustomerDto> asyncDataProvider;
    private SingleSelectionModel<CustomerDto> selectionModel;

    @Inject
    CustomersMobileView(Binder uiBinder,
                   CustomerCell customerCell,
                   MobileDataListStyle mobileDataListStyle) {
        pagerPanel = new ShowMorePagerPanel(PAGE_SIZE);
        customerList = new CellList<>(customerCell, mobileDataListStyle);
        selectionModel = new SingleSelectionModel<>();

        initWidget(uiBinder.createAndBindUi(this));

        pagerPanel.setDisplay(customerList);
        customerList.setSelectionModel(selectionModel);

        selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
            @Override
            public void onSelectionChange(SelectionChangeEvent event) {
                getUiHandlers().onEdit(selectionModel.getSelectedObject());
            }
        });
    }

    @Override
    public void initDataProvider() {
        asyncDataProvider = new AsyncDataProvider<CustomerDto>() {
            @Override
            protected void onRangeChanged(HasData<CustomerDto> display) {
                Range range = display.getVisibleRange();
                getUiHandlers().fetchData(range.getStart(), range.getLength());
            }
        };

        asyncDataProvider.addDataDisplay(customerList);
    }

    @Override
    public HasData<CustomerDto> getCustomerDisplay() {
        return customerList;
    }

    @Override
    public void setCustomersCount(Integer result) {
        asyncDataProvider.updateRowCount(result, true);
    }

    @Override
    public void displayCustomers(int offset, List<CustomerDto> customerDtos) {
        asyncDataProvider.updateRowData(offset, customerDtos);
    }
}
