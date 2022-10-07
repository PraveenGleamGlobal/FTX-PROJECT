package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;

public class UpdateEnquiryPage extends TestBase {

	@FindBy(xpath="//span[text()='Update Enquiry']")
	public static WebElement updateenquirylink;
	
	@FindBy(xpath="//input[@placeholder='Search Enquiry Here']")
	public static WebElement searchbox;
	
	@FindBy(xpath="//button[@type='button']")
	public static WebElement searchbutton;
	
	@FindBy(xpath="//button[text()=' Refresh']")
	public static WebElement refreshbutton;
	
	public UpdateEnquiryPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public static void VerifyUpdateEnquiryPage() throws InterruptedException {
		
		Thread.sleep(2000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", updateenquirylink);
		
		Thread.sleep(2000);
		searchbox.sendKeys("praveen");
		
		Thread.sleep(2000);
		searchbutton.click();
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", refreshbutton);
		
		Thread.sleep(2000);
		driver.navigate().back();
	}
}
