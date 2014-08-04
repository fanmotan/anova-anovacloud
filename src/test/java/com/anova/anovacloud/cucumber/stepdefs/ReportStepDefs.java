

package com.anova.anovacloud.cucumber.stepdefs;

import javax.inject.Inject;

import com.anova.anovacloud.cucumber.application.ratings.RatingPage;
import com.anova.anovacloud.cucumber.application.reports.ReportPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertTrue;

public class ReportStepDefs {
    private static final String MATTER_COL = "Matter";
    private static final String RATING_COL = "Rating";

    private final RatingPage ratingPage;
    private final ReportPage reportPage;

    @Inject
    ReportStepDefs(RatingPage ratingPage,
                   ReportPage reportPage) {
        this.ratingPage = ratingPage;
        this.reportPage = reportPage;
    }

    @Given("^I compute rating average for all customers$")
    public void I_compute_rating_average_for_all_customers() {
        int numberOfLines = ratingPage.getNumberOfLines();

        for (int line = 1; line <= numberOfLines; line++) {
            String matter = ratingPage.getCellText(MATTER_COL, line);
            String rating = ratingPage.getCellText(RATING_COL, line);

            reportPage.addRating(matter, rating);
        }
    }

    @Then("^I see the proper averages for all customers$")
    public void I_see_proper_averages_for_all_customers() {
        assertTrue(reportPage.checkCustomerAverages());
    }
}
