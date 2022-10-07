package com.ftx.qa.pages;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ftx.qa.base.TestBase;

public class VerificationPendingPage extends TestBase {
	
	@FindBy(xpath="//span[normalize-space()='2 . Verification']")
	public static WebElement verificationlink;

	@FindBy(xpath="//ul[@id='menu']/li[3]/ul[1]/li[2]/a[1]")
	public static WebElement pendingbutton;
	
	@FindBy(name="searchkey")
	public static WebElement searchoption;
	
	@FindBy(xpath="//select[@name='DataTables_Table_0_length']")
	public static WebElement dropdownpending2;
	
	@FindBy(xpath="//button[@type='button']")
	public static WebElement searchbutton;
	
	@FindBy(xpath="//button[@type='button']")
	public static WebElement fetchbutton;
	
	@FindBy(xpath="//a[@class='badge badge-primary']")
	public static WebElement pendingbutton2;
	
	@FindBy(xpath="//button[@class='btn btn-xs btn-success ApproveProof_proof1 ApproveProof mr-2']")
	public static WebElement approvebutton;
	
	@FindBy(xpath="//button[@class='btn btn-xs btn-success ApproveProof_proof2 ApproveProof mr-2']")
	public static WebElement approvebutton2;
	
	@FindBy(xpath="//button[@class='btn btn-xs btn-success ApproveProof_sign ApproveProof mr-2']")
	public static WebElement approvebutton3;

	public VerificationPendingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public static void verifyPendingPage() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", verificationlink);
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", pendingbutton);
		
		Thread.sleep(2000);
		searchoption.sendKeys("kiran");
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", searchbutton);
	
		Thread.sleep(1000);
		Select select= new Select(dropdownpending2);
		
		Thread.sleep(1000);
		select.selectByVisibleText("10");
		
		Thread.sleep(1000);
		select.selectByVisibleText("25");
		
		Thread.sleep(1000);
		select.selectByVisibleText("50");
		
		Thread.sleep(1000);
		select.selectByVisibleText("100");
		
		String oldwindow =  driver.getWindowHandle();
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", pendingbutton2);
		
		 Set<String> handles= driver.getWindowHandles();
		 
		 for (String newWindows : handles) {
			
			 driver.switchTo().window(newWindows);
		}
		
		
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", approvebutton);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", approvebutton2);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", approvebutton3);
		
	}
}
