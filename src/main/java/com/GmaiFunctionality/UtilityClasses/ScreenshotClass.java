package com.GmaiFunctionality.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass 
{
	public static void TakeScreenshot(WebDriver driver) throws IOException
	{
	Date date = new Date(); 
    String FileName = date.toString().replace(":", "_").replace(" ", "_") + ".jpg";
	TakesScreenshot Ts = (TakesScreenshot)driver;
	File SourceFile =Ts.getScreenshotAs(OutputType.FILE);
	File DestFile =new File("./ScreenshotFolder/GmailFunctionality.jpg"+FileName);
	
	FileHandler.copy(SourceFile, DestFile);
	System.out.println("Screeshot taken");
	}
	
}
