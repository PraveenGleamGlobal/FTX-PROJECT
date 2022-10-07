package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;

public class AgreementPage extends TestBase {

	@FindBy(xpath="(//span[@class='nav-text'])[3]")
	public static WebElement agreementmodulelink;
	
	@FindBy(xpath="(//li[@class='mm-active']//a)[2]")
	public static WebElement agreementsentlink;
	
	@FindBy(xpath="//span[contains(@class,'badge badge-info')]")
	public static WebElement clickherebutton;
	
	public AgreementPage() {
		PageFactory.initElements(driver, this);
	}
	
	public static void verifyAgreementModuleLink() {
		
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", agreementmodulelink);
		
		JavascriptExecutor executor2= (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", agreementsentlink);
		
		JavascriptExecutor executor3= (JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();",clickherebutton);
	}
}
