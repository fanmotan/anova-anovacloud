

package com.anova.anovacloud.client.application.attorney.renderer;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiRenderer;
import com.google.inject.Inject;
import com.anova.anovacloud.shared.dto.AttorneyDto;

public class AttorneyCell extends AbstractCell<AttorneyDto> {
    interface Renderer extends UiRenderer {
        void render(SafeHtmlBuilder sb, String displayName, String firstName, String lastName, String email, String mailAddress, String phone, String fax);
    }

    private final Renderer uiRenderer;

    @Inject
    AttorneyCell(Renderer uiRenderer) {
        this.uiRenderer = uiRenderer;
    }

    @Override
    public void render(Context context, AttorneyDto value, SafeHtmlBuilder safeHtmlBuilder) {
        uiRenderer.render(safeHtmlBuilder, value.getDisplayName(), value.getFirstName(), value.getLastName(), value.getEmail(), value.getMailAddress(), value.getPhone(), value.getFax());
    }
}
