

package com.anova.anovacloud.cucumber.application.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.anova.anovacloud.cucumber.application.BasePage;
import com.anova.anovacloud.cucumber.util.ByDebugId;

public class HeaderWidgetPage extends BasePage {
    public void clickOnLogOut() {
        getLogoutButton().click();
    }

    public void navigateTo(String linkText) {
        WebElement link = getMenuBar().findElement(By.xpath("//a[contains(@href,'" + linkText + "')]"));
        link.click();
    }

    public void waitUntilLogoutIsClickable() {
        getLogoutButton();
    }

    private WebElement getMenuBar() {
        return waitUntilElementIsVisible(ByDebugId.id("menubar"));
    }

    private WebElement getLogoutButton() {
        return waitUntilElementIsClickable(ByDebugId.id("logout"));
    }
}
