package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ftx.qa.base.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CallsModulePage extends TestBase {

	
	@FindBy(xpath="//span[normalize-space()='Calls']")
	public  static WebElement callslink;
	
	@FindBy(xpath="//a[@id='inbound-tab4']")
	public static WebElement inboundlink;
	
	@FindBy(xpath="//select[@name='datatables_length']")
	public static WebElement dropdowninboundlink;
	
	@FindBy(xpath="//input[@aria-controls='datatables']")
	public static WebElement searchoption;
	
	@FindBy(xpath="//a[@id='outbound-tab4']")
	public static WebElement outboundlink;
	
	@FindBy(xpath="//select[@name='datatables1_length']")
	public static WebElement dropdownoutboundlink;
	
	@FindBy(xpath="//div[@id='datatables1_filter']//input[@type='search']")
	public static WebElement searchoption2;
	
	@FindBy(xpath="//a[@id='shared-tab4']")
	public static WebElement sharedlink;
	
	@FindBy(xpath="//select[@name='datatables2_length']")
	public static WebElement dropdownsharedlink;
	
	@FindBy(xpath="//div[@id='datatables2_filter']//input[@type='search']")
	public static WebElement searchoption3;
	
	@FindBy(xpath="//a[@id='dispute-tab4']")
	public static WebElement disputelink;
	
	@FindBy(xpath="//select[@name='datatables3_length']")
	public static WebElement dropdowndisputelink;
	
	@FindBy(xpath="//div[@id='datatables3_filter']//input[@type='search']")
	public static WebElement searchoption4;
	
	public CallsModulePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public static void verifyCallsModulePage() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", callslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", inboundlink);
		
		Select select= new Select(dropdowninboundlink);
		
		Thread.sleep(1000);
		select.selectByVisibleText("10");
		
		Thread.sleep(1000);
		select.selectByVisibleText("25");
		
		Thread.sleep(1000);
		select.selectByVisibleText("50");
		
		Thread.sleep(1000);
		select.selectByVisibleText("100");
		
		searchoption.sendKeys("praveen");
		
	}
	
	public static void verifyCallsModulepage2() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", outboundlink);
		
	
		Select select= new Select(dropdownoutboundlink);
		select.selectByVisibleText("10");
		
		Thread.sleep(1000);
		select.selectByVisibleText("25");
		
		Thread.sleep(1000);
		select.selectByVisibleText("50");
		
		Thread.sleep(1000);
		select.selectByVisibleText("100");
		
		Thread.sleep(1000);
		searchoption2.sendKeys("praveen");
		
	}
	
	public static void verifyCallsModulePage3() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", sharedlink);
		
		Thread.sleep(1000);
		Select select= new Select(dropdownsharedlink);
		
		Thread.sleep(1000);
		select.selectByVisibleText("10");
		
		Thread.sleep(1000);
		select.selectByVisibleText("25");
		
		Thread.sleep(1000);
		select.selectByVisibleText("50");
		
		Thread.sleep(1000);
		select.selectByVisibleText("100");
		
		searchoption3.sendKeys("praveen");
		
	}
	
	public static void verifyCallsModulePage4() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", disputelink);
		
		Thread.sleep(1000);
		Select select= new Select(dropdowndisputelink);
		select.selectByVisibleText("10");
		
		Thread.sleep(1000);
		select.selectByVisibleText("25");
		
		Thread.sleep(1000);
		select.selectByVisibleText("50");
		
		Thread.sleep(1000);
		select.selectByVisibleText("100");
		
		searchoption4.sendKeys("praveen");
		
	}
	
}
