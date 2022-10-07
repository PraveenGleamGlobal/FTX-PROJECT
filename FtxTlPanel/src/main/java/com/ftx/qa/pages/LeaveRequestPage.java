package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;

public class LeaveRequestPage extends TestBase {

	@FindBy(xpath="//span[text()='Leave Requests']")
	public static WebElement leaverequestlink;
	
	@FindBy(xpath="//button[@type='button']")
	public static WebElement approvebutton;
	
	public LeaveRequestPage() {
		PageFactory.initElements(driver, this);
	}
	
	public static void verifyLeaveRequestPage() throws InterruptedException {
		
		Thread.sleep(2000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", leaverequestlink);
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", approvebutton);
		
		Thread.sleep(2000);
		driver.navigate().back();
		
	}
}
