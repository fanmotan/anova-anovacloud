Feature: Customers

  Background:
    Given I'm logged in
    And I navigate to the customer page

  Scenario: Clicking on create a customer shows me the page to fill informations
    When I click on the create customer button
    Then I see the customer editor

  Scenario: Add a customer but hit the close button, table should be unaltered
    Given I click on the create customer button
    And  I see the customer editor
    When I enter Ford as the matter customer
    And  I click on the close button
    Then The number of rows is unchanged

  Scenario: Add a customer and hit the save button, table should be unaltered
    Given I click on the create customer button
    And   I see the customer editor
    When  I enter Plymouth as the matter customer
    And   I click on the save button
    Then  I see a success message containing saved
    And   The number of rows is incremented
    And   The customer table should show Plymouth as the last customer

#  This one doesn't work yet because of a strange issue retrieving the contents of the editbox
#  Scenario: Clicking on edit on the first customer should edit the first customer
#    When I click on the first customer edit button
#    Then I should see the customer editor
#    And The shown customer should match the edited customer
#
  Scenario: Editing the first customer should update the first customer
    Given I click on the first customer edit button
    When  I enter Ford as the matter customer
    And   I click on the save button
    Then  I see a success message containing saved
    And   The customer table should show Ford as the first customer

  Scenario: Delete a customer
    When I delete the first customer
    Then The first customer gets removed
