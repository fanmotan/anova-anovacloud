package com.anova.anovacloud.client.application.dueOneMonth.renderer;

import java.util.Date;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiRenderer;
import com.google.inject.Inject;
import com.anova.anovacloud.shared.dto.MatterActionDto;

public class DueOneMonthCell extends AbstractCell<MatterActionDto> {
    interface Renderer extends UiRenderer {
        void render(SafeHtmlBuilder sb, String caseNumber, String title, String status, Date dueDate, 
        		String actionDue, String atty, String actionRemarks );
    }
    
       
    private final Renderer uiRenderer;

    @Inject
    DueOneMonthCell(Renderer uiRenderer) {
        this.uiRenderer = uiRenderer;
    }


    @Override
    public void render(Context context, MatterActionDto value, SafeHtmlBuilder safeHtmlBuilder) {
        uiRenderer.render(safeHtmlBuilder, value.getMatter().getCaseNum(), value.getMatter().getMatterProperties().getCaseTitle(), value.getStatus(),
        		 value.getDueDate(), value.getActionDue(), value.getAtty(), value.getActionRemarks());
    }
}
