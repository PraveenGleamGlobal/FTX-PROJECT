package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ftx.qa.base.TestBase;

public class EnquiryCompletedPage extends TestBase {

	@FindBy(xpath="//span[text()='Enquiry Completed']")
	public static WebElement enquirycompletedlink;
	
	@FindBy(name="searchkey")
	public static WebElement searchoption;
	
	@FindBy(xpath="//span[text()=' Search']")
	public static WebElement searchbutton;
	
	@FindBy(xpath="//button[@type='button']")
	public static WebElement fetchbutton;
	
	@FindBy(xpath="//select[@name='DataTables_Table_0_length']")
	public static WebElement dropdownenquirycompleted;
	
	@FindBy(xpath="//a[@class='badge badge-primary']")
	public static WebElement approvedbutton;
	
	public EnquiryCompletedPage() {
		PageFactory.initElements(driver, this);
	}
	
	public static void verifyEnquiryCompletedPage() throws InterruptedException {
		
		Thread.sleep(2000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", enquirycompletedlink);
		
		Thread.sleep(1000);
		searchoption.sendKeys("magesh ");
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", searchbutton);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", fetchbutton);
		
		Select select = new Select(dropdownenquirycompleted);
		
		Thread.sleep(1000);
		select.selectByVisibleText("10");
		
		Thread.sleep(1000);
		select.selectByVisibleText("25");
		
		Thread.sleep(1000);
		select.selectByVisibleText("50");
		
		Thread.sleep(1000);
		select.selectByVisibleText("100");
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", approvedbutton);
		
	}
	
	
	}
	

