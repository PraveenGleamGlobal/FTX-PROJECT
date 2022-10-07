package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ftx.qa.base.TestBase;

public class StaffTransferPage extends TestBase {

	

	@FindBy(xpath="//span[text()='Staff Transfer']")
	public static WebElement stafftransfer;
	
	@FindBy(xpath="//ul[@id='menu']/li[6]/ul[1]/li[1]/a[1]")
	public static WebElement requesttransferlink;
	
	
	@FindBy(xpath="//select[@type='text']")
	public static WebElement teamleadertextbox;
	
	@FindBy(xpath="//label[@for='customCheckBox20']")
	public static WebElement checkboxes;
	
	@FindBy(xpath="//button[text()='Send Transfer Request']")
	public static WebElement transferrequest;
	
	
	@FindBy(xpath="//button[@type='button']")
	public static WebElement acceptbutton2;
	
	@FindBy(linkText = "Requests")
	public static WebElement myreqlink;
	
	@FindBy(xpath="//a[@href='#my-requests']//span[1]")
	public static WebElement requestlink2;
	
	public StaffTransferPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public static void verifyRequestTrasfer() throws InterruptedException {
		
		Thread.sleep(2000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", stafftransfer);
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", requesttransferlink);
		
	
		Thread.sleep(2000);
		Select select= new Select(teamleadertextbox);
		select.selectByVisibleText("prateeksha vijay");
		
		Thread.sleep(1000);
		select.selectByVisibleText("Praveen");
		
		Thread.sleep(1000);
		select.selectByVisibleText("Suresh Keshavan");
		
		Thread.sleep(1000);
		select.selectByVisibleText("Ramchandran");
		
	    Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", checkboxes);
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", transferrequest);
		
		Thread.sleep(1000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
	}
	
	public static void verifyRequestSubmodule() throws InterruptedException {
		
		
		Thread.sleep(2000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", stafftransfer);
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", myreqlink);
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", acceptbutton2 );
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", requestlink2 );
		
	}
}


















