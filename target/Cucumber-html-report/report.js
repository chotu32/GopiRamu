$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "MyBeepr Web-Login",
  "description": "",
  "id": "mybeepr-web-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verify login functionality of MyBeepr",
  "description": "",
  "id": "mybeepr-web-login;verify-login-functionality-of-mybeepr",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I navigate to \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter user \"\u003cuserName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter pswd \"\u003cpassoword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I navigate to dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I close browser instance",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "mybeepr-web-login;verify-login-functionality-of-mybeepr;",
  "rows": [
    {
      "cells": [
        "url",
        "userName",
        "passoword"
      ],
      "line": 13,
      "id": "mybeepr-web-login;verify-login-functionality-of-mybeepr;;1"
    },
    {
      "cells": [
        "url",
        "validUsername",
        "validPassword"
      ],
      "line": 14,
      "id": "mybeepr-web-login;verify-login-functionality-of-mybeepr;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 97902100,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify login functionality of MyBeepr",
  "description": "",
  "id": "mybeepr-web-login;verify-login-functionality-of-mybeepr;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I navigate to \"url\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter user \"validUsername\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter pswd \"validPassword\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I navigate to dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I close browser instance",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "url",
      "offset": 15
    }
  ],
  "location": "MyBeeprStepDef.i_navigate_to(String)"
});
formatter.result({
  "duration": 10526928600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "validUsername",
      "offset": 14
    }
  ],
  "location": "MyBeeprStepDef.i_enter_user(String)"
});
formatter.result({
  "duration": 2770007500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "validPassword",
      "offset": 14
    }
  ],
  "location": "MyBeeprStepDef.i_enter_pswd(String)"
});
formatter.result({
  "duration": 2183437700,
  "status": "passed"
});
formatter.match({
  "location": "MyBeeprStepDef.i_click_on_Sign_in_button()"
});
formatter.result({
  "duration": 2167390000,
  "status": "passed"
});
formatter.match({
  "location": "MyBeeprStepDef.i_navigate_to_dashboard_page()"
});
formatter.result({
  "duration": 60400,
  "status": "passed"
});
formatter.match({
  "location": "MyBeeprStepDef.i_close_browser_instance()"
});
formatter.result({
  "duration": 2450646900,
  "status": "passed"
});
});