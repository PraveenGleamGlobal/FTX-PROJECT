package com.ftx.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.HomePage;
import com.ftx.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() {
		
		super();
	}
	
	@Test(priority = 1)
	public void setup() {
		
		initialization();
		loginpage= new LoginPage();
		
	}
	
	@Test(priority = 2)
	public void executeLoginPage() {
		
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
		
//	@AfterClass
//	public void tearDown() throws InterruptedException {
//		
//		Thread.sleep(1000);
//		driver.quit();
//	}
}
