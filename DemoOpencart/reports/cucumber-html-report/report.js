$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Opencart.feature");
formatter.feature({
  "line": 2,
  "name": "Opencart website",
  "description": "",
  "id": "opencart-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Testcase_Feature"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Login with Valid details",
  "description": "",
  "id": "opencart-website;login-with-valid-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tc01_login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "a user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the user opens opencart login page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user login using username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "the user close the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Stepdefination.a_user_launch_the_browser()"
});
formatter.result({
  "duration": 22202108800,
  "status": "passed"
});
formatter.match({
  "location": "Login_Stepdefination.the_user_opens_opencart_login_page()"
});
formatter.result({
  "duration": 2829811200,
  "status": "passed"
});
formatter.match({
  "location": "Login_Stepdefination.the_user_login_using_username_and_password()"
});
formatter.result({
  "duration": 9347138500,
  "status": "passed"
});
formatter.match({
  "location": "Login_Stepdefination.the_user_close_the_login_page()"
});
formatter.result({
  "duration": 333946400,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Search the Product",
  "description": "",
  "id": "opencart-website;search-the-product",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@tc02_Search"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "the user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "the user opens the open cart search \u003cname\u003e page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "the user search the product",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "the user close the browesr",
  "keyword": "Then "
});
formatter.match({
  "location": "Search_Stepdefination.the_user_launch_the_browser()"
});
formatter.result({
  "duration": 13615707400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cname\u003e",
      "offset": 36
    }
  ],
  "location": "Search_Stepdefination.the_user_opens_the_open_cart_search_page(String)"
});
formatter.result({
  "duration": 3877231800,
  "status": "passed"
});
formatter.match({
  "location": "Search_Stepdefination.the_user_search_the_product()"
});
formatter.result({
  "duration": 6516329600,
  "status": "passed"
});
formatter.match({
  "location": "Search_Stepdefination.the_user_close_the_browesr()"
});
formatter.result({
  "duration": 186563000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 22,
  "name": "Add to Cart",
  "description": "",
  "id": "opencart-website;add-to-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@tc03_AddToCart"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "the user launches the browser in chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "the user opens the cart and search  product called \u003cname\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "the user searches the product and choose",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "the user add the product into cart",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "the user closees the browser and quit",
  "keyword": "Then "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "opencart-website;add-to-cart;",
  "rows": [
    {
      "cells": [
        "name"
      ],
      "line": 29,
      "id": "opencart-website;add-to-cart;;1"
    },
    {
      "cells": [
        "IMAC"
      ],
      "line": 30,
      "id": "opencart-website;add-to-cart;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 30,
  "name": "Add to Cart",
  "description": "",
  "id": "opencart-website;add-to-cart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Testcase_Feature"
    },
    {
      "line": 21,
      "name": "@tc03_AddToCart"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "the user launches the browser in chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "the user opens the cart and search  product called IMAC",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "the user searches the product and choose",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "the user add the product into cart",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "the user closees the browser and quit",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTocart_Stepdefination.the_user_launches_the_browser_in_chrome()"
});
formatter.result({
  "duration": 13311795000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IMAC",
      "offset": 51
    }
  ],
  "location": "AddTocart_Stepdefination.the_user_opens_the_cart_and_search_page_called(String)"
});
formatter.result({
  "duration": 930714100,
  "status": "passed"
});
formatter.match({
  "location": "AddTocart_Stepdefination.the_user_searches_the_product_and_choose()"
});
formatter.result({
  "duration": 5395509900,
  "status": "passed"
});
formatter.match({
  "location": "AddTocart_Stepdefination.the_user_add_the_product_into_cart()"
});
formatter.result({
  "duration": 3625526400,
  "status": "passed"
});
formatter.match({
  "location": "AddTocart_Stepdefination.the_user_closees_the_browser_and_quit()"
});
formatter.result({
  "duration": 185794900,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Compare the products",
  "description": "",
  "id": "opencart-website;compare-the-products",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@tc04_Comparison"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "the user launched the browser in chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "the user compared the two products",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "the user will see product comparison",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "the user closed the browser after comparsion",
  "keyword": "Then "
});
formatter.match({
  "location": "Compare_Stepdefination.the_user_launched_the_browser_in_chrome()"
});
formatter.result({
  "duration": 13575162800,
  "status": "passed"
});
formatter.match({
  "location": "Compare_Stepdefination.the_user_compared_the_two_products()"
});
formatter.result({
  "duration": 7028729500,
  "status": "passed"
});
formatter.match({
  "location": "Compare_Stepdefination.the_user_will_see_product_comparison()"
});
formatter.result({
  "duration": 6806783000,
  "status": "passed"
});
formatter.match({
  "location": "Compare_Stepdefination.the_user_closed_the_browser_after_comparsion()"
});
formatter.result({
  "duration": 706253400,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Select the brand and add to wishlist",
  "description": "",
  "id": "opencart-website;select-the-brand-and-add-to-wishlist",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@tc05_Brands"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "the user launching the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "the user clicks on brands",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "the user selects the brand",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "the user add the product to wishlist",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "the user quits the chrome",
  "keyword": "Then "
});
formatter.match({
  "location": "Brand_Stepdefination.the_user_launching_the_chrome_browser()"
});
formatter.result({
  "duration": 15311454200,
  "status": "passed"
});
formatter.match({
  "location": "Brand_Stepdefination.the_user_clicks_on_brands()"
});
formatter.result({
  "duration": 5369224100,
  "status": "passed"
});
formatter.match({
  "location": "Brand_Stepdefination.the_user_selects_the_brand()"
});
formatter.result({
  "duration": 6601660800,
  "status": "passed"
});
formatter.match({
  "location": "Brand_Stepdefination.the_user_add_the_product_to_wishlist()"
});
formatter.result({
  "duration": 3823523000,
  "status": "passed"
});
formatter.match({
  "location": "Brand_Stepdefination.the_user_quits_the_chrome()"
});
formatter.result({
  "duration": 236470400,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
  "name": "Special offers in opencart website",
  "description": "",
  "id": "opencart-website;special-offers-in-opencart-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 47,
      "name": "@tc06_Special"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "the user to open browser chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 50,
  "name": "the user clicks on the specials",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "the user will see the specials and add to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "the user close the site and browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Specials_Stepdefination.the_user_to_open_browser_chrome()"
});
formatter.result({
  "duration": 14306699800,
  "status": "passed"
});
formatter.match({
  "location": "Specials_Stepdefination.the_user_clicks_on_the_specials()"
});
formatter.result({
  "duration": 6704991700,
  "status": "passed"
});
formatter.match({
  "location": "Specials_Stepdefination.the_user_will_see_the_specials_and_add_to_the_cart()"
});
formatter.result({
  "duration": 13632627500,
  "status": "passed"
});
formatter.match({
  "location": "Specials_Stepdefination.the_user_close_the_site_and_browser()"
});
formatter.result({
  "duration": 194733400,
  "status": "passed"
});
formatter.scenario({
  "line": 55,
  "name": "Check review page is valid",
  "description": "",
  "id": "opencart-website;check-review-page-is-valid",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 54,
      "name": "@tc_07_Review"
    }
  ]
});
formatter.step({
  "line": 56,
  "name": "Click on MP3 Players",
  "keyword": "Given "
});
formatter.step({
  "line": 57,
  "name": "Click on Show all MP3 players",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "Click on IPod Suffle",
  "keyword": "Then "
});
formatter.step({
  "line": 59,
  "name": "Click on Reviews",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "enter review details in details feild",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "click on continue",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 11
    }
  ],
  "location": "Review_Stepdefination.click_on_MP_Players(int)"
});
formatter.result({
  "duration": 13704422100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 20
    }
  ],
  "location": "Review_Stepdefination.click_on_Show_all_MP_players(int)"
});
formatter.result({
  "duration": 3364607000,
  "status": "passed"
});
formatter.match({
  "location": "Review_Stepdefination.click_on_IPod_Suffle()"
});
formatter.result({
  "duration": 4435339900,
  "status": "passed"
});
formatter.match({
  "location": "Review_Stepdefination.click_on_Reviews()"
});
formatter.result({
  "duration": 500406400,
  "status": "passed"
});
formatter.match({
  "location": "Review_Stepdefination.enter_review_details_in_details_feild()"
});
formatter.result({
  "duration": 1600655100,
  "status": "passed"
});
formatter.match({
  "location": "Review_Stepdefination.click_on_continue()"
});
formatter.result({
  "duration": 1901082100,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 64,
  "name": "Contact to the opencart for quries",
  "description": "",
  "id": "opencart-website;contact-to-the-opencart-for-quries",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 63,
      "name": "@tc08_Contactus"
    }
  ]
});
formatter.step({
  "line": 65,
  "name": "the customer open the cart in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 66,
  "name": "the user click on contact us in website",
  "keyword": "When "
});
formatter.step({
  "line": 67,
  "name": "the user should fill the form of \"\u003cName\u003e\" \"\u003cmailid\u003e\" \"\u003ccomplaint\u003e\" which is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 68,
  "name": "the user click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 69,
  "name": "user will close the website and browser",
  "keyword": "And "
});
formatter.examples({
  "line": 70,
  "name": "",
  "description": "",
  "id": "opencart-website;contact-to-the-opencart-for-quries;",
  "rows": [
    {
      "cells": [
        "Name",
        "mailid",
        "complaint"
      ],
      "line": 71,
      "id": "opencart-website;contact-to-the-opencart-for-quries;;1"
    },
    {
      "cells": [
        "Praveen Akula",
        "praveenakula179@gmail.com",
        "To know about the previous order"
      ],
      "line": 72,
      "id": "opencart-website;contact-to-the-opencart-for-quries;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 72,
  "name": "Contact to the opencart for quries",
  "description": "",
  "id": "opencart-website;contact-to-the-opencart-for-quries;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Testcase_Feature"
    },
    {
      "line": 63,
      "name": "@tc08_Contactus"
    }
  ]
});
formatter.step({
  "line": 65,
  "name": "the customer open the cart in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 66,
  "name": "the user click on contact us in website",
  "keyword": "When "
});
formatter.step({
  "line": 67,
  "name": "the user should fill the form of \"Praveen Akula\" \"praveenakula179@gmail.com\" \"To know about the previous order\" which is displayed",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 68,
  "name": "the user click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 69,
  "name": "user will close the website and browser",
  "keyword": "And "
});
formatter.match({
  "location": "Contactus_Stepdefination.the_customer_open_the_cart_in_the_browser()"
});
formatter.result({
  "duration": 14059266100,
  "status": "passed"
});
formatter.match({
  "location": "Contactus_Stepdefination.the_user_click_on_contact_us_in_website()"
});
formatter.result({
  "duration": 2656023300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Praveen Akula",
      "offset": 34
    },
    {
      "val": "praveenakula179@gmail.com",
      "offset": 50
    },
    {
      "val": "To know about the previous order",
      "offset": 78
    }
  ],
  "location": "Contactus_Stepdefination.the_user_should_fill_the_form_of_which_is_displayed(String,String,String)"
});
formatter.result({
  "duration": 4769356400,
  "status": "passed"
});
formatter.match({
  "location": "Contactus_Stepdefination.the_user_click_the_submit_button()"
});
formatter.result({
  "duration": 3219972800,
  "status": "passed"
});
formatter.match({
  "location": "Contactus_Stepdefination.user_will_close_the_website_and_browser()"
});
formatter.result({
  "duration": 396414000,
  "status": "passed"
});
});