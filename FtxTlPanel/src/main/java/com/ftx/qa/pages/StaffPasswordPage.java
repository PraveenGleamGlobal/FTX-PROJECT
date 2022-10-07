package com.ftx.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;

public class StaffPasswordPage extends TestBase {

	
	@FindBy(xpath="(//span[@class='nav-text'])[3]")
	public static WebElement staffpasswordlink;
	
	@FindBy(xpath="//button[@type='button']")
	public static WebElement copylink;
	
	@FindBy(xpath="//span[text()='Excel']")
	public static WebElement excellink;
	
	@FindBy(xpath="//span[text()='CSV']")
	public static WebElement csvlink;
	
	@FindBy(xpath="//span[text()='PDF']")
	public static WebElement pdflink;
	
	@FindBy(xpath="//input[@type='search']")
	public static WebElement searchbox;
	
	@FindBy(xpath="//button[@type='button']//i")
	public static WebElement actionbutton1;
	
	@FindBy(xpath="//button[@data-id='12']//i[1]")
	public static WebElement actionbutton2;
	
	@FindBy(xpath="//button[@data-id='1']//i[1]")
	public static WebElement actionbutton3;
	
	@FindBy(xpath="//button[@data-id='8']//i[1]")
	public static WebElement actionbutton4;
	
	@FindBy(xpath="//button[@data-id='9']//i[1]")
	public static WebElement actionbutton5;
	
	@FindBy(xpath="//button[@data-id='1']//i[1]")
	public static WebElement actionbutton6;
	
	@FindBy(xpath="//button[@data-id='8']//i[1]")
	public static WebElement actionbutton7;
	
	
	
	public StaffPasswordPage() {
		PageFactory.initElements(driver, this);
	}
	
	public static void verifyStaffPaswordPage() throws InterruptedException {
		
		Thread.sleep(2000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", staffpasswordlink);
		
		Thread.sleep(2000);
		searchbox.sendKeys("Angel");
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", copylink);
		
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", excellink);
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", csvlink);
		
//		Thread.sleep(1000);
//		Alert alert1= driver.switchTo().alert();
//		alert1.dismiss();
		
		driver.navigate().refresh();
		
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", pdflink);
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", actionbutton1);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", actionbutton2);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", actionbutton3);
		
		//Thread.sleep(1000);
		//executeScript("arguments[0].click();", actionbutton4);
		
		//Thread.sleep(1000);
		//executor.executeScript("arguments[0].click();", actionbutton6);
		
		//Thread.sleep(1000);
		//executor.executeScript("arguments[0].click();", actionbutton7);
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		
	}
}
