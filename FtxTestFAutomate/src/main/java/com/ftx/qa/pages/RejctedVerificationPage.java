package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ftx.qa.base.TestBase;

public class RejctedVerificationPage extends TestBase {
	
	@FindBy(xpath="//span[normalize-space()='2 . Verification']")
	public static WebElement verificationlink;

	@FindBy(xpath="//ul[@id='menu']/li[3]/ul[1]/li[3]/a[1]")
	public static WebElement rejectedlink2;
	
	@FindBy(name="searchkey")
	public static WebElement searchoption;
	
	@FindBy(xpath="//span[text()=' Search']")
	public static WebElement searchbutton;
	
	@FindBy(xpath="//button[@type='button']")
	public static WebElement fetchbutton;
	
	@FindBy(xpath="//select[@name='DataTables_Table_0_length']")
	public static WebElement dropdownrejected;
	
	@FindBy(xpath="//td[@class='fs-14']//a[1]")
	public static WebElement pendingbutton;
	
	public RejctedVerificationPage() {
		PageFactory.initElements(driver, this);
	}
	
	

	public static void verifyRejectedVerificationPage() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", verificationlink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", rejectedlink2);
		
		Thread.sleep(1000);
		searchoption.sendKeys("testijng ");
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", fetchbutton);
		
		Select select= new Select(dropdownrejected);
		
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