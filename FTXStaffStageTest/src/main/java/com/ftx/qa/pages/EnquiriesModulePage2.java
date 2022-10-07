package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ftx.qa.base.TestBase;

public class EnquiriesModulePage2 extends TestBase {

	@FindBy(xpath="//span[text()='Enquiries']")
	public static WebElement enquirylink;
	
	@FindBy(xpath="//span[normalize-space()='Not Interested']")
	public static WebElement notinterestedlink;
	
	@FindBy(xpath="//select[@name='DataTables_Table_0_length']")
	public static WebElement dropdownnotinterestedlink;
	
	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	public static WebElement searchoption1;
	
	@FindBy(xpath="//button[@class='btn btn btn-gray dropdown-toggle btn-action']")
	public static WebElement actionbutton1;
	
	@FindBy(xpath="//a[@class='cursor-pointer text-pink moveToReview']")
	public static WebElement moveoption;
	
	@FindBy(xpath="//div[@id='reviewmodal']//button[contains(@type,'button')][normalize-space()='Close']")
	public static WebElement closebtn;
	
	
	
	@FindBy(xpath="//li[@class='slide active is-expanded']//li[6]//a[1]//span[1]")
	public static WebElement todayringing;
	
	@FindBy(xpath="//select[@name='DataTables_Table_0_length']")
	public static WebElement dropdowntodayringing;
	
	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	public static WebElement searchoption2;
	
	@FindBy(xpath="//i[@class='fa fa-bars']")
	public static WebElement actionbutton2;
	
	@FindBy(xpath="//a[@class='cursor-pointer text-grey moveToPost']")
	public static WebElement actionperform;
	
	@FindBy(xpath="(//textarea[@name='description'])[2]")
	public static WebElement description1;
	
	@FindBy(xpath="(//button[text()='Close'])[2]")
	public static WebElement closebtn2;
	
	
	@FindBy(xpath="html[1]/body[1]/div[2]/div[1]/aside[1]/ul[1]/li[4]/ul[1]/li[7]/a[1]/span[1]")
	public static WebElement todaypostponed;
	
	@FindBy(xpath="//select[@name='DataTables_Table_0_length']")
	public static WebElement dropdowntodaypostponed;
	
	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	public static WebElement searchoption3;
	
	@FindBy(xpath="//i[@class='fa fa-bars']")
	public static WebElement actionbutton3;
	
	@FindBy(xpath="//a[@class='cursor-pointer text-warning moveToRing']")
	public static WebElement actionperform1;
	
	@FindBy(xpath="//textarea[@name='description']")
	public static WebElement description2;
	
	@FindBy(xpath="//button[text()='Close']")
	public static WebElement closebtn3;
	
	public EnquiriesModulePage2() {
		
		PageFactory.initElements(driver, this);
	}
	
	public static void VerifyNotInterestedSubmodule() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", enquirylink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", notinterestedlink);
		
		Thread.sleep(1000);
		Select select= new Select(dropdownnotinterestedlink);
		select.selectByVisibleText("10");
		
		Thread.sleep(1000);
		select.selectByVisibleText("25");
		
		Thread.sleep(1000);
		select.selectByVisibleText("50");
		
		Thread.sleep(1000);
		select.selectByVisibleText("100");
		
		Thread.sleep(1000);
		searchoption1.sendKeys("Gulf Modal Test");
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", actionbutton1);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", moveoption);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", closebtn);

	}
	
	public static void VerifyTodayRingingSubModule() throws InterruptedException {
		
//		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", enquirylink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", todayringing);
		
		Thread.sleep(1000);
		Select select= new Select(dropdowntodayringing);
		
		Thread.sleep(1000);
		select.selectByVisibleText("10");
		
		Thread.sleep(1000);
		select.selectByVisibleText("25");
		
		Thread.sleep(1000);
		select.selectByVisibleText("50");
		
		Thread.sleep(1000);
		select.selectByVisibleText("100");
		
		Thread.sleep(1000);
		searchoption2.sendKeys("test enquiry");
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", actionbutton2);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", actionperform);
		
		Thread.sleep(1000);
		description1.sendKeys("because of some issues");
		
		Thread.sleep(1000);
		closebtn2.click();
	}
	
	
	public static void verifyTodayPostponedSubModule() throws InterruptedException   {
		
//		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", enquirylink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", todaypostponed);
		
		
		Thread.sleep(1000);
		Select select= new Select(dropdowntodaypostponed);
		select.selectByVisibleText("10");
		
		Thread.sleep(1000);
		select.selectByVisibleText("25");
		
		Thread.sleep(1000);
		select.selectByVisibleText("50");
		
		Thread.sleep(1000);
		select.selectByVisibleText("100");
		
		Thread.sleep(1000);
		searchoption3.sendKeys("test enquiry");
	
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", actionbutton3);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", actionperform1);
		
		Thread.sleep(1000);
		description2.sendKeys("because of some issues");
		
		Thread.sleep(1000);
		closebtn3.click();
		
		
	}
	
	
	
	
}
