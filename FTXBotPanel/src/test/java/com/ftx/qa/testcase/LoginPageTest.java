package com.ftx.qa.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.Homepage;
import com.ftx.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPages;
	Homepage homepages;
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		intialization();
		loginPages = new LoginPage();
}
	@Test(priority = 1)
	public void loginPageTitleTest() {
		loginPages.validateLoginPageTitle();
		
	}
	
	@Test(priority = 2)
	public void loginTest() {
		homepages=loginPages.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	//@AfterMethod
	//public void teardown() {
		//driver.quit();
	}