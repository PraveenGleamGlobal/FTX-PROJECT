package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;

public class TodayChecklistModulePage extends TestBase {

	@FindBy(xpath="(//i[contains(@class,'side-menu__icon typcn')]/following-sibling::span)[2]")
	public static WebElement todaychecklistlink;
	
	@FindBy(xpath="//a[normalize-space()='Home']")
	public static WebElement homelink;
	
	public TodayChecklistModulePage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public static void verifyChecklistModule() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", todaychecklistlink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click()", homelink);
	}
}