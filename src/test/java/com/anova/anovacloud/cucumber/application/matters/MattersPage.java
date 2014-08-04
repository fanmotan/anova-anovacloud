

package com.anova.anovacloud.cucumber.application.matters;

import org.openqa.selenium.WebElement;

import com.anova.anovacloud.cucumber.application.PageWithEditTable;
import com.anova.anovacloud.cucumber.util.ByDebugId;

public class MattersPage extends PageWithEditTable {
    public void clickOnCreate() {
        getCreateButton().click();
    }

    public void fillForm() {
    }

    public void deleteFirstMatter() {
        deleteFirstRow(getMattersTable());
    }

    public int getNumberOfLines() {
        return getNumberOfLines(getMattersTable());
    }

    public void editFirstMatter() {
        editFirstRow(getMattersTable());
    }

    public String getFirstMatterCustomer() {
        return getCellText(getMattersTable(), "Customer", 1);
    }

    public String getFirstMatterModel() {
        return getCellText(getMattersTable(), "Model", 1);
    }

    private WebElement getMattersTable() {
        return waitUntilElementIsLoaded(ByDebugId.id("matters"));
    }

    private WebElement getCreateButton() {
        return waitUntilElementIsClickable(ByDebugId.id("matterCreate"));
    }
}
