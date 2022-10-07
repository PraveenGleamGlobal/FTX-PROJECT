package com.ftx.qa.pages;


	
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;

public class ExcelLoginData extends TestBase {

	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password-field")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement loginBtn;
	
	public ExcelLoginData () {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
}
	public void login(String un, String pwd) throws InterruptedException {
		
		Thread.sleep(1000);
		username.sendKeys(un);
		
		Thread.sleep(1000);
		password.sendKeys(pwd);
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", loginBtn);
		
		System.out.println(un);
		System.out.println(pwd); 
		
		
	}
}

