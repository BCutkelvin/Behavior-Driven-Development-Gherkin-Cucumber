/*
Bryan Cutkevin
5/10/2015

Step Definition methods example
-This is a Step Definition class where methods designation with annotations are 
 followed by a "pattern" used to link the Step Definition to all the matching. 
 Cucumber will execute when it sees a Gherkin Step finding the Step Definition...
 
	 -Language: Java
	 -Unit test framework: JUnit
	 -Selenium WebDriver: 2.45
	 -Browser: Firefox 36.0.4	 
 */

package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Test_Steps
{
	public static WebDriver driver;
	
     @Given("^User is on the PSN Home Page$")
     public void verifyUserOnPSNHomePage() throws Throwable
     {
    	 driver = new FirefoxDriver();
    	 driver.get("https://www.playstation.com/en-us/");
         driver.manage().window().maximize();		       
     }
     
     @Then("^PSN green arrow icon appears in Header$")
     public void verifyPSNHeaderGreenHealthIconAppears() throws Throwable
     {
    	WebElement ele1 = driver.findElement(By.cssSelector(".large-title>img"));
  	    ele1.toString();  	    
  	    Assert.assertNotNull(ele1);    	 
     }
     
     @Given("^the PSN Home page has loaded$")
     public void verifyPSNHomePageLoads() throws Throwable
     {
    	String psnHomePageTitle_WebElement = driver.getTitle(); 	    
 	    String pageTitle = new String("PlayStation® : PS4™, PS3™, PS Vita, PSP®, PS2™, PlayStation®Games - PlayStation®Store");
 	    Thread.sleep(3000L);
 	    Assert.assertEquals(psnHomePageTitle_WebElement, pageTitle); 	    
     }    
     
     @When("^PSN Service page has loaded$")
     public void verifyPsnServicePageLoads1() throws Throwable
     {
    	driver.findElement(By.cssSelector(".large-title>img")).click();
  	    Thread.sleep(3000L);
  	    String psnServicePageTitle_WebElement = driver.getTitle();
  	    String psnServiceStatusPageTitle = new String("PSN status");
  	    Assert.assertEquals(psnServicePageTitle_WebElement, psnServiceStatusPageTitle);  	
     }
             
     @Then("^Account Management header/subtitle appears$")
     public void verifyAcctMgmtSubtitle() throws Throwable
     {    	   	    
    	driver.findElement(By.cssSelector(".large-title>img")).click();
   	    Thread.sleep(3000L);   	  
    	WebElement ele2 = driver.findElement(By.cssSelector(".main-content>li") );
 	    ele2.toString(); 	    
 	    Assert.assertNotNull(ele2); 	  
     }
             
     @Then("^Account Management header/subtitle green status icon appears$")
     public void verifyAcctMgmtGreenIcon() throws Throwable
     {
     	WebElement ele2 = driver.findElement(By.cssSelector(".main-content>li") );
  	    ele2.toString();  	     
  	    Assert.assertNotNull(ele2);  	  
     }
                
     @Then("^Sign In header/subtitle appears$")
     public void verifySignInSubtitleAppears() throws Throwable
     {           	   
    	WebElement ele4 = driver.findElement(By.cssSelector(".main-content>li") );
 	    ele4.toString();
 	    Assert.assertNotNull(ele4);	    	    
     }            
          
     @Then("^Sign In header/subtitle green status icon appears$")
     public void verifySignInGreenIcon() throws Throwable
     {
        WebElement ele5 = driver.findElement(By.cssSelector(".main-content>li") );
 	    ele5.toString(); 	     
 	    Assert.assertNotNull(ele5);	  
     }     
                  
     @Then("^Playstation Store header/subtitle appears$")
     public void verifyPSNStoreSubtitleAppears() throws Throwable
     {
    	WebElement ele6 = driver.findElement(By.cssSelector(".main-content>li") );
 	    ele6.toString(); 	    
 	    Assert.assertNotNull(ele6);	    	    	 
     }
               
     @Then("^Playstation Store header/subtitle green status icon appears$")
     public void verifyPlaystationGreenIcon() throws Throwable
     {
     	WebElement ele7 = driver.findElement(By.cssSelector(".main-content>li") );
 	    ele7.toString(); 	     
 	    Assert.assertNotNull(ele7);	    	    	     	    
     }
     
     @Then("^Purchase header/subtitle green status icon appears$")
     public void verifyPurchaseStatusGreenIconAppears() throws Throwable
     {
     	WebElement ele8 = driver.findElement(By.cssSelector(".main-content>li") );
    	ele8.toString(); 	     
 	    Assert.assertNotNull(ele8);	    	    	     	    
     }
     
}//end class Test_Steps
