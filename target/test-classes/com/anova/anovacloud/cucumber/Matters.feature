Feature: Matters

  Background:
    Given I'm logged in
    And I navigate to the matters page

  Scenario: Clicking on create a matter shows me the page to fill informations
    When I click on the create matter button
    Then I should be on the newMatter page

  Scenario: Clicking on edit on the first matter should edit the first matter
    When I click on the first matter's edit button
    Then I should be on the edited matter page
    And The shown matter should match the edited matter

  Scenario: Editing the first matter should update the first matter
    Given I click on the first matter's edit button
    When I choose Honda as the matter customer
    And I type Fit as the matter model
    And I click to save the matter
    And I click to close the matter
    Then I see a success message containing saved disappear
    Then The matter table should show Honda / Fit as the first matter

  Scenario: Delete a matter
    When I delete the first matter
    Then The first matter gets removed
