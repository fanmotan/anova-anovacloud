
package com.anova.anovacloud.cucumber.stepdefs;

import javax.inject.Inject;

import com.anova.anovacloud.cucumber.application.customers.CustomersEditPage;
import com.anova.anovacloud.cucumber.application.customers.CustomersPage;
import com.anova.anovacloud.cucumber.application.widgets.MessageWidgetPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomersStepDefs extends StepDefs {
    private static final int animationTimeout = 1500;

    private final CustomersPage customersPage;
    private final CustomersEditPage customersEditPage;
    private final MessageWidgetPage messageWidgetPage;

    private int numberOfLines;

    @Inject
    CustomersStepDefs(
            CustomersPage customersPage,
            CustomersEditPage customersEditPage,
            MessageWidgetPage messageWidgetPage) {
        this.customersPage = customersPage;
        this.customersEditPage = customersEditPage;
        this.messageWidgetPage = messageWidgetPage;
    }

    @Given("^I click on the create customer button$")
    public void I_click_on_create_customer_button() {
        numberOfLines = customersPage.getNumberOfLines();
        customersPage.clickOnCreate();
        sleep(animationTimeout);
    }

    @When("^I click on the first customer edit button$")
    public void I_click_on_first_customer_edit_button() {
        customersPage.editFirstCustomer();
        sleep(animationTimeout);
    }

    @When("^I enter (\\S+) as the matter customer$")
    public void I_enter_as_customer(String customer) {
        customersEditPage.setCustomer(customer);
    }

    @When("^I click on the save button$")
    public void I_click_on_the_save_button() {
        customersEditPage.clickOnSave();
    }

    @When("^I click on the close button$")
    public void I_click_on_the_close_button() {
        customersEditPage.clickOnClose();
    }

    @When("^I delete the first customer$")
    public void I_delete_first_matter() {
        numberOfLines = customersPage.getNumberOfLines();
        customersPage.deleteFirstCustomer();
    }

    @Then("^I see the customer editor$")
    public void I_see_customer_editor() {
        assertTrue(customersEditPage.isCustomerEditorVisible());
    }

    @Then("^The shown customer should match the edited customer$")
    public void The_shown_customer_should_match_the_edited_customer() {
        assertEquals(customersEditPage.getCustomer(), customersPage.getFirstCustomer());
    }

    @Then("^The customer table should show (\\S+) as the first customer$")
    public void Customer_table_should_show_as_first_customer(String customer) {
        assertEquals(customersPage.getFirstCustomer(), customer);
    }

    @Then("^The customer table should show (\\S+) as the last customer$")
    public void Customer_table_should_show_as_last_customer(String customer) {
        assertEquals(customersPage.getLastCustomer(), customer);
    }

    @Then("^The first customer gets removed$")
    public void First_matter_gets_removed() {
        assertEquals(numberOfLines - 1, customersPage.getNumberOfLines());
    }

    @Then("^The number of rows is unchanged$")
    public void Number_of_rows_is_unchanged() {
        assertEquals(customersPage.getNumberOfLines(), numberOfLines);
    }

    @Then("^The number of rows is incremented$")
    public void Number_of_rows_is_incremented() {
        assertTrue(customersPage.getNumberOfLines() > numberOfLines);
    }
}
