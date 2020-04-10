@Testcase_Feature
Feature: Opencart website


@tc01_login
Scenario: Login with Valid details
 Given a user launch the browser
 When the user opens opencart login page
 Then the user login using username and password
 Then the user close the login page
 
 
 
 @tc02_Search
 Scenario: Search the Product
 Given the user launch the browser
 When the user opens the open cart search <name> page
 Then the user search the product
 Then the user close the browesr
 
 @tc03_AddToCart
 Scenario Outline: Add to Cart
 Given the user launches the browser in chrome
 When the user opens the cart and search  product called <name>
 Then the user searches the product and choose
 Then the user add the product into cart
 Then the user closees the browser and quit
 Examples:
 |name|
 |IMAC|
 
 @tc04_Comparison
 Scenario: Compare the products
 Given the user launched the browser in chrome
 When the user compared the two products
 Then the user will see product comparison
 Then the user closed the browser after comparsion
 
 @tc05_Brands
 Scenario: Select the brand and add to wishlist
 Given the user launching the chrome browser
 When the user clicks on brands
 Then the user selects the brand
 Then the user add the product to wishlist
 Then the user quits the chrome
 
 @tc06_Special
 Scenario: Special offers in opencart website
 Given the user to open browser chrome
 When the user clicks on the specials
 Then the user will see the specials and add to the cart
 Then the user close the site and browser
 
 @tc_07_Review
  Scenario: Check review page is valid 
  Given Click on MP3 Players
  Then  Click on Show all MP3 players
  Then Click on IPod Suffle
  Then  Click on Reviews
  Then enter review details in details feild
  And click on continue
 
 @tc08_Contactus 
Scenario Outline: Contact to the opencart for quries 
	Given the customer open the cart in the browser 
	When the user click on contact us in website 
	Then the user should fill the form of "<Name>" "<mailid>" "<complaint>" which is displayed 
	Then the user click the submit button 
	And user will close the website and browser 
Examples: 
        |Name          |mailid                      |complaint                       |
		|Praveen Akula |praveenakula179@gmail.com   |To know about the previous order|
 