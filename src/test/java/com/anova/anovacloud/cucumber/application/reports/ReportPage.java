

package com.anova.anovacloud.cucumber.application.reports;

import java.util.HashMap;

import org.openqa.selenium.WebElement;

import com.anova.anovacloud.cucumber.application.PageWithEditTable;
import com.anova.anovacloud.cucumber.util.ByDebugId;

public class ReportPage extends PageWithEditTable {
    private static final String CUSTOMER_COL = "Customer";
    private static final String RATING_COL = "Rating";

    private HashMap<String, AveragingCounter> averages = new HashMap<String, AveragingCounter>();

    public void addRating(String matter, String rating) {
        String customer = matter.substring(0, matter.indexOf('/'));

        if (averages.containsKey(customer)) {
            averages.get(customer).add(Double.valueOf(rating));
        } else {
            averages.put(customer, new AveragingCounter(Double.valueOf(rating)));
        }
    }

    public boolean checkCustomerAverages() {
        boolean match = true;

        for (int row = 1; row <= getNumberOfLines(getReportsTable()); row++) {
            String customer = getCellText(getReportsTable(), CUSTOMER_COL, row);
            Double average = Double.valueOf(getCellText(getReportsTable(), RATING_COL, row));
            Double referenceAverage = averages.get(customer).average();

            if (!almostEqual(average, referenceAverage, 0.001d)) {
                match &= false;
            }
        }

        return match;
    }

    private WebElement getReportsTable() {
        return waitUntilElementIsVisible(ByDebugId.id("reports"));
    }

    private boolean almostEqual(Double a, Double b, double epsilon) {
        return Math.abs(a - b) < epsilon;
    }

    private class AveragingCounter {
        private double sum;
        private int count;

        AveragingCounter(double number) {
            this.sum = number;
            this.count = 1;
        }

        void add(double number) {
            this.sum += number;
            this.count++;
        }

        double average() {
            return count == 0 ? Double.NaN : sum / count;
        }
    }
}
