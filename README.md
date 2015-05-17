# web_automation_examples
All web automation examples written found here

Bryan Cutkevin
1)SeleniumTest.java
BDD Automation Script Code Example
-This is a sample automation script that is a simple test in Cucumber using:  
	    
	 -Selenium WebDriver: 2.45
	 -Browser: Firefox 36.0.4
	 -Language: Java
	 -Unit test framework: JUnit
	 -Behavior Driven Development scenario with Gherkin
	     
Functional Requirements: Go to playstation.com, then to the "PSN" portal and verify
     health status of services:
     	-Account Management
     	-Sign In     	
     	-Playstation Store
     	-Purchase   

2)Test_Steps.java
Step Definition methods example
-This is a Step Definition class where methods designation with annotations are 
 followed by a "pattern" used to link the Step Definition to all the matching. 
 Cucumber will execute when it sees a Gherkin Step finding the Step Definition...
 
	 -Language: Java
	 -Unit test framework: JUnit
	 -Selenium WebDriver: 2.45
	 -Browser: Firefox 36.0.4
	 
3)PSNHealthFeature.feature

4)TestRunner.java
JUnit Test Runner Class Example
-This is the test class to run the BDD test. This class will run our Cucumber tests
using uses Junit framework to run. Using a Test Runner class and Junit annotation
 @RunWith(). We create a new Class file in the ‘cucumberTest‘ package and name it as
 ‘TestRunner‘. Using:  
	    
	 -Language: Java
	 -Unit test framework: JUnit
