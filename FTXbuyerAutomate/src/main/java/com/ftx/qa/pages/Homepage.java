package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;

public class Homepage extends TestBase {

	@FindBy(xpath="//span[text()='Profile']")
	public static WebElement profilelink;
	
	@FindBy(xpath="//i[@class='fas fa-headset']")
	public static WebElement supportlink;
	
	public Homepage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public static void verifyProfilelink() {
		
		
		//profilelink.click();
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", profilelink);
		
	}
	
	public static void verifySupportlink() {
		
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", supportlink);
		
	}
}
