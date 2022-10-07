package com.ftx.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;

public class BotInstallPage extends TestBase{

	@FindBy(xpath="//input[@name='accountname']")
	static WebElement accountName;
	
	@FindBy(xpath="//input[@name='username']")
	static WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	static WebElement password;
	
	@FindBy(xpath="//input[@name='trader_pass']")
	static WebElement traderPassword;
	
	@FindBy(xpath="//input[@name='investor_pass']")
	static WebElement investorPassword;
	
	
	
	public BotInstallPage() {
	    PageFactory.initElements(driver, this);
		}
	
	 public static void botform(String an,String un, String ps, String tp, String ip) {
	    	accountName.sendKeys(an);
	    	userName.sendKeys(un);
	    	password.sendKeys(ps);
	    	traderPassword.sendKeys(tp);
	    	investorPassword.sendKeys(ip);
			
	 }

}