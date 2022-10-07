package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;

public class VirtualSignaturePage extends TestBase {
	
	@FindBy(xpath="//span[text()='Virtual Signature']")
	public static WebElement VirtualSignature;

	@FindBy(xpath="//div[@id='sig']//canvas[1]")
	public static WebElement signature;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement uploadbutton;
	
	public VirtualSignaturePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public static void verifyVirtualSignature() {
		
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", VirtualSignature);
	}
	
	public static void verifysignauture() {
		
		  Actions builder = new Actions(driver);
          Action drawAction = builder.moveToElement(signature)
                    .clickAndHold()
                    .moveByOffset(-50, 60)
                    .moveByOffset(-60, -70)
                    .moveByOffset(150, 60) 
                    .moveByOffset(-60, -70)
                    .doubleClick()
                    .build();
          drawAction.perform();
          
          

  		JavascriptExecutor executor= (JavascriptExecutor)driver;
  		executor.executeScript("arguments[0].click();", uploadbutton);
	}
	
	
}
