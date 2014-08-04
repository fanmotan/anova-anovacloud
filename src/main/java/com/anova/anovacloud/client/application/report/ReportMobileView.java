

package com.anova.anovacloud.client.application.report;

import java.util.List;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.anova.anovacloud.client.application.report.renderer.ReportCell;
import com.anova.anovacloud.client.resources.MobileDataListStyle;
import com.anova.anovacloud.shared.dto.ActionDueDto;
import com.gwtplatform.mvp.client.ViewImpl;

public class ReportMobileView extends ViewImpl implements ReportPresenter.MyView {
    interface Binder extends UiBinder<Widget, ReportMobileView> {
    }

    @UiField(provided = true)
    CellList<ActionDueDto> reportList;

    private final ListDataProvider<ActionDueDto> actionDuesProvider;

    @Inject
    ReportMobileView(Binder uiBinder,
                     ReportCell reportCell,
                     MobileDataListStyle listStyle) {
        reportList = new CellList<>(reportCell, listStyle);

        initWidget(uiBinder.createAndBindUi(this));

        actionDuesProvider = new ListDataProvider<>();
        actionDuesProvider.addDataDisplay(reportList);
    }

    @Override
    public void displayReport(List<ActionDueDto> actionDues) {
        actionDuesProvider.getList().clear();
        actionDuesProvider.getList().addAll(actionDues);
    }
}
