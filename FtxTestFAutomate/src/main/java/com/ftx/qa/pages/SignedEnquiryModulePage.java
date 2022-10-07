package com.ftx.qa.pages;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ftx.qa.base.TestBase;

public class SignedEnquiryModulePage extends TestBase {

	@FindBy(css="ul#menu>li:nth-of-type(2)>a>span")
	static WebElement SignedEnquirylink;
	
	@FindBy(xpath="//ul[@id='menu']/li[2]/ul[1]/li[1]/a[1]")
	static WebElement signedlink;
	
	@FindBy(xpath="//button[text()[normalize-space()='Fetch']]")
	public static WebElement fetchsignedbutton;
	
	@FindBy(xpath="//select[@name='DataTables_Table_0_length']")
	public static WebElement dropdownsigned;
	
	@FindBy(xpath="//a[@class='badge badge-primary']")
	static WebElement pendingButton;
	
	@FindBy(xpath="//input[@name='searchkey']")
	public static WebElement searchboxemail;
	
	
	@FindBy(xpath="//ul[@id='menu']/li[2]/ul[1]/li[2]/a[1]")
	static WebElement rejected;
	
	@FindBy(xpath="//ul[@id='menu']/li[2]/ul[1]/li[3]/a[1]")
	public static WebElement approvedlink;
	
	@FindBy(xpath="//input[@placeholder='001']")
	public static WebElement invoiceID;
	
	@FindBy(xpath="//button[normalize-space()='Approve Transaction']")
	public static WebElement approveTransaction;	
	
	
	public SignedEnquiryModulePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public static void clickOnSignEnqLink() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", SignedEnquirylink);
		
		//SignedEnquiryButton.click();
		
	}
	
	public static void clickOnSignedlink() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", signedlink);
		
		Select select= new Select(dropdownsigned);
		
		Thread.sleep(1000);
		select.selectByVisibleText("25");
		
		Thread.sleep(1000);
		select.selectByVisibleText("50");
		
		Thread.sleep(1000);
		select.selectByVisibleText("100");
		
		Thread.sleep(1000);
		searchboxemail.sendKeys("kiran");
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", fetchsignedbutton);
		
		String	oldWindow =driver.getWindowHandle();

		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", pendingButton);
		
		Set<String> handles= driver.getWindowHandles();
	     
		for (String newWindows : handles) {
			
			driver.switchTo().window(newWindows);
			
		}
	
	     	     
	    
	}
}
