

package com.anova.anovacloud.cucumber.application;

import org.openqa.selenium.WebElement;

import com.anova.anovacloud.cucumber.util.ByDebugId;

public class UnauthorizedPage extends BasePage {
    public void clickOnLink() {
        getLinkToLogin().click();
    }

    private WebElement getLinkToLogin() {
        return waitUntilElementIsClickable(ByDebugId.id("linkToLogin"));
    }
}
