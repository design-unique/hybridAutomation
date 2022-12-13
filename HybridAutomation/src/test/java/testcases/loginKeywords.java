package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utilities.browserEngine;
import utilities.elementsLocator;
import utilities.testData;

public class loginKeywords {
	
	public static WebDriver driver;
	
	  public static void openBrowser() throws InterruptedException {
		
		//TS_001 Open the Browser
		driver=browserEngine.browserConfig();	
		//delay 2 sec
		  Thread.sleep(2000);
	  }

public static void loadAUT() throws InterruptedException {
	  
	  //TS_002 Navigate to Website
	  driver.get(testData.loginpageURL);
	  
	  //delay 2 sec
	  Thread.sleep(2000);
}


public static void loginTitlevalidate() throws InterruptedException {
	  
	  //TS_003 Validate login page Title
	  String loginpageactualTitle=driver.getTitle();
	  
	  Assert.assertEquals(loginpageactualTitle, testData.loginpageExpectedTitle);
	  
	  //delay 2 sec
	  Thread.sleep(2000);
}


public static void loginFunctionality() {
	  
	  //TS_004 Login Functionality
	  //identify the userID
	  driver.findElement(elementsLocator.loginUIDelement).sendKeys(testData.loginUID);
	  
	  //identify the userPW
	  driver.findElement(elementsLocator.loginPWelement).sendKeys(testData.loginPW);
	  
	  //click on checkbox
	  driver.findElement(elementsLocator.loginCheckbox).click();
	  
	  //click on signin button
	  driver.findElement(elementsLocator.loginpageSignin).click();	  
}


public static void afterloginTitlevalidate() {
	  
	  //TS_005 Validate after login page Title
	  String afterloginactualTitle=driver.getTitle();
	  
	  Assert.assertEquals(afterloginactualTitle, testData.afterloginpageExpectedTitle);
	  
}


public static void logoutFunctionality() {
	  
	  //TS_006 Logout Functionality
	  //click on dropdown button
	  driver.findElement(elementsLocator.logoutDropdown).click();
	  
	  //click on logout button
	  driver.findElement(elementsLocator.logoutButtonfromlogin).click();
}


public static void closeBrowser() {
	  
	  //TS_007 Close the Browser
	  driver.close();
}

}
