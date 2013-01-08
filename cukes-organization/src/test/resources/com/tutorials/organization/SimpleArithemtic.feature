@simpleArithmetic
Feature: simple arithmetic

Background:
    Given the number 5

 
  Scenario: addition
    When I add 10
    Then the result should be 15


  Scenario: subtraction
    When I subtract 3
    Then the result should be 2


  Scenario: multiplication
    When I multiply by 2
    Then the result should be 10
