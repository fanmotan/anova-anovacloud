

package com.anova.anovacloud.client.application.attorney;

import java.util.Collections;
import java.util.Comparator;
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
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.NoSelectionModel;
import com.anova.anovacloud.client.application.attorney.AttorneyPresenter.MyView;
import com.anova.anovacloud.shared.dto.AttorneyDto;
import com.anova.anovacloud.shared.dto.AttorneyStatusDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class AttorneyView extends ViewWithUiHandlers<AttorneyUiHandlers> implements MyView {
    interface Binder extends UiBinder<Widget, AttorneyView> {
    }

    @UiField(provided = true)
    CellTable<AttorneyDto> attorneyGrid;

    private final ListDataProvider<AttorneyDto> attorneyDataProvider;

    @Inject
    AttorneyView(Binder uiBinder) {
        initAttorneyGrid();

        initWidget(uiBinder.createAndBindUi(this));

        attorneyDataProvider = new ListDataProvider<>();
        attorneyDataProvider.addDataDisplay(attorneyGrid);
    }

    @Override
    public void displayAttorneys(List<AttorneyDto> attorneyDtos) {
    	Collections.sort(attorneyDtos, new Comparator<AttorneyDto>() {
		    public int compare(AttorneyDto c1, AttorneyDto c2) {
		        return c1.getDisplayName().compareTo(c2.getDisplayName());
		    }
		});
        attorneyDataProvider.getList().clear();
        attorneyDataProvider.getList().addAll(attorneyDtos);
    }

    @Override
    public void addAttorney(AttorneyDto attorneyDto) {
        attorneyDataProvider.getList().add(attorneyDto);
    }
/*
    @Override
    public void removeAttorney(AttorneyDto attorneyDto) {
        attorneyDataProvider.getList().remove(attorneyDto);
    }
*/
    @Override
    public void replaceAttorney(AttorneyDto oldAttorney, AttorneyDto newAttorney) {
        List<AttorneyDto> attorneyDtos = attorneyDataProvider.getList();
        int index = attorneyDtos.indexOf(oldAttorney);

        attorneyDtos.add(index, newAttorney);
        attorneyDtos.remove(index + 1);
    }

    @UiHandler("create")
    void onCreateClicked(ClickEvent ignored) {
        getUiHandlers().onCreate();
    }

    private void initAttorneyGrid() {
        attorneyGrid = new CellTable<>();
        attorneyGrid.setSelectionModel(new NoSelectionModel<AttorneyDto>());

        initDataColumns();
        initActionColumns();
    }

    private void initDataColumns() {
    	/*
        Column<AttorneyDto, Number> idColumn = new Column<AttorneyDto, Number>(new NumberCell()) {
            @Override
            public Long getValue(AttorneyDto attorneyDto) {
                return attorneyDto.getId();
            }
        };
*/
        Column<AttorneyDto, String> displayNameColumn = new Column<AttorneyDto, String>(new TextCell()) {
            @Override
            public String getValue(AttorneyDto attorneyDto) {
                return attorneyDto.getDisplayName();
            }
        };
        
        Column<AttorneyDto, String> firstNameColumn = new Column<AttorneyDto, String>(new TextCell()) {
            @Override
            public String getValue(AttorneyDto attorneyDto) {
                return attorneyDto.getFirstName();
            }
        };
        Column<AttorneyDto, String> lastNameColumn = new Column<AttorneyDto, String>(new TextCell()) {
            @Override
            public String getValue(AttorneyDto attorneyDto) {
                return attorneyDto.getLastName();
            }
        };
        Column<AttorneyDto, String> mailAddressColumn = new Column<AttorneyDto, String>(new TextCell()) {
            @Override
            public String getValue(AttorneyDto attorneyDto) {
                return attorneyDto.getMailAddress();
            }
        };
        Column<AttorneyDto, String> emailColumn = new Column<AttorneyDto, String>(new TextCell()) {
            @Override
            public String getValue(AttorneyDto attorneyDto) {
                return attorneyDto.getEmail();
            }
        };
        Column<AttorneyDto, String> phoneColumn = new Column<AttorneyDto, String>(new TextCell()) {
            @Override
            public String getValue(AttorneyDto attorneyDto) {
                return attorneyDto.getPhone();
            }
        };
        Column<AttorneyDto, String> faxColumn = new Column<AttorneyDto, String>(new TextCell()) {
            @Override
            public String getValue(AttorneyDto attorneyDto) {
                return attorneyDto.getFax();
            }
        };
        Column<AttorneyDto, String> statusColumn = new Column<AttorneyDto, String>(new TextCell()) {
            @Override
            public String getValue(AttorneyDto attorneyDto) {
            	AttorneyStatusDto attorneyStatus = attorneyDto.getAttorneyStatus();
                return attorneyStatus == null ? "" :attorneyStatus.getStatusName();
            }
        };
       // attorneyGrid.addColumn(idColumn, "ID");
        attorneyGrid.addColumn(displayNameColumn, "Display Name");
        attorneyGrid.addColumn(firstNameColumn, "First Name");
        attorneyGrid.addColumn(lastNameColumn, "Last Name");
        attorneyGrid.addColumn(emailColumn, "Email");
        attorneyGrid.addColumn(mailAddressColumn, "Mailing Address");
        attorneyGrid.addColumn(phoneColumn, "Phone");
        attorneyGrid.addColumn(faxColumn, "Fax");
        attorneyGrid.addColumn(statusColumn, "Status");
        
        //attorneyGrid.setColumnWidth(idColumn, 50, Unit.PX);
    }

    private void initActionColumns() {
        Cell<AttorneyDto> editCell = new ActionCell<>("Edit", new Delegate<AttorneyDto>() {
            @Override
            public void execute(AttorneyDto attorneyDto) {
                getUiHandlers().onEdit(attorneyDto);
            }
        });

        /*
        Cell<AttorneyDto> deleteCell = new ActionCell<>("Delete", new Delegate<AttorneyDto>() {
            @Override
            public void execute(AttorneyDto attorneyDto) {
                Boolean confirm = Window.confirm("Are you sure you want to delete " + attorneyDto.getDisplayName() + "?");

                if (confirm) {
                    getUiHandlers().onDelete(attorneyDto);
                }
            }
        });
*/
        IdentityColumn<AttorneyDto> editColumn = new IdentityColumn<>(editCell);
   //     IdentityColumn<AttorneyDto> deleteColumn = new IdentityColumn<>(deleteCell);

        attorneyGrid.addColumn(editColumn, "Edit");
      //  attorneyGrid.addColumn(deleteColumn, "Delete");

        attorneyGrid.setColumnWidth(editColumn, 75, Unit.PX);
     //   attorneyGrid.setColumnWidth(deleteColumn, 75, Unit.PX);
    }
}
