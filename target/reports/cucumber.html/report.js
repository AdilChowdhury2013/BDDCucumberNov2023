$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/OtherLogin.feature");
formatter.feature({
  "name": "Techfios Other billing login page functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CheckOtherFeature"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User enters the username as \"\u003cusername\u003e\" in the \"username\" field",
  "keyword": "When "
});
formatter.step({
  "name": "User enters the password as \"\u003cpassword\u003e\" in the \"password\" field",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on the signin button",
  "keyword": "When "
});
formatter.step({
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on \"bankCash\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on \"newAccount\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003caccountTitle\u003e\" in the \"accountTitle\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cdescription\u003e\" in the \"description\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cinitialBalance\u003e\" in the \"initialBalance\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003caccountNumber\u003e\" in the \"accountNumber\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003ccontactPerson\u003e\" in the \"contactPerson\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cPhone\u003e\" in the \"Phone\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cinternetBankingURL\u003e\" in the \"internetBankingURL\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on \"submit\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "Phone",
        "internetBankingURL"
      ]
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "Indiana Jones",
        "Diamond Acc",
        "5000",
        "SV105",
        "Mr X",
        "711",
        "https://www.natwest.com/"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_is_on_Techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CheckOtherFeature"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User enters the username as \"demo@techfios.com\" in the \"username\" field",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_the_username_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the password as \"abc123\" in the \"password\" field",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_the_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the signin button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_on_the_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"bankCash\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_on_the_bank_cash()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"newAccount\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_on_the_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Indiana Jones\" in the \"accountTitle\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.add_account_title(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Diamond Acc\" in the \"description\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.add_description(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"5000\" in the \"initialBalance\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.add_initialBalance(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"SV105\" in the \"accountNumber\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.add_accountNumber(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Mr X\" in the \"contactPerson\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.add_contactPerson(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"711\" in the \"Phone\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.add_Phone(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"https://www.natwest.com/\" in the \"internetBankingURL\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.add_IntertBankingURL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"submit\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefinition.accountCreatedValidation()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});