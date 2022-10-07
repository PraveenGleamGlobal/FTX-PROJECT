package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ftx.qa.base.TestBase;

public class VerificationPage extends TestBase {

	@FindBy(xpath="//span[normalize-space()='2 . Verification']")
	public static WebElement verificationlink;
	
	@FindBy(name="searchkey")
	public static WebElement searchincomplete;
	
	@FindBy(xpath="//span[text()=' Search']")
	public static WebElement searchbutton;
	
	@FindBy(xpath="//select[@name='DataTables_Table_0_length']")
	public static WebElement dropdownincompletepage;
	
	@FindBy(xpath="//ul[@id='menu']/li[3]/ul[1]/li[1]/a[1]")
	public static WebElement incompletelink;
	
	@FindBy(xpath="//input[@type='search']")
	public static WebElement searchoption;
	
	@FindBy(xpath="//button[@type='button']")
	public static WebElement fetchbutton;
	
	
	@FindBy(xpath="//a[@class='badge badge-primary']")
	public static WebElement pendingbutton;
	
	public VerificationPage() {
		PageFactory.initElements(driver, this);
		
	}
	

   public static void verifyIncompletePage2() throws InterruptedException {
	   
		Thread.sleep(1000);
	   JavascriptExecutor executor= (JavascriptExecutor)driver;
	   executor.executeScript("arguments[0].click();", verificationlink);
	   
	   Thread.sleep(1000);

		executor.executeScript("arguments[0].click();", incompletelink);

		Thread.sleep(2000);
		searchincomplete.sendKeys("kiran98@gmail.com");
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", searchbutton);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", fetchbutton);
		
		Select select= new Select(dropdownincompletepage);
		
		Thread.sleep(1000);
		select.selectByVisibleText("10");
		
		Thread.sleep(1000);
		select.selectByVisibleText("25");
		
		Thread.sleep(1000);
		select.selectByVisibleText("50");
		
		Thread.sleep(1000);
		select.selectByVisibleText("100");
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", pendingbutton);
		

	}
}
	   
   
		