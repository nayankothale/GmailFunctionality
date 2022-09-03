package com.GmailFunctionality.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPOMClass 
{
	 WebDriver driver ;
		Actions Act ;
		
	   @FindBy(xpath="//img[@class='gb_Ba gbii']")
	   private WebElement 	AccImg;
		
		public void ClickonAccImg()
		{
			AccImg.click();
			
		}
		
		 @FindBy(xpath="//a[@id='logout_sidebar_link']")
		 private WebElement LogoutButton;
			
			public void ClickonLogoutButton()
			{
				LogoutButton.click();
		
			}
			
			
			public LogoutPOMClass (WebDriver driver)
			{
				this.driver =driver;
				
				PageFactory.initElements(driver, this);
				 Act =new Actions(driver);
			}
			
			
		
}
