

package com.anova.anovacloud.client.application.matters;

import java.util.List;

import javax.inject.Inject;

import com.google.gwt.cell.client.ActionCell;
import com.google.gwt.cell.client.ActionCell.Delegate;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.cell.client.NumberCell;
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
import com.google.gwt.view.client.NoSelectionModel;
import com.google.gwt.view.client.Range;
import com.anova.anovacloud.client.application.matters.MattersPresenter.MyView;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class MattersView extends ViewWithUiHandlers<MattersUiHandlers> implements MyView {
    interface Binder extends UiBinder<Widget, MattersView> {
    }

    private static final int PAGE_SIZE = 10;

    @UiField(provided = true)
    CellTable<MatterDto> matterGrid;

    @UiField(provided = true)
    SimplePager pager;

    private AsyncDataProvider<MatterDto> asyncDataProvider;

    @Inject
    MattersView(Binder uiBinder) {
        initMatterGrid();

        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void initDataProvider() {
        asyncDataProvider = new AsyncDataProvider<MatterDto>() {
            @Override
            protected void onRangeChanged(HasData<MatterDto> display) {
                Range range = display.getVisibleRange();
                getUiHandlers().fetchData(range.getStart(), range.getLength());
            }
        };

        asyncDataProvider.addDataDisplay(matterGrid);
    }

    @Override
    public HasData<MatterDto> getMatterDisplay() {
        return matterGrid;
    }

    @Override
    public void setMattersCount(Integer result) {
        asyncDataProvider.updateRowCount(result, true);
    }

    @Override
    public void displayMatters(int offset, List<MatterDto> matterDtos) {
        asyncDataProvider.updateRowData(offset, matterDtos);
    }

    @UiHandler("create")
    @SuppressWarnings("unused")
    void onCreateClicked(ClickEvent ignored) {
        getUiHandlers().onCreate();
    }

    private void initMatterGrid() {
        matterGrid = new CellTable<>();
        matterGrid.setSelectionModel(new NoSelectionModel<MatterDto>());

        pager = new SimplePager(SimplePager.TextLocation.CENTER);
        pager.setDisplay(matterGrid);
        pager.setPageSize(PAGE_SIZE);

        initDataColumns();
        initActionColumns();
    }

    private void initDataColumns() {
    	/*
        Column<MatterDto, Number> idColumn = new Column<MatterDto, Number>(new NumberCell()) {
            @Override
            public Long getValue(MatterDto matterDto) {
                return matterDto.getId();
            }
        };
        */

        Column<MatterDto, String> customerColumn = new Column<MatterDto, String>(new TextCell()) {
            @Override
            public String getValue(MatterDto matterDto) {
                CustomerDto customer = matterDto.getCustomer();
                return customer == null ? "" : customer.getName();
            }
        };

        Column<MatterDto, String> matterNumColumn = new Column<MatterDto, String>(new TextCell()) {
            @Override
            public String getValue(MatterDto matterDto) {
                return matterDto.getMatterNum();
            }
        };
        Column<MatterDto, String> matterSerialNumColumn = new Column<MatterDto, String>(new TextCell()) {
            @Override
            public String getValue(MatterDto matterDto) {
                return matterDto.getMatterSerialNum();
            }
        };
        Column<MatterDto, String> titleColumn = new Column<MatterDto, String>(new TextCell()) {
            @Override
            public String getValue(MatterDto matterDto) {
                return matterDto.getMatterProperties().getMatterTitle();
            }
        };
        Column<MatterDto, String> statusColumn = new Column<MatterDto, String>(new TextCell()) {
            @Override
            public String getValue(MatterDto matterDto) {
                return matterDto.getMatterProperties().getStatus();
            }
        };
    //    matterGrid.addColumn(idColumn, "ID");
        matterGrid.addColumn(customerColumn, "Customer");
        matterGrid.addColumn(matterNumColumn, "Matter No");
        matterGrid.addColumn(matterSerialNumColumn, "Matter Serial No");
        matterGrid.addColumn(titleColumn, "Title");
        matterGrid.addColumn(statusColumn, "Status");
     //   matterGrid.setColumnWidth(idColumn, 50, Unit.PX);
    }

    private void initActionColumns() {
        Cell<MatterDto> editCell = new ActionCell<>("Edit", new Delegate<MatterDto>() {
            @Override
            public void execute(MatterDto matterDto) {
                getUiHandlers().onEdit(matterDto);
            }
        });

        Cell<MatterDto> deleteCell = new ActionCell<>("Delete", new Delegate<MatterDto>() {
            @Override
            public void execute(MatterDto matterDto) {
                Boolean confirm = Window.confirm("Are you sure you want to delete " + matterDto.getMatterNum()+"."+matterDto.getMatterSerialNum() + "?");

                if (confirm) {
                    getUiHandlers().onDelete(matterDto);
                }
            }
        });

        IdentityColumn<MatterDto> editColumn = new IdentityColumn<>(editCell);
        IdentityColumn<MatterDto> deleteColumn = new IdentityColumn<>(deleteCell);

        matterGrid.addColumn(editColumn, "Edit");
        matterGrid.addColumn(deleteColumn, "Delete");

        matterGrid.setColumnWidth(editColumn, 75, Unit.PX);
        matterGrid.setColumnWidth(deleteColumn, 75, Unit.PX);
    }
}
