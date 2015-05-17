/*
 * 
Bryan Cutkevin
5/10/2015
SCEA Interview - Software Development Engineer in Test  (SDET).
2207 Bridgepointe Parkway  San Mateo, CA 94404 (650) 655 8000 

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
 */

package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.Assert;

public class SeleniumTest
{
	public static void main(String[] args) throws InterruptedException
	{			
		
		//load created Firefox profile
		ProfilesIni allProfiles = new ProfilesIni();
		FirefoxProfile profile = allProfiles.getProfile("default");
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(false);					 
		
		//create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver(profile);
			
		//Put a Implicit wait, this means that any search for elements on the page could 
		//     take the time the implicit wait is set for before throwing exception		 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //Launch the Online Store Website
        driver.get("https://www.playstation.com/en-us/");
        driver.manage().window().maximize();		
        
        //verify PSN home page title
	    String psnHomePageTitle_WebElement = driver.getTitle();
	    //System.out.println( driver.getTitle() );
	    String pageTitle = new String("PlayStation® : PS4™, PS3™, PS Vita, PSP®, PS2™, PlayStation®Games - PlayStation®Store");
	    Assert.assertEquals(psnHomePageTitle_WebElement, pageTitle);
	    
	    //verify PSN status green check arrow appears
	    WebElement ele1 = driver.findElement(By.cssSelector(".large-title>img"));
	    ele1.toString();
	    //System.out.println(ele1.isDisplayed() ); 
	    Assert.assertNotNull(ele1);
	    	    
	    //verify Playstation Service status page title	   
	    driver.findElement(By.cssSelector(".large-title>img")).click();
	    Thread.sleep(3000L);
	    String psnServicePageTitle_WebElement = driver.getTitle();
	    //System.out.println( driver.getTitle() );
	    String psnServiceStatusPageTitle = new String("PSN status");
	    Assert.assertEquals(psnServicePageTitle_WebElement, psnServiceStatusPageTitle);
		    
	    //verify Account Management header/subtitle appears
	    WebElement ele2 = driver.findElement(By.cssSelector(".main-content>li") );
	    ele2.toString();
	    //System.out.println(ele2.isDisplayed() ); 
	    Assert.assertNotNull(ele2);
	    
	    //verify "green" icon appears for Account Management
	    WebElement ele3 = driver.findElement(By.cssSelector(".main-content>li") );
	    ele3.toString();
	    //System.out.println(ele1.isDisplayed() ); 
	    Assert.assertNotNull(ele3);	    
	    
	    //verify Sign In header/subtitle appears
	    WebElement ele4 = driver.findElement(By.cssSelector(".main-content>li") );
	    ele4.toString();
	    //System.out.println(ele4.isDisplayed() ); 
	    Assert.assertNotNull(ele4);	   
	    
	    //verify "green" icon appears for Sign In
	    WebElement ele5 = driver.findElement(By.cssSelector(".main-content>li") );
	    ele5.toString();
	    //System.out.println(ele1.isDisplayed() ); 
	    Assert.assertNotNull(ele5);	    	    
	    
	    //verify Playstation Store header/subtitle appears
	    WebElement ele6 = driver.findElement(By.cssSelector(".main-content>li") );
	    ele6.toString();
	    //System.out.println(ele6.isDisplayed() ); 
	    Assert.assertNotNull(ele6);	   
	    	    
	    //verify "green" icon appears for Playstation Store
	    WebElement ele7 = driver.findElement(By.cssSelector(".main-content>li") );
	    ele7.toString();
	    //System.out.println(ele7.isDisplayed() ); 
	    Assert.assertNotNull(ele7);	    	    	    
	    
	    //verify Purchase header/subtitle appears
	    WebElement ele8 = driver.findElement(By.cssSelector(".main-content>li") );
	    ele8.toString();
	    //System.out.println(ele8.isDisplayed() ); 
	    Assert.assertNotNull(ele8);	   
	  	    
	    //verify "green" icon appears for Purchase
	    WebElement ele9 = driver.findElement(By.cssSelector(".main-content>li") );
	    ele9.toString();
	    //System.out.println(ele9.isDisplayed() ); 
	    Assert.assertNotNull(ele9);	    	    	    
	    
	  	    
	    //close the web driver
	    driver.quit();
	}//end of main
}//end of class
	
