Feature: Reports

  Background:
    Given I'm logged in

  Scenario: Reports should show proper rating averages for all customers
    Given I navigate to the rating page
    And I compute rating average for all customers
    When I navigate to the report page
    Then I see the proper averages for all customers
