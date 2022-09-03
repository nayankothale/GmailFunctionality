package com.GmailFunctionality.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ComposeMailPOMClass 
{
	WebDriver driver;

	
	@FindBy(xpath="//div[@class='T-I T-I-KE L3']")
    WebElement ComposeButton ;
	
	public void clickComposeButton()
	{
		ComposeButton.click();
				
	}
	//Add Recipients
	@FindBy(xpath="//div[@id=':12v']")
	private WebElement mailTo ;
	
	public void addRecipients()
	{
		mailTo.sendKeys("nayankothale19@gmail.com" );
	}
	//Add Subject
	
	@FindBy(xpath="//input[@id=':110']")
	private WebElement AddSubject ;
	
	public void AddSubject()
	{
		AddSubject.sendKeys("Incubyte");
	}
	
	//Add MailBody
	
	@FindBy(xpath="//div[@id=':zu']")
	private WebElement MailBody;
	
	public void MailBody()
	{
		MailBody.sendKeys("Automation QA test for Incubyte");
	}
	
	//Click on SendButton
	
		@FindBy(xpath="//div[@id=':11a']")
		private WebElement SendButton;
		
		public void clickSendButton()
		{
			SendButton.click();
		}
	public ComposeMailPOMClass(WebDriver driver)
	{
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	
	}
	
	
	
}
