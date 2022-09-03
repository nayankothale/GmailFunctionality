package com.GmailFunctionality.POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass

{
	
	WebDriver driver;
	
	
	@FindBy(xpath="//input[@id='identifierId']")
	private WebElement EmailIDorMobileNo;
	
	//UserName
	   public void EmailIDorMobileNo()
	   {
		EmailIDorMobileNo.sendKeys("nayankothale19@gmail.com");
	   }
	
	//NextButton
			@FindBy(xpath="//span[text()='Next']")
			private WebElement NextButton;
			
			public void clickNextButton()
			{
				NextButton.click();
		     }
			

	  //password
		@FindBy(xpath="//input[@type='password']")
		private WebElement passWord;
		
		//action
		public void sendPassword()
		{
			passWord.sendKeys("Shreeja@123");
			
		}
		
		@FindBy(xpath="//span[text()='Next']")
		private WebElement NextButtonforlogin;
		
		public void clickNextButtonforlogin()
		{
			NextButtonforlogin.click();
	     }
		
		

		public LoginPagePOMClass(WebDriver driver)
		{
			this.driver =driver;
			
			PageFactory.initElements(driver, this);
					}
		

	

}
