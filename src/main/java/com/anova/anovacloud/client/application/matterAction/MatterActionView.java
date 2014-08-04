

package com.anova.anovacloud.client.application.matterAction;

import java.util.List;

import javax.inject.Inject;

import com.google.gwt.cell.client.ActionCell;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.IdentityColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.NoSelectionModel;
import com.anova.anovacloud.client.application.matterAction.ui.MatterActionColumnsDefinition;
import com.anova.anovacloud.shared.dto.MatterActionDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class MatterActionView extends ViewWithUiHandlers<MatterActionUiHandlers> implements MatterActionPresenter.MyView {
    interface Binder extends UiBinder<Widget, MatterActionView> {
    }

    @UiField
    Button create;
    @UiField(provided = true)
    CellTable<MatterActionDto> matterActionGrid;

    private final MatterActionColumnsDefinition matterActionColumnInitializer;
    private final ListDataProvider<MatterActionDto> matterActionDataProvider;

    @Inject
    MatterActionView(Binder uiBinder,
               MatterActionColumnsDefinition matterActionColumnInitializer) {
        this.matterActionColumnInitializer = matterActionColumnInitializer;

        initMatterActionGrid();

        initWidget(uiBinder.createAndBindUi(this));

        matterActionDataProvider = new ListDataProvider<>();
        matterActionDataProvider.addDataDisplay(matterActionGrid);
    }

    @Override
    public void displayMatterActions(List<MatterActionDto> matterActionDtos) {
        matterActionDataProvider.getList().clear();
        matterActionDataProvider.getList().addAll(matterActionDtos);
    }

    @Override
    public void addMatterAction(MatterActionDto matterActionDto) {
        matterActionDataProvider.getList().add(matterActionDto);
    }

    @Override
    public void removeMatterAction(MatterActionDto matterActionDto) {
        matterActionDataProvider.getList().remove(matterActionDto);
    }

    @UiHandler("create")
    void onCreateClicked(ClickEvent event) {
        getUiHandlers().onCreate();
    }

    private void initMatterActionGrid() {
        matterActionGrid = new CellTable<>();
        matterActionGrid.setSelectionModel(new NoSelectionModel<MatterActionDto>());

        matterActionColumnInitializer.initializeColumns(matterActionGrid);
        initActionColumns();
    }

    private void initActionColumns() {
        Cell<MatterActionDto> deleteCell = new ActionCell<>("Delete", new ActionCell.Delegate<MatterActionDto>() {
            @Override
            public void execute(MatterActionDto matterActionDto) {
                Boolean confirm = Window.confirm("Are you sure you want to delete" + matterActionDto.toString() + "?");

                if (confirm) {
                    getUiHandlers().onDelete(matterActionDto);
                }
            }
        });

        IdentityColumn<MatterActionDto> deleteColumn = new IdentityColumn<>(deleteCell);
        matterActionGrid.addColumn(deleteColumn, "Delete");
        matterActionGrid.setColumnWidth(deleteColumn, 75, Style.Unit.PX);
    }
}
