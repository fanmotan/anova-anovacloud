
package com.anova.anovacloud.cucumber.stepdefs;

import javax.inject.Inject;

import com.anova.anovacloud.cucumber.application.ratings.RatingPage;
import com.anova.anovacloud.cucumber.application.widgets.MessageWidgetPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RatingStepdefs {
    private final RatingPage ratingPage;
    private final MessageWidgetPage messageWidgetPage;
    private int numberOfLines;

    @Inject
    RatingStepdefs(RatingPage ratingPage, MessageWidgetPage messageWidgetPage) {
        this.ratingPage = ratingPage;
        this.messageWidgetPage = messageWidgetPage;
    }

    @Given("^I click on the create rating button$")
    public void iClickOnTheCreateRatingButton() {
        numberOfLines = ratingPage.getNumberOfLines();
        ratingPage.clickOnCreate();
    }

    @When("^I fill the rating form$")
    public void iFillTheRatingForm() {
        ratingPage.fillForm();
    }

    @Then("^A rating is created$")
    public void aRatingIsCreated() {
        assertTrue(messageWidgetPage.hasSuccessMessage());
        assertEquals(numberOfLines + 1, ratingPage.getNumberOfLines());
    }

    @When("^I delete the first rating$")
    public void iDeleteTheFirstRating() {
        numberOfLines = ratingPage.getNumberOfLines();
        ratingPage.deleteFirstRating();
    }

    @Then("^The first rating gets removed$")
    public void theFirstRatingGetsRemoved() {
        assertEquals(numberOfLines - 1, ratingPage.getNumberOfLines());
    }
}
