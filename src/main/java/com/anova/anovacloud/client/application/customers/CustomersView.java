

package com.anova.anovacloud.client.application.customers;

import java.util.List;

import javax.inject.Inject;

import com.google.gwt.cell.client.ActionCell;
import com.google.gwt.cell.client.ActionCell.Delegate;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.IdentityColumn;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.Range;
import com.google.gwt.view.client.NoSelectionModel;
import com.anova.anovacloud.client.application.customers.CustomersPresenter.MyView;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class CustomersView extends ViewWithUiHandlers<CustomersUiHandlers> implements MyView {
    interface Binder extends UiBinder<Widget, CustomersView> {
    }

    private static final int PAGE_SIZE = 10;
    
    @UiField(provided = true)
    CellTable<CustomerDto> customerGrid;

    @UiField(provided = true)
    SimplePager pager;

    private AsyncDataProvider<CustomerDto> asyncDataProvider;

    @Inject
    CustomersView(Binder uiBinder) {
        initCustomerGrid();

        initWidget(uiBinder.createAndBindUi(this));

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

        asyncDataProvider.addDataDisplay(customerGrid);
    }
    @Override
    public HasData<CustomerDto> getCustomerDisplay() {
        return customerGrid;
    }

    @Override
    public void setCustomersCount(Integer result) {
        asyncDataProvider.updateRowCount(result, true);
    }


    @Override
    public void displayCustomers(int offset, List<CustomerDto> customerDtos) {
    	asyncDataProvider.updateRowData(offset, customerDtos);
    }

  

    @UiHandler("create")
    void onCreateClicked(ClickEvent ignored) {
        getUiHandlers().onCreate();
    }

    private void initCustomerGrid() {
        customerGrid = new CellTable<>();
        customerGrid.setSelectionModel(new NoSelectionModel<CustomerDto>());
        pager = new SimplePager(SimplePager.TextLocation.CENTER);
        pager.setDisplay(customerGrid);
        pager.setPageSize(PAGE_SIZE);

        initDataColumns();
        initActionColumns();
    }

    private void initDataColumns() {
    	/*
        Column<CustomerDto, Number> idColumn = new Column<CustomerDto, Number>(new NumberCell()) {
            @Override
            public Long getValue(CustomerDto customerDto) {
                return customerDto.getId();
            }
        };
*/
        Column<CustomerDto, String> nameColumn = new Column<CustomerDto, String>(new TextCell()) {
            @Override
            public String getValue(CustomerDto customerDto) {
                return customerDto.getName();
            }
        };
        
        Column<CustomerDto, String> refNumColumn = new Column<CustomerDto, String>(new TextCell()) {
            @Override
            public String getValue(CustomerDto customerDto) {
                return customerDto.getRefNum();
            }
        };
        Column<CustomerDto, String> addressColumn = new Column<CustomerDto, String>(new TextCell()) {
            @Override
            public String getValue(CustomerDto customerDto) {
                return customerDto.getAddress();
            }
        };
        Column<CustomerDto, String> emailColumn = new Column<CustomerDto, String>(new TextCell()) {
            @Override
            public String getValue(CustomerDto customerDto) {
                return customerDto.getEmail();
            }
        };
        Column<CustomerDto, String> phoneColumn = new Column<CustomerDto, String>(new TextCell()) {
            @Override
            public String getValue(CustomerDto customerDto) {
                return customerDto.getPhone();
            }
        };
        Column<CustomerDto, String> faxColumn = new Column<CustomerDto, String>(new TextCell()) {
            @Override
            public String getValue(CustomerDto customerDto) {
                return customerDto.getFax();
            }
        };
       // customerGrid.addColumn(idColumn, "ID");
        customerGrid.addColumn(nameColumn, "Name");
        customerGrid.addColumn(refNumColumn, "Ref Num");
        customerGrid.addColumn(addressColumn, "Address");
        customerGrid.addColumn(emailColumn, "Email");
        customerGrid.addColumn(phoneColumn, "Phone");
        customerGrid.addColumn(faxColumn, "Fax");
        
      //  customerGrid.setColumnWidth(idColumn, 50, Unit.PX);
    }

    private void initActionColumns() {
        Cell<CustomerDto> editCell = new ActionCell<>("Edit", new Delegate<CustomerDto>() {
            @Override
            public void execute(CustomerDto customerDto) {
                getUiHandlers().onEdit(customerDto);
            }
        });

        Cell<CustomerDto> deleteCell = new ActionCell<>("Delete", new Delegate<CustomerDto>() {
            @Override
            public void execute(CustomerDto customerDto) {
                Boolean confirm = Window.confirm("Are you sure you want to delete " + customerDto.getName() + "?");

                if (confirm) {
                    getUiHandlers().onDelete(customerDto);
                }
            }
        });

        IdentityColumn<CustomerDto> editColumn = new IdentityColumn<>(editCell);
        IdentityColumn<CustomerDto> deleteColumn = new IdentityColumn<>(deleteCell);

        customerGrid.addColumn(editColumn, "Edit");
        customerGrid.addColumn(deleteColumn, "Delete");

        customerGrid.setColumnWidth(editColumn, 75, Unit.PX);
        customerGrid.setColumnWidth(deleteColumn, 75, Unit.PX);
    }
}
