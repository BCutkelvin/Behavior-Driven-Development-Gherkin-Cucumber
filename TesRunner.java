/* 
 * 
Bryan Cutkevin
5/10/2015
SCEA Interview - Software Development Engineer in Test  (SDET).
2207 Bridgepointe Parkway  San Mateo, CA 94404 (650) 655 8000 


JUnit Test Runner Class Example
-This is the test class to run the BDD test. This class will run our Cucumber tests
using uses Junit framework to run. Using a Test Runner class and Junit annotation
 @RunWith(). We create a new Class file in the ‘cucumberTest‘ package and name it as
 ‘TestRunner‘. Using:  
	    
	 -Language: Java
	 -Unit test framework: JUnit	     
 */

package cucumberTest;
 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//JUnit that tests should run using Cucumber class 
@RunWith( Cucumber.class)

//This annotation tells Cucumber where to look 
//  for feature files
@CucumberOptions
(	
		features = "Feature"
		, glue = {"stepDefinition"}
		
)

public class TestRunner
{
}
