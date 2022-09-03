package com.GmailFunctionality.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.GmaiFunctionality.UtilityClasses.ScreenshotClass;
import com.GmailFunctionality.POMClasses.ComposeMailPOMClass;
import com.GmailFunctionality.POMClasses.LoginPagePOMClass;

public class T003VerifyComposeMailFunctionality extends TestBaseClass
{
	
	@Test
	public void ComposeMailFunctionality() throws IOException
	{
		
		ComposeMailPOMClass Hp = new ComposeMailPOMClass(driver);
	    Hp.clickComposeButton();
	    ScreenshotClass .TakeScreenshot(driver);
	    
	    Hp.addRecipients();
	    
	    Hp.AddSubject();
	    
	    Hp.MailBody();
	    
	    Hp.clickSendButton();
	  
	    ScreenshotClass .TakeScreenshot(driver);
	    
	  
	}
	
}
