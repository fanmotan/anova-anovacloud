

package com.anova.anovacloud.client.application.report.renderer;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiRenderer;
import com.google.inject.Inject;
import com.anova.anovacloud.shared.dto.ActionDueDto;

public class ReportCell extends AbstractCell<ActionDueDto> {
    interface Renderer extends UiRenderer {
        void render(SafeHtmlBuilder sb, String caseNumber, String title, String status, String dueDate, 
        		String actionDue, String atty, String actionRemarks );
    }
    
       
    private final Renderer uiRenderer;

    @Inject
    ReportCell(Renderer uiRenderer) {
        this.uiRenderer = uiRenderer;
    }


    @Override
    public void render(Context context, ActionDueDto value, SafeHtmlBuilder safeHtmlBuilder) {
        uiRenderer.render(safeHtmlBuilder, value.getCaseNumber(), value.getTitle(), value.getStatus(),
        		 value.getDueDate(), value.getActionDue(), value.getAtty(), value.getActionRemarks());
    }
}
