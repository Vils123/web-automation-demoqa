
Feature: DemoQA - Interaction page
  Background:
    Given I am on the "Home" page
    And   I click "Interactions"
    Then  I am on the "Interactions" page

@run
  Scenario: Selectable List
    When I click "Selectable option"
    And  I click "List tab"
    And  I click "Option one"
    And  I click "Option one"
    And  I double click "Option two"
    And  I click "Option three"
    And  I click "Option four"
    And  I double click "Option four"
    And  I click "Grid tab"
    And  I click "List tab"
    Then "Option one" should be "not selected"
    And  "Option two" should be "not selected"
    And  "Option three" should be "selected"
    And  "Option four" should be "selected"

