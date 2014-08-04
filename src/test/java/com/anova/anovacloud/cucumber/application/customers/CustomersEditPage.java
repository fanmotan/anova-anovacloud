
package com.anova.anovacloud.cucumber.application.customers;

import org.openqa.selenium.WebElement;

import com.anova.anovacloud.cucumber.application.BasePage;
import com.anova.anovacloud.cucumber.util.FindByDebugId;

public class CustomersEditPage extends BasePage {
    @FindByDebugId("customer-input")
    private WebElement customerInput;
    @FindByDebugId("customer-save")
    private WebElement saveButton;
    @FindByDebugId("customer-close")
    private WebElement closeButton;
    @FindByDebugId("customer-editor")
    private WebElement customerEditor;

    public void setCustomer(String customer) {
        customerInput.clear();
        customerInput.sendKeys(customer);
    }

    public String getCustomer() {
        return customerInput.getText();
    }

    public void clickOnSave() {
        saveButton.click();
    }

    public void clickOnClose() {
        closeButton.click();
    }

    public boolean isCustomerEditorVisible() {
        return customerEditor.isDisplayed();
    }
}
