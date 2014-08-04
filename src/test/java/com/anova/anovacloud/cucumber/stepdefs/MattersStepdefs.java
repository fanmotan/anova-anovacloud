

package com.anova.anovacloud.cucumber.stepdefs;

import javax.inject.Inject;

import com.anova.anovacloud.cucumber.application.matters.MattersPage;
import com.anova.anovacloud.cucumber.application.matters.EditMattersPage;
import com.anova.anovacloud.cucumber.application.widgets.MessageWidgetPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MattersStepdefs {
    private final MattersPage mattersPage;
    private final EditMattersPage editMattersPage;
    private final MessageWidgetPage messageWidgetPage;

    private int numberOfLines;
    private String matterCustomer;
    private String matterModel;

    @Inject
    MattersStepdefs(
            MattersPage mattersPage,
            EditMattersPage editMattersPage,
            MessageWidgetPage messageWidgetPage) {
        this.mattersPage = mattersPage;
        this.editMattersPage = editMattersPage;
        this.messageWidgetPage = messageWidgetPage;
    }

    @Given("^I click on the create matter button$")
    public void iClickOnTheCreateMatterButton() {
        numberOfLines = mattersPage.getNumberOfLines();
        mattersPage.clickOnCreate();
    }

    @When("^I fill the matter form$")
    public void iFillTheMatterForm() {
        mattersPage.fillForm();
    }

    @Then("^A matter is created$")
    public void aMatterIsCreated() {
        assertTrue(messageWidgetPage.hasSuccessMessage());
        assertEquals(numberOfLines + 1, mattersPage.getNumberOfLines());
    }

    @When("^I delete the first matter$")
    public void iDeleteTheFirstMatter() {
        numberOfLines = mattersPage.getNumberOfLines();
        mattersPage.deleteFirstMatter();
    }

    @Then("^The first matter gets removed$")
    public void theFirstMatterGetsRemoved() {
        assertEquals(numberOfLines - 1, mattersPage.getNumberOfLines());
    }

    @When("^I click on the first matter's edit button$")
    public void I_click_on_the_first_matter_s_edit_button() {
        matterCustomer = mattersPage.getFirstMatterCustomer();
        matterModel = mattersPage.getFirstMatterModel();
        mattersPage.editFirstMatter();
    }

    @Then("^I should be on the edited matter page$")
    public void I_should_be_on_the_edited_matter_page() {
        String currentUrl = editMattersPage.getCurrentUrl();
        assertTrue(currentUrl.contains("#" + matterCustomer + matterModel));
    }

    @And("^The shown matter should match the edited matter$")
    public void The_shown_matter_should_match_the_edited_matter() {
        assertEquals(editMattersPage.getCurrentMatterTabName(), matterCustomer + " " + matterModel);
    }

    @When("^I choose (.*?) as the matter customer$")
    public void I_type_as_the_matter_customer(String customer) {
        editMattersPage.setMatterCustomer(customer);
    }

    @And("^I type (.*?) as the matter model$")
    public void I_type_as_the_matter_model(String model) {
        editMattersPage.setMatterModel(model);
    }

    @And("^I click to save the matter$")
    public void I_click_to_save_the_matter() {
        editMattersPage.clickOnSave();
    }

    @Then("^The matter table should show (.*?) / (.*?) as the first matter$")
    public void The_matter_table_should_show_as_the_first_matter(String customer, String model) {
        assertEquals(customer, mattersPage.getFirstMatterCustomer());
        assertEquals(model, mattersPage.getFirstMatterModel());
    }

    @And("^I click to close the matter$")
    public void I_click_to_close_the_matter() throws Throwable {
        editMattersPage.clickOnClose();
    }
}
