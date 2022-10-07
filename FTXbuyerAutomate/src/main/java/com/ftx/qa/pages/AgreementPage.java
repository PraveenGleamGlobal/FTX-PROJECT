package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;

public class AgreementPage extends TestBase {
	
	@FindBy(xpath="//span[text()='Accept Agreement']")
	public static WebElement acceptagreementlink;
	
	@FindBy(xpath="//button[@type='button']")
	public static WebElement acceptbutton;
	
	public AgreementPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public static void verifyAcceptAgreementLink() {
		
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", acceptagreementlink);
		
	}
	
	public static void verifyAcceptButton() {
		
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", acceptbutton);
	}
}
