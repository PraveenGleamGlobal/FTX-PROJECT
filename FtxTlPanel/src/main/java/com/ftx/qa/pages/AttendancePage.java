package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ftx.qa.base.TestBase;

public class AttendancePage extends TestBase {

	@FindBy(xpath="//span[text()='Attendance']")
	public static WebElement attendancelink;
	
	@FindBy(xpath="//*[@id=\"attendance\"]/div/div/div/div/select")
	public static WebElement selectedmonth;
	
	
    public  AttendancePage() {
    	
    	PageFactory.initElements(driver, this);
    }
    
    public static void verifyAttendancePage() throws InterruptedException {
    	
    	JavascriptExecutor executor= (JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click();", attendancelink);
    	
    	Select select= new Select(selectedmonth);
    	Thread.sleep(2000);
    	select.selectByVisibleText("January");
    	
    	Thread.sleep(2000);
    	select.selectByVisibleText("February");
    	
    	Thread.sleep(2000);
    	select.selectByVisibleText("March");
    	
    	Thread.sleep(2000);
    	select.selectByVisibleText("April");
    	
    	Thread.sleep(2000);
    	select.selectByVisibleText("May");
    	
    	Thread.sleep(2000);
    	select.selectByVisibleText("June");
    	
    	Thread.sleep(2000);
    	select.selectByVisibleText("July");
    	
    	Thread.sleep(2000);
    	select.selectByVisibleText("August");
    	
    	Thread.sleep(2000);
    	driver.navigate().back();
    	
}
    
}
