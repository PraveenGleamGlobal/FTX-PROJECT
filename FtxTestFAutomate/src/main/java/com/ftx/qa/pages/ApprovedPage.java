package com.ftx.qa.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ftx.qa.base.TestBase;

public class ApprovedPage extends TestBase {

	@FindBy(xpath="//ul[@id='menu']/li[2]/ul[1]/li[3]/a[1]")
	public static WebElement approvedlink;
	
	@FindBy(name="searchkey")
	public static WebElement searchbox;
	
	@FindBy(xpath="//span[text()=' Search']")
	public static WebElement searchbutton1;
	
	@FindBy(xpath="//select[@name='DataTables_Table_0_length']")
	public static WebElement dropdownapproved;
	
	@FindBy(xpath="//button[@type='button']")
	public static WebElement fetchbutton1;
	
	public ApprovedPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public static void clickOnapprovedlink() throws InterruptedException {
		
		Thread.sleep(2000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", approvedlink);
		

		Thread.sleep(2000);
		searchbox.sendKeys("santhosh@gmail.com");
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", searchbutton1);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", fetchbutton1);
		
		Select select= new Select(dropdownapproved);
		
		Thread.sleep(1000);
		select.selectByVisibleText("10");
		
		Thread.sleep(1000);
		select.selectByVisibleText("25");
		
		Thread.sleep(1000);
		select.selectByVisibleText("50");
		
		Thread.sleep(1000);
		select.selectByVisibleText("100");
	}
	
}
