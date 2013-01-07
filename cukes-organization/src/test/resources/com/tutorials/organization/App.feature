Feature: App Greetings

  Scenario: Say hi 
    Given my name is "Steve"
    When I ask my app to say hi
    Then it responds with "Hi Steve"


  Scenario: Say hi in French
    Given my name is "Steve"
    When I ask my app to say hi in French
    Then it responds with "Bonjour Steve"


  Scenario: Say hi in Russian
    Given my name is "Steve"
    When I ask my app to say hi in Russian
    Then it responds with "привет Steve"

