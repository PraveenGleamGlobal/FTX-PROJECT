package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;

public class InstallationModulePage extends TestBase {

	@FindBy(xpath="//i[@class='fas fa-cogs']/following-sibling::span[1]")
	public static WebElement installationlink;
	
	@FindBy(xpath="//ul[@class='mm-collapse mm-show']//a")
	public static WebElement pendinglink;
	
	@FindBy(xpath="//span[contains(@class,'badge badge-danger')]")
	public static WebElement installbutton;
	
	@FindBy(xpath="//input[@placeholder='Bot Count']")
	public static WebElement botcount;
	

	@FindBy(xpath="//input[@class='form-control appcount']")
	public static WebElement appcount;
	

	@FindBy(xpath="//a[contains(@class,'btn light')]")
	public static WebElement clickherebutton;
	
	public InstallationModulePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public static void verifyInstallationLink() throws InterruptedException {
		
		//installationlink.click();
		
		Thread.sleep(2000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", installationlink);
		

		Thread.sleep(2000);
		JavascriptExecutor executor2= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", pendinglink);
		
		Thread.sleep(2000);
		JavascriptExecutor executor3= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", installbutton);
		
		Thread.sleep(2000);
		botcount.sendKeys("2");
		
		Thread.sleep(2000);
		appcount.sendKeys("3");
		
		Thread.sleep(2000);
		JavascriptExecutor executor4= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", clickherebutton);
		
		
	}
	
	
	
	
	
}