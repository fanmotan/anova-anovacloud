

package com.anova.anovacloud.client.application.customer;

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
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.NoSelectionModel;
import com.anova.anovacloud.client.application.customer.CustomerPresenter.MyView;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.anova.anovacloud.shared.dto.CustomerStatusDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class CustomerView extends ViewWithUiHandlers<CustomerUiHandlers> implements MyView {
    interface Binder extends UiBinder<Widget, CustomerView> {
    }

    @UiField(provided = true)
    CellTable<CustomerDto> customerGrid;

    private final ListDataProvider<CustomerDto> customerDataProvider;

    @Inject
    CustomerView(Binder uiBinder) {
        initCustomerGrid();

        initWidget(uiBinder.createAndBindUi(this));

        customerDataProvider = new ListDataProvider<>();
        customerDataProvider.addDataDisplay(customerGrid);
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

    @UiHandler("create")
    void onCreateClicked(ClickEvent ignored) {
        getUiHandlers().onCreate();
    }

    private void initCustomerGrid() {
        customerGrid = new CellTable<>();
        customerGrid.setSelectionModel(new NoSelectionModel<CustomerDto>());

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
        
        Column<CustomerDto, String> codeColumn = new Column<CustomerDto, String>(new TextCell()) {
            @Override
            public String getValue(CustomerDto customerDto) {
                return customerDto.getCode();
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
        Column<CustomerDto, String> statusColumn = new Column<CustomerDto, String>(new TextCell()) {
            @Override
            public String getValue(CustomerDto customerDto) {
            	CustomerStatusDto customerStatus = customerDto.getCustomerStatus();
                return customerStatus == null ? "" :customerStatus.getStatusName();
            }
        };
       // customerGrid.addColumn(idColumn, "ID");
        customerGrid.addColumn(nameColumn, "Name");
        customerGrid.addColumn(codeColumn, "Code");
        customerGrid.addColumn(addressColumn, "Address");
        customerGrid.addColumn(emailColumn, "Email");
        customerGrid.addColumn(phoneColumn, "Phone");
        customerGrid.addColumn(faxColumn, "Fax");
        customerGrid.addColumn(statusColumn, "Status");
        
      //  customerGrid.setColumnWidth(idColumn, 50, Unit.PX);
    }

    private void initActionColumns() {
        Cell<CustomerDto> editCell = new ActionCell<>("Edit", new Delegate<CustomerDto>() {
            @Override
            public void execute(CustomerDto customerDto) {
                getUiHandlers().onEdit(customerDto);
            }
        });
/*
        Cell<CustomerDto> deleteCell = new ActionCell<>("Delete", new Delegate<CustomerDto>() {
            @Override
            public void execute(CustomerDto customerDto) {
                Boolean confirm = Window.confirm("Are you sure you want to delete " + customerDto.getName() + "?");

                if (confirm) {
                    getUiHandlers().onDelete(customerDto);
                }
            }
        });
        */
        

        IdentityColumn<CustomerDto> editColumn = new IdentityColumn<>(editCell);
      //  IdentityColumn<CustomerDto> deleteColumn = new IdentityColumn<>(deleteCell);

        customerGrid.addColumn(editColumn, "Edit");
     //   customerGrid.addColumn(deleteColumn, "Delete");

        customerGrid.setColumnWidth(editColumn, 75, Unit.PX);
     //   customerGrid.setColumnWidth(deleteColumn, 75, Unit.PX);
    }
}
