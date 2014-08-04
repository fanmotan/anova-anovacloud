
package com.anova.anovacloud.cucumber.application.customers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.anova.anovacloud.cucumber.application.PageWithEditTable;
import com.anova.anovacloud.cucumber.util.ByDebugId;

public class CustomersPage extends PageWithEditTable {
    public void clickOnCreate() {
        getCreateButton().click();
    }

    public void deleteFirstCustomer() {
        deleteFirstRow(getCustomersTable());
    }

    public int getNumberOfLines() {
        return getNumberOfLines(getCustomersTable());
    }

    public void editFirstCustomer() {
        getFirstRowEdit().click();
    }

    public String getFirstCustomer() {
        return getCellText(getCustomersTable(), "Name", 1);
    }

    public String getLastCustomer() {
        return getCellText(getCustomersTable(), "Name", getNumberOfLines());
    }

    private WebElement getFirstRowEdit() {
        return waitUntilElementIsLoaded(getCustomersTable(), By.cssSelector("tbody td:nth-last-child(2) button"));
    }

    private WebElement getCreateButton() {
        return waitUntilElementIsClickable(ByDebugId.id("create-customer"));
    }

    private WebElement getCustomersTable() {
        return waitUntilElementIsVisible(ByDebugId.id("customers"));
    }
}
