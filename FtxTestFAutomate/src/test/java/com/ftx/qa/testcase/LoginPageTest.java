package com.ftx.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.HomePage;
import com.ftx.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPages;
	HomePage homepages;
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		intialization();
		loginPages = new LoginPage();
}
	//@Test(priority = 1)
	//public void loginPageTitleTest() {
		//loginPages.validateLoginPageTitle();
		
	//}
	
	//@Test(priority = 2)
	//public void loginTest() throws InterruptedException {
		
		//Thread.sleep(2000);
		//homepages=loginPages.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	
	//@AfterMethod
	//public void teardown() throws InterruptedException {
		
	//Thread.sleep(2000);
		//driver.quit();
//}


