
package com.anova.anovacloud.client.application.matterAction;

import java.util.List;

import javax.inject.Inject;

import com.google.gwt.cell.client.ActionCell;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.SingleSelectionModel;
import com.anova.anovacloud.client.application.matterAction.renderer.MatterActionCell;
import com.anova.anovacloud.client.application.matterAction.renderer.MatterActionCellFactory;
import com.anova.anovacloud.client.resources.MobileDataListStyle;
import com.anova.anovacloud.shared.dto.MatterActionDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class MatterActionMobileView extends ViewWithUiHandlers<MatterActionUiHandlers> implements MatterActionPresenter.MyView {
    interface Binder extends UiBinder<Widget, MatterActionMobileView> {
    }

    @UiField(provided = true)
    CellList<MatterActionDto> matterActionList;

    private final ListDataProvider<MatterActionDto> matterActionDataProvider;
    private final SingleSelectionModel<MatterActionDto> selectionModel;

    @Inject
    MatterActionMobileView(Binder uiBinder,
                     MatterActionCell matterActionCell,
                     MobileDataListStyle mobileDataListStyle) {
        matterActionList = new CellList<>(matterActionCell, mobileDataListStyle);

        initWidget(uiBinder.createAndBindUi(this));

        matterActionDataProvider = new ListDataProvider<>();
        matterActionDataProvider.addDataDisplay(matterActionList);
        selectionModel = new SingleSelectionModel<>();
        matterActionList.setSelectionModel(selectionModel);
    }

    @Override
    public void displayMatterActions(List<MatterActionDto> matterActionDtos) {
        matterActionDataProvider.getList().clear();
        matterActionDataProvider.getList().addAll(matterActionDtos);
        matterActionDataProvider.refresh();
        matterActionList.setPageSize(matterActionDtos.size());
    }

    @Override
    public void addMatterAction(MatterActionDto matterActionDto) {
        matterActionDataProvider.getList().add(matterActionDto);
    }
/*
    @Override
    public void removeMatterAction(MatterActionDto matterActionDto) {
        matterActionDataProvider.getList().remove(matterActionDto);
    }

    private ActionCell.Delegate<MatterActionDto> setupRemoveAction() {
        return new ActionCell.Delegate<MatterActionDto>() {
            @Override
            public void execute(MatterActionDto matterActionDto) {
                Boolean confirm = Window.confirm("Are you sure you want to delete" + matterActionDto.toString() + "?");
                if (confirm) {
                    getUiHandlers().onDelete(matterActionDto);
                }
            }
        };
    }
    */
    
    @Override
    public void replaceMatterAction(MatterActionDto oldMatterAction, MatterActionDto newMatterAction) {
        List<MatterActionDto> matterActionDtos = matterActionDataProvider.getList();
        int index = matterActionDtos.indexOf(oldMatterAction);

        matterActionDtos.add(index, newMatterAction);
        matterActionDtos.remove(index + 1);
    }
}
