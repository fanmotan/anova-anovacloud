

package com.anova.anovacloud.client.application.user.renderer;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiRenderer;
import com.google.inject.Inject;
import com.anova.anovacloud.shared.dto.UserDto;

public class UserCell extends AbstractCell<UserDto> {
    interface Renderer extends UiRenderer {
        void render(SafeHtmlBuilder sb, String displayName, String username, String hashPassword, String firstName, String lastName,
    			String role, String email, String mailAddress, String phone, String fax);
    }

    private final Renderer uiRenderer;

    @Inject
    UserCell(Renderer uiRenderer) {
        this.uiRenderer = uiRenderer;
    }

    @Override
    public void render(Context context, UserDto value, SafeHtmlBuilder safeHtmlBuilder) {
        uiRenderer.render(safeHtmlBuilder, value.getDisplayName(), value.getUsername(),value.getHashPassword(),value.getFirstName(), value.getLastName(),  
        		value.getRole(), value.getEmail(), value.getMailAddress(), value.getPhone(), value.getFax());
    }
}
