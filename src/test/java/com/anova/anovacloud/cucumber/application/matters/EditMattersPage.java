
package com.anova.anovacloud.cucumber.application.matters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.anova.anovacloud.cucumber.application.BasePage;
import com.anova.anovacloud.cucumber.util.FindByDebugId;

public class EditMattersPage extends BasePage {
    @FindByDebugId("matters-tab-panel")
    private WebElement mattersTabs;

    @FindByDebugId("matter-model-input")
    private WebElement matterModelInput;

    @FindByDebugId("matter-customer-input")
    private WebElement matterCustomerInput;

    @FindByDebugId("matter-properties-editor")
    private WebElement matterPropertiesEditor;

    @FindByDebugId("matter-save")
    private WebElement saveButton;

    @FindByDebugId("matter-close")
    private WebElement closeButton;

    public String getCurrentMatterTabName() {
        WebElement selectedTab = mattersTabs.findElement(By.className("gwt-TabBarItem-selected"));
        WebElement tabNameContainer = selectedTab.findElement(By.cssSelector("span"));
        return tabNameContainer.getText();
    }

    public void setMatterCustomer(String customer) {
        Select customerSelect = new Select(matterCustomerInput);
        customerSelect.selectByVisibleText(customer);
    }

    public void setMatterModel(String model) {
        matterModelInput.clear();
        matterModelInput.sendKeys(model);
    }

    public void clickOnSave() {
        saveButton.click();
    }

    public void clickOnClose() {
        closeButton.click();
    }
}
