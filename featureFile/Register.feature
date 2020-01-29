Feature: Register 
@Data-Driven
Scenario: Register on TestMe App 
	Given user open Testme App 
	When user click singup 
	And enter user name as "ThoreUppu" 
	And  enter first name as "Uppu" 
	And   enter last name as "Thore" 
	And  enter password as "abcd1234"
	And  enter confirm password as "abcd1234"
	And  user select gender as "Male"
	And  enter email  as "ab123@gmail.com"
	And  enter mobile Number as "1234567894"
	And  enter DOB as "01/01/2000"
	And  enter address as "hyderabad is my home town"
	And  enter security question as "what is your birth place ?"
	And  enter answer as "HYD"
	Then user click on Register
	
	
	
	@loginpg
	Scenario: Login using datatable
	Given user open TestMeApp
	When user click signin
	And user enter credinatials as
	|ThoreUppu|
	|abcd1234|
	Then user click login
	
	
	@searchproduct
	Scenario: search for product
	Given user open TestMeapp3
	When user click signin1
	And user enter credinatial as
	|ThoreUppu|
	|abcd1234|
	And user click login1
	And search product
	|Head|
	And click on find Details button
	Then clicks on add to cart 
	