

package com.anova.anovacloud.cucumber.application.login;

import org.openqa.selenium.WebElement;

import com.google.inject.Inject;
import com.anova.anovacloud.client.place.NameTokens;
import com.anova.anovacloud.cucumber.application.BasePage;
import com.anova.anovacloud.cucumber.application.widgets.HeaderWidgetPage;
import com.anova.anovacloud.cucumber.util.FindByDebugId;

public class LoginPage extends BasePage {
    @FindByDebugId("username")
    private WebElement username;
    @FindByDebugId("password")
    private WebElement password;
    @FindByDebugId("login")
    private WebElement login;

    private final HeaderWidgetPage headerWidgetPage;

    @Inject
    LoginPage(HeaderWidgetPage headerWidgetPage) {
        this.headerWidgetPage = headerWidgetPage;
    }

    public void setUsername(String username) {
        waitUntilElementIsVisible(this.username);
        this.username.sendKeys(username);
    }

    public void setPassword(String password) {
        waitUntilElementIsVisible(this.password);
        this.password.sendKeys(password);
    }

    public void submitLoginForm() {
        waitUntilElementIsVisible(login);
        login.click();
    }

    public Boolean isOnLoginPage() {
        return webDriver.getCurrentUrl().contains("#" + NameTokens.LOGIN);
    }

    public void waitUntilLoggedIn() {
        headerWidgetPage.waitUntilLogoutIsClickable();
    }
}
