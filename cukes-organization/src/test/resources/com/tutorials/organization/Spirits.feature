@spirits
Feature: Spirits


  Scenario: user asks if we carry a spirit
    Given the following spirits are in stock:
    | name     | age |
    | Jameson  | 12  |
    | Jameson  | 1   |
    | Sky      | 1   |
    | Jim Beam | 1   |

    When the user asks for the spirit(s):
    | name    | type    | age | price |
    | Jameson | whiskey | 12  | $40   |
    | Sky     | vodka   | 1   | $15   |

    Then the following should be displayed:
    | name    | price |
    | Jameson | $40   |
    | Sky     | $15   |


