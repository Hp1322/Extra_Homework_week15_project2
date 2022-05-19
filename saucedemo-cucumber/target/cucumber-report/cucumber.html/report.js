$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 2,
  "name": "Search functionality",
  "description": "As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by High to Low filter.",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11820657700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User navigates saucedemo page and complete the item purchas",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchas",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on saucedemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I login with credential username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I filter the products by Price \"Price (low to high)\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select cheapest \u0026 costliest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter details firstname \"Harry\", lastName \"Messi\" and zipPostalCode \"100-200\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should be able to see message \"Thank you for your order\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PurchaseStep.iAmOnSaucedemoPage()"
});
formatter.result({
  "duration": 688238900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 34
    },
    {
      "val": "secret_sauce",
      "offset": 63
    }
  ],
  "location": "PurchaseStep.iLoginWithCredentialUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 1153402500,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseStep.iClickOnLoginButton()"
});
formatter.result({
  "duration": 629839100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (low to high)",
      "offset": 32
    }
  ],
  "location": "PurchaseStep.iFilterTheProductsByPrice(String)"
});
formatter.result({
  "duration": 348739000,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseStep.iSelectCheapestCostliestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 7133248800,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseStep.iOpenShoppingCart()"
});
formatter.result({
  "duration": 4233715200,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseStep.iGoToCheckout()"
});
formatter.result({
  "duration": 126185600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry",
      "offset": 27
    },
    {
      "val": "Messi",
      "offset": 45
    },
    {
      "val": "100-200",
      "offset": 71
    }
  ],
  "location": "PurchaseStep.iEnterDetailsFirstnameLastNameAndZipPostalCode(String,String,String)"
});
formatter.result({
  "duration": 583057500,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseStep.iClickOnContinueButton()"
});
formatter.result({
  "duration": 131984300,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseStep.iClickOnFinishButton()"
});
formatter.result({
  "duration": 226726500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thank you for your order",
      "offset": 33
    }
  ],
  "location": "PurchaseStep.iShouldBeAbleToSeeMessage(String)"
});
formatter.result({
  "duration": 83877100,
  "status": "passed"
});
formatter.after({
  "duration": 1377907400,
  "status": "passed"
});
});