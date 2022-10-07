package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;

public class AttendanceModulePage extends TestBase {

	
	@FindBy(xpath="//span[normalize-space()='Attendance']")
	public  static WebElement attendancelink;
	
	@FindBy(xpath="//span[@class='clndr-previous-button ']")
	public static WebElement previousbutton;
	
	@FindBy(xpath="//span[@class='clndr-next-button']")
	public static WebElement nextbutton;
	
	@FindBy(xpath="//a[@id='leavereq-tab4']")
	public static WebElement leaverequest;
	
	@FindBy(xpath="//span[normalize-space()='Apply Leave']")
	public static WebElement applyleave;
	
	@FindBy(xpath="//input[@name='daterange']")
	public static WebElement dateselection;
	
	@FindBy(xpath="(//td[@data-title='r2c6'])[2]")
	public static WebElement dateselected17;
	
	@FindBy(xpath="//button[normalize-space()='Apply']")
	public static WebElement datesubmitbutton;
	
	@FindBy(xpath="//input[@name='reason']")
	public static WebElement reasonforleave;
	
	@FindBy(xpath="//textarea[@placeholder='Brief Description ...']")
	public static WebElement briefdescription;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	public static WebElement submitbutton;
	
	@FindBy(xpath="//a[contains(text(),'Dashboard')]")
	public static WebElement dashboardlink;
	
	public AttendanceModulePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public static void verifyAttendanceModulePage() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", attendancelink);
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", previousbutton);
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", nextbutton);
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", leaverequest);

		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", applyleave);
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", dateselection);
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", dateselected17);
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", datesubmitbutton);
		
		Thread.sleep(2000);
		reasonforleave.sendKeys("cold fever");
		
		Thread.sleep(1000);
		briefdescription.sendKeys("Because of health issue");
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", submitbutton);
		
	}
	
	
	
	
}

