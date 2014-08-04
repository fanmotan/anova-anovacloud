

package com.anova.anovacloud.client.application.customer.renderer;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiRenderer;
import com.google.inject.Inject;
import com.anova.anovacloud.shared.dto.CustomerDto;

public class CustomerCell extends AbstractCell<CustomerDto> {
    interface Renderer extends UiRenderer {
        void render(SafeHtmlBuilder sb, String name, String refNum, String address, String email, String phone, String fax);
    }

    private final Renderer uiRenderer;

    @Inject
    CustomerCell(Renderer uiRenderer) {
        this.uiRenderer = uiRenderer;
    }

    @Override
    public void render(Context context, CustomerDto value, SafeHtmlBuilder safeHtmlBuilder) {
        uiRenderer.render(safeHtmlBuilder, value.getName(), value.getRefNum(), value.getAddress(), value.getEmail(), value.getPhone(), value.getFax());
    }
}
