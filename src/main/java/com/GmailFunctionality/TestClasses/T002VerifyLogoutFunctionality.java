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
import com.GmailFunctionality.POMClasses.LogoutPOMClass;

public class T002VerifyLogoutFunctionality extends TestBaseClass
{
	
	@Test
	public void logoutFunctionality()
	{
		  //validation
	        String ExpectedTitle = "Swag Labs";	   //given	
			
			String actualTitle = driver.getTitle();  //actual

			if(ExpectedTitle.equals(actualTitle))
			{
				System.out.println("we have successfully logged out ");
			System.out.println("Test case is passed");
			}
			else
			{
				System.out.println("Test case is failed");
			}
	}
			

			
	    
	    
	
	
}
