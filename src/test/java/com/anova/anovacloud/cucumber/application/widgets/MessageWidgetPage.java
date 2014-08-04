

package com.anova.anovacloud.cucumber.application.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

import com.google.common.base.Strings;
import com.anova.anovacloud.cucumber.application.BasePage;
import com.anova.anovacloud.cucumber.util.ByDebugId;

public class MessageWidgetPage extends BasePage {
    public Boolean hasSuccessMessage() {
        return hasSuccessMessage("");
    }

    public Boolean hasSuccessMessage(String message) {
        return messageContains("successMessage", message) && messageIsVisible(getSuccessMessage());
    }

    public Boolean hasErrorMessage() {
        return messageIsVisible(getErrorMessage());
    }

    public void hideSuccessMessage() {
        hideMessage(getSuccessMessage());
    }

    public void hideErrorMessage() {
        hideMessage(getErrorMessage());
    }

    public void waitUntilSuccessMessageIsHidden(String message) {
        messageContains("successMessage", message);
        waitUntilElementIsDetached(getSuccessMessage());
    }

    private Boolean messageIsVisible(WebElement element) {
        try {
            waitUntilElementIsVisible(element);
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    private boolean messageContains(String debugId, String message) {
        WebElement container = webDriver.findElement(ByDebugId.id(debugId));
        while (container != null) {
            WebElement content = container.findElement(By.cssSelector("span"));
            if (!Strings.isNullOrEmpty(content.getText()) && content.getText().contains(message)) {
                return true;
            }
            hideMessage(container);
            container = getMessageContainer(ByDebugId.id(debugId));
        }

        return false;
    }

    private void hideMessage(WebElement message) {
        WebElement close = message.findElement(By.cssSelector("span:last-child"));
        close.click();
        waitUntilElementIsDetached(message);
    }

    private WebElement getMessageContainer(By by) {
        try {
            return webDriver.findElement(by);
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    private WebElement getSuccessMessage() {
        return waitUntilElementIsVisible(ByDebugId.id("successMessage"));
    }

    private WebElement getErrorMessage() {
        return waitUntilElementIsVisible(ByDebugId.id("errorMessage"));
    }
}
