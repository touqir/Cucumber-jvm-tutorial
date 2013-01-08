@stats
Feature: compute statistics


  Scenario: compute mean
    When I compute the mean of the numbers:
    | values |
    | 3      | 
    | 11     |
    | 7      |
    | 46     |
    | 31     |

    Then the result should be "19.6"


  Scenario: compute standard deviation
    When I compute the standard deviation of the numbers:
    | values |
    | 21     |
    | 54     |
    | 12     |
    | 27     |
    | 67     |
    | 64     |
    | 44     |
    | 36     |

    Then the result should be "20.156"

