@DemoRun
@olea
Feature: Topping menu for pizza

  Background:
    Given "HomePage" is opened

  Scenario: Add and remove a random topping
    When user clicks on "menu" button
    And  user clicks on "pizza" button
    Then "PizzaPage" is opened
    When user opens random product
    Then "ToppingMenuPage" is opened
    When user clicks on "plus" button
    Then quantity of this product changes to one more
    When user clicks on "minus" button
    Then quantity of this product changes to one less
