
package com.anova.anovacloud.cucumber.application;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageWithEditTable extends BasePage {
    protected void deleteFirstRow(WebElement table) {
        WebElement delete = waitUntilElementIsClickable(table, By.cssSelector("tbody td:last-child button"));
        chooseOkOnNextConfirm();
        delete.click();
        waitUntilElementIsDetached(delete);
    }

    protected void editFirstRow(WebElement table) {
        WebElement edit = waitUntilElementIsClickable(table, By.cssSelector("tbody td:nth-last-child(2) button"));
        edit.click();
        waitUntilElementIsDetached(edit);
    }

    protected int getNumberOfLines(WebElement table) {
        return table.findElements(By.xpath("tbody[1]/tr")).size();
    }

    protected String getCellText(WebElement table, String columnName, int row) {
        int columnIndex = getColumnIndex(table, columnName);

        WebElement element = table.findElement(By.xpath("tbody[1]/tr[" + row + "]/td[" + columnIndex + "]"));
        moveToElement(element);

        return element.getText();
    }

    protected int getColumnIndex(WebElement table, String columnName) {
        List<WebElement> tableHeaders = table.findElements(By.cssSelector("thead th"));

        int index = 1;
        for (WebElement tableHeader : tableHeaders) {
            moveToElement(tableHeader);
            if (columnName.equals(tableHeader.getText())) {
                return index;
            }
            index++;
        }

        return 0;
    }

    private void moveToElement(WebElement tableHeader) {
        Actions action = new Actions(webDriver);
        action.moveToElement(tableHeader);
        action.build().perform();
    }
}
