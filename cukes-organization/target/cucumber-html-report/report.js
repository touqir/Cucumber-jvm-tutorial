$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("\u0027com/tutorials/organization/App.feature\u0027");
formatter.feature({
  "id": "app-greetings",
  "description": "",
  "name": "App Greetings",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "app-greetings;say-hi",
  "description": "",
  "name": "Say hi",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "my name is \"Steve\"",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "I ask my app to say hi",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "it responds with \"Hi Steve\"",
  "keyword": "Then ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "Steve",
      "offset": 12
    }
  ],
  "location": "GreetingStepDefs.my_name_is(String)"
});
formatter.result({
  "duration": 157828942,
  "status": "passed"
});
formatter.match({
  "location": "GreetingStepDefs.I_ask_my_app_to_say_hi()"
});
formatter.result({
  "duration": 94565,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hi Steve",
      "offset": 18
    }
  ],
  "location": "GreetingStepDefs.it_responds_with(String)"
});
formatter.result({
  "duration": 2586573,
  "status": "passed"
});
formatter.scenario({
  "id": "app-greetings;say-hi-in-french",
  "description": "",
  "name": "Say hi in French",
  "keyword": "Scenario",
  "line": 9,
  "type": "scenario"
});
formatter.step({
  "name": "my name is \"Steve\"",
  "keyword": "Given ",
  "line": 10
});
formatter.step({
  "name": "I ask my app to say hi in French",
  "keyword": "When ",
  "line": 11
});
formatter.step({
  "name": "it responds with \"Bonjour Steve\"",
  "keyword": "Then ",
  "line": 12
});
formatter.match({
  "arguments": [
    {
      "val": "Steve",
      "offset": 12
    }
  ],
  "location": "GreetingStepDefs.my_name_is(String)"
});
formatter.result({
  "duration": 91143,
  "status": "passed"
});
formatter.match({
  "location": "GreetingStepDefs.I_ask_my_app_to_say_hi_in_French()"
});
formatter.result({
  "duration": 42882,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bonjour Steve",
      "offset": 18
    }
  ],
  "location": "GreetingStepDefs.it_responds_with(String)"
});
formatter.result({
  "duration": 74102,
  "status": "passed"
});
formatter.scenario({
  "id": "app-greetings;say-hi-in-russian",
  "description": "",
  "name": "Say hi in Russian",
  "keyword": "Scenario",
  "line": 15,
  "type": "scenario"
});
formatter.step({
  "name": "my name is \"Steve\"",
  "keyword": "Given ",
  "line": 16
});
formatter.step({
  "name": "I ask my app to say hi in Russian",
  "keyword": "When ",
  "line": 17
});
formatter.step({
  "name": "it responds with \"привет Steve\"",
  "keyword": "Then ",
  "line": 18
});
formatter.match({
  "arguments": [
    {
      "val": "Steve",
      "offset": 12
    }
  ],
  "location": "GreetingStepDefs.my_name_is(String)"
});
formatter.result({
  "duration": 87301,
  "status": "passed"
});
formatter.match({
  "location": "GreetingStepDefs.I_ask_my_app_to_say_hi_in_Russian()"
});
formatter.result({
  "duration": 63975,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "привет Steve",
      "offset": 18
    }
  ],
  "location": "GreetingStepDefs.it_responds_with(String)"
});
formatter.result({
  "duration": 84787,
  "status": "passed"
});
});