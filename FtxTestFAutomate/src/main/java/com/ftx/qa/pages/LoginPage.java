package com.ftx.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password-field")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
}
	public HomePage login(String un, String pwd) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		loginBtn.submit();
		
		System.out.println(un);
		System.out.println(pwd); 
		
		return new HomePage();
	}
}
