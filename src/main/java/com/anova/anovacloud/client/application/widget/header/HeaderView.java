

package com.anova.anovacloud.client.application.widget.header;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.anova.anovacloud.client.resources.WidgetResources;
import com.anova.anovacloud.client.security.CurrentUser;
import com.anova.anovacloud.shared.dto.UserDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

import static com.google.gwt.query.client.GQuery.$;

public class HeaderView extends ViewWithUiHandlers<HeaderUiHandlers> implements HeaderPresenter.MyView {
    interface Binder extends UiBinder<Widget, HeaderView> {
    }

    @UiField
    InlineLabel name;
    @UiField
    Button logout;
    @UiField
    HTMLPanel userOptions;
    @UiField
    HTMLPanel menubar;

    private final WidgetResources widgetRes;

    @Inject
    HeaderView(Binder uiBinder, WidgetResources widgetResources) {
        this.widgetRes = widgetResources;

        initWidget(uiBinder.createAndBindUi(this));

        userOptions.setVisible(false);
    }

    @Override
    public void enableUserOptions(CurrentUser currentUser) {
        userOptions.setVisible(true);
        UserDto userDto = currentUser.getUser();
        name.setText(userDto.getFirstName());
    }

    @Override
    public void disableUserOptions() {
        userOptions.setVisible(false);
    }

    @Override
    public void setMenuItemActive(String nameToken) {
        $("a", menubar).removeClass(widgetRes.header().menuActive());
        $("a[href*=\"" + nameToken + "\"]", menubar).addClass(widgetRes.header().menuActive());
    }

    @UiHandler("logout")
    @SuppressWarnings("unused")
    void onLogoutClicked(ClickEvent event) {
        getUiHandlers().logout();
    }
}
