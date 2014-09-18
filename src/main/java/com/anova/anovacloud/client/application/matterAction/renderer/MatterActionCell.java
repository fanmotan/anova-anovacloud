

package com.anova.anovacloud.client.application.matterAction.renderer;

import javax.inject.Inject;
import java.util.Date;
import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.dom.client.BrowserEvents;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiRenderer;
import com.anova.anovacloud.shared.dto.MatterActionDto;

public class MatterActionCell extends AbstractCell<MatterActionDto> {
    interface Renderer extends UiRenderer {
        void render(SafeHtmlBuilder sb, String name, Date dueDate, String actionDue, Date ptoMailDate, Date responseDate, Date takenDate,
        			String atty, String actionRemarks, String actionStatus);

  
    }

    private final Renderer uiRenderer;


    @Inject
    MatterActionCell(Renderer uiRenderer) 
    {
        super(BrowserEvents.CLICK);

        this.uiRenderer = uiRenderer;
    }

    @Override
    public void render(Context context, MatterActionDto value, SafeHtmlBuilder safeHtmlBuilder) {
        uiRenderer.render(safeHtmlBuilder, value.getMatter().getCaseNum(), value.getDueDate(), value.getActionDue(), value.getPtoMailDate(), value.getResponseDate(), 
        		value.getTakenDate(), value.getAtty(), value.getActionRemarks(), value.getActionStatus().getStatusName());
    }
    
 
}
