
package com.anova.anovacloud.client.application.matters.renderer;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiRenderer;
import com.google.inject.Inject;
import com.anova.anovacloud.shared.dto.MatterDto;

public class MatterCell extends AbstractCell<MatterDto> {
    interface Renderer extends UiRenderer {
        void render(SafeHtmlBuilder sb, String name );
    }

    private final Renderer uiRenderer;

    @Inject
    MatterCell(Renderer uiRenderer) {
        this.uiRenderer = uiRenderer;
    }

    @Override
    public void render(Context context, MatterDto value, SafeHtmlBuilder safeHtmlBuilder) {
        uiRenderer.render(safeHtmlBuilder, value.getCaseNum());
    }
}
