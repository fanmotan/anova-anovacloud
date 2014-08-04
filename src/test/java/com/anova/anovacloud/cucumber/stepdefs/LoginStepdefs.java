

package com.anova.anovacloud.cucumber.stepdefs;

import javax.inject.Inject;

import com.anova.anovacloud.cucumber.application.ApplicationPage;
import com.anova.anovacloud.cucumber.application.UnauthorizedPage;
import com.anova.anovacloud.cucumber.application.login.LoginPage;
import com.anova.anovacloud.cucumber.application.widgets.HeaderWidgetPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class LoginStepdefs {
    private final HeaderWidgetPage headerWidgetPage;
    private final LoginPage loginPage;
    private final ApplicationPage applicationPage;
    private final UnauthorizedPage unauthorizedPage;

    @Inject
    LoginStepdefs(HeaderWidgetPage headerWidgetPage,
                  LoginPage loginPage,
                  ApplicationPage applicationPage,
                  UnauthorizedPage unauthorizedPage) {
        this.headerWidgetPage = headerWidgetPage;
        this.loginPage = loginPage;
        this.applicationPage = applicationPage;
        this.unauthorizedPage = unauthorizedPage;
    }

    @When("^I click on logout$")
    public void IClickOnLogout() {
        headerWidgetPage.clickOnLogOut();
    }

    @Then("^I'm connected$")
    public void ImConnected() {
        assertTrue(applicationPage.waitUntilDomIsLoaded("customer"));
    }

    @Then("^I'm connected on the (\\S+) page$")
    public void ImConnectedOnThePage(String nameToken) {
        loginPage.waitUntilLoggedIn();
        assertTrue(applicationPage.waitUntilDomIsLoaded(nameToken));
    }

    @Then("^I'm disconnected$")
    public void iAmDisconnected() {
        loginPage.isOnLoginPage();
    }

    @When("^I click on the link to the login page$")
    public void IClickOnTheLinkToTheLoginPage() {
        unauthorizedPage.clickOnLink();
    }
}
