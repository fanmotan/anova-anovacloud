
package com.anova.anovacloud.cucumber.application.ratings;

import org.openqa.selenium.WebElement;

import com.anova.anovacloud.cucumber.application.PageWithEditTable;
import com.anova.anovacloud.cucumber.util.ByDebugId;

public class RatingPage extends PageWithEditTable {
    private static final String A_VALID_RATING = "10";

    public void clickOnCreate() {
        getCreateButton().click();
    }

    public void fillForm() {
        getRatingsInput().sendKeys(A_VALID_RATING);
        WebElement save = waitUntilElementIsClickable(ByDebugId.id("ratingSave"));
        save.click();
        waitUntilElementIsDetached(save);
    }

    public void deleteFirstRating() {
        deleteFirstRow(getRatingsTable());
    }

    public int getNumberOfLines() {
        return getNumberOfLines(getRatingsTable());
    }

    public String getCellText(String colName, int row) {
        return getCellText(getRatingsTable(), colName, row);
    }

    private WebElement getCreateButton() {
        return waitUntilElementIsClickable(ByDebugId.id("ratingCreate"));
    }

    private WebElement getRatingsTable() {
        return waitUntilElementIsVisible(ByDebugId.id("ratings"));
    }

    private WebElement getRatingsInput() {
        return waitUntilElementIsVisible(ByDebugId.id("ratingInput"));
    }
}
