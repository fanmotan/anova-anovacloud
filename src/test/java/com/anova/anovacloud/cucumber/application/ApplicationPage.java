
package com.anova.anovacloud.cucumber.application;

import javax.inject.Inject;

import org.openqa.selenium.TimeoutException;

import com.anova.anovacloud.cucumber.application.widgets.HeaderWidgetPage;
import com.anova.anovacloud.cucumber.application.widgets.MessageWidgetPage;
import com.anova.anovacloud.cucumber.util.TestParameters;

import static com.google.gwt.user.client.ui.UIObject.DEBUG_ID_PREFIX;

public class ApplicationPage extends BasePage {
    private final HeaderWidgetPage headerWidgetPage;
    private final MessageWidgetPage messageWidgetPage;

    @Inject
    ApplicationPage(
            HeaderWidgetPage headerWidgetPage,
            MessageWidgetPage messageWidgetPage) {
        this.headerWidgetPage = headerWidgetPage;
        this.messageWidgetPage = messageWidgetPage;
    }

    public Boolean waitUntilDomIsLoaded(String nameToken) {
        try {
            waitUntilPlaceIsLoaded(nameToken);
            waitUntilElementIsLoaded(DEBUG_ID_PREFIX + "dom");
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public void navigateToWithMenu(String page) {
        headerWidgetPage.navigateTo(page);
        waitUntilDomIsLoaded(page);
    }

    public void navigateToNotLoggedIn(String page) {
        getUrl(TestParameters.BASE_URL + "#" + page);
    }

    public boolean successMessageIsPresent(String message) {
        return messageWidgetPage.hasSuccessMessage(message);
    }
}
