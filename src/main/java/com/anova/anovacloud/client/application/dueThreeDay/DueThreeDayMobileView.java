package com.anova.anovacloud.client.application.dueThreeDay;

import java.util.List;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.anova.anovacloud.client.application.dueThreeDay.renderer.DueThreeDayCell;
import com.anova.anovacloud.client.resources.MobileDataListStyle;
import com.anova.anovacloud.shared.dto.MatterActionDto;
import com.gwtplatform.mvp.client.ViewImpl;

public class DueThreeDayMobileView extends ViewImpl implements DueThreeDayPresenter.MyView {
    interface Binder extends UiBinder<Widget, DueThreeDayMobileView> {
    }

    @UiField(provided = true)
    CellList<MatterActionDto> reportList;

    private final ListDataProvider<MatterActionDto> actionDuesProvider;

    @Inject
    DueThreeDayMobileView(Binder uiBinder,
    		DueThreeDayCell reportCell,
                     MobileDataListStyle listStyle) {
        reportList = new CellList<>(reportCell, listStyle);

        initWidget(uiBinder.createAndBindUi(this));

        actionDuesProvider = new ListDataProvider<>();
        actionDuesProvider.addDataDisplay(reportList);
    }

    @Override
    public void displayReport(List<MatterActionDto> actionDues) {
        actionDuesProvider.getList().clear();
        actionDuesProvider.getList().addAll(actionDues);
    }
}
