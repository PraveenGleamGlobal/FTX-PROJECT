package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ftx.qa.base.TestBase;

public class InvoiceOtp extends TestBase {

	@FindBy(xpath="//span[text()='Invoice OTP']")
	public static WebElement InvoiceOtp;
	
	@FindBy(name =  "table1_length")
	public static WebElement entries;
	
	@FindBy(xpath="//input[@type='search']")
	public static WebElement searchbox;
	
	public InvoiceOtp() {
		
		PageFactory.initElements(driver, this);
	}
	
	public static void verifyOtp() throws InterruptedException {
		
		Thread.sleep(2000);
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", InvoiceOtp);
		
		Thread.sleep(1000);
		Select select= new Select(entries);
		
		Thread.sleep(1000);
		select.selectByValue("10");
		
		Thread.sleep(1000);
		select.selectByValue("25");
		
		Thread.sleep(1000);
		select.selectByValue("50");
		
		Thread.sleep(1000);
		select.selectByValue("100");
		
		Thread.sleep(2000);
		searchbox.sendKeys("shana");
		
		Thread.sleep(3000);
		driver.navigate().back();
		
	}
}
