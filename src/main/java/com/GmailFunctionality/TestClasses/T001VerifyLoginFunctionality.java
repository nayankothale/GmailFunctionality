package com.GmailFunctionality.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.GmaiFunctionality.UtilityClasses.ScreenshotClass;
import com.GmailFunctionality.POMClasses.LoginPagePOMClass;

public class T001VerifyLoginFunctionality extends TestBaseClass 
{

	    @Test
	  public void loginFunctionality()   //----> main function
	  {

			//validation
	        String expectedTitle = "Gmail";	   //given	
			
			String actualTitle = driver.getTitle();  //actual
			
			if(expectedTitle.equals(actualTitle))
			{
				Log.info("we have successfully logined to Gmail ");
				Log.info("Test case is passed");
			}
			else
			{
				Log.info ("Test case is failed");
			}	

	  }
	   

	    
	
}

