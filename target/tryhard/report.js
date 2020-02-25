$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/f1.feature");
formatter.feature({
  "line": 1,
  "name": "Browser",
  "description": "",
  "id": "browser",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Browser",
  "description": "",
  "id": "browser;browser",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User opens the seek site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on login",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Inputs \"deepti.marathe@gmail.com\" and \"Rohan007\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "f1StepDef.user_opens_the_browser()"
});
formatter.result({
  "duration": 13848573390,
  "status": "passed"
});
formatter.match({
  "location": "f1StepDef.user_clicks_login()"
});
formatter.result({
  "duration": 226696475,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "deepti.marathe@gmail.com",
      "offset": 8
    },
    {
      "val": "Rohan007",
      "offset": 39
    }
  ],
  "location": "f1StepDef.user_closes_the_browser(String,String)"
});
formatter.result({
  "duration": 5043548464,
  "status": "passed"
});
formatter.match({
  "location": "f1StepDef.user_login_success()"
});
formatter.result({
  "duration": 225369657,
  "status": "passed"
});
});