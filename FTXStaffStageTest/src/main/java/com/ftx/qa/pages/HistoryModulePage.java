package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;

public class HistoryModulePage extends TestBase {

	@FindBy(xpath="//span[text()='History']")
	public static WebElement historylink;
	
	@FindBy(xpath="//a[contains(text(),'Dashboard')]")
	public static WebElement backdashboardpage;
	
	public HistoryModulePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public static void verifyHistoryModule() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", historylink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", backdashboardpage);
	}
}







