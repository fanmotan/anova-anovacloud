

package com.anova.anovacloud.client.application.matters;

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
import com.anova.anovacloud.client.application.matters.MattersPresenter.MyView;
import com.anova.anovacloud.client.application.matters.renderer.MatterCell;
import com.anova.anovacloud.client.application.ui.ShowMorePagerPanel;
import com.anova.anovacloud.client.resources.MobileDataListStyle;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class MattersMobileView extends ViewWithUiHandlers<MattersUiHandlers> implements MyView {
    interface Binder extends UiBinder<Widget, MattersMobileView> {
    }

    private static final int PAGE_SIZE = 20;

    @UiField(provided = true)
    ShowMorePagerPanel pagerPanel;

    private CellList<MatterDto> matterList;
    private AsyncDataProvider<MatterDto> asyncDataProvider;
    private SingleSelectionModel<MatterDto> selectionModel;

    @Inject
    MattersMobileView(Binder uiBinder,
                   MatterCell matterCell,
                   MobileDataListStyle mobileDataListStyle) {
        pagerPanel = new ShowMorePagerPanel(PAGE_SIZE);
        matterList = new CellList<>(matterCell, mobileDataListStyle);
        selectionModel = new SingleSelectionModel<>();

        initWidget(uiBinder.createAndBindUi(this));

        pagerPanel.setDisplay(matterList);
        matterList.setSelectionModel(selectionModel);

        selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
            @Override
            public void onSelectionChange(SelectionChangeEvent event) {
                getUiHandlers().onEdit(selectionModel.getSelectedObject());
            }
        });
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

        asyncDataProvider.addDataDisplay(matterList);
    }

    @Override
    public HasData<MatterDto> getMatterDisplay() {
        return matterList;
    }

    @Override
    public void setMattersCount(Integer result) {
        asyncDataProvider.updateRowCount(result, true);
    }

    @Override
    public void displayMatters(int offset, List<MatterDto> matterDtos) {
        asyncDataProvider.updateRowData(offset, matterDtos);
    }
}
