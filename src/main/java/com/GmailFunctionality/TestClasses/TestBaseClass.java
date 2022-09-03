package com.GmailFunctionality.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.GmaiFunctionality.UtilityClasses.ScreenshotClass;
import com.GmailFunctionality.POMClasses.LoginPagePOMClass;

public class TestBaseClass 
{
	WebDriver driver;
	Logger Log =Logger.getLogger("GmailFunctionalityProj");
	
	
	@Parameters ("browsername")
	@BeforeMethod
	public void setUpMethod(String browsername) throws IOException 
	{
		
		if(browsername.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", 
				"./DriverFolder/chromedriver.exe");
		
	    driver = new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", 
					"./DriverFolder/geckodriver.exe");
			
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Throw the error");
		}
		
		PropertyConfigurator.configure("log4j.Properties");
		Log.info("Browser is opened");
		
		driver.manage().window().maximize();
		Log.info("Browser is maximized");
		
		driver.get("https://gmail.com/");
		Log.info("URL is opened");
		
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	    LoginPagePOMClass lp = new LoginPagePOMClass (driver);
	    
	    lp.EmailIDorMobileNo();
	    lp.clickNextButton();
	    lp.sendPassword();
	    
	    ScreenshotClass .TakeScreenshot(driver);
	}
	
	 @AfterMethod
		public void tearDown()
		{
			//logOut
			
			//driver.quit();
			Log.info("browser is closed");
		}

}
