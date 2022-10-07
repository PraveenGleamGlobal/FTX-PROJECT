package com.ftx.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id="email")
	public static WebElement username;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement loginBtn;
	

	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public static HomePage login(String un, String pwd) {
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
	  System.out.println(un);
		
	  System.out.println(pwd);
	   return new HomePage();
		
	}
	}
	
