
Feature: simple arithmetic

  Scenario: addition
    Given the number 5
    When I add 10
    Then the result should be 15


  Scenario: subtraction
    Given the number 7
    When I subtract 3
    Then the result should be 4


  Scenario: multiplication
    Given the number 10
    When I multiply by 2
    Then the result should be 20
