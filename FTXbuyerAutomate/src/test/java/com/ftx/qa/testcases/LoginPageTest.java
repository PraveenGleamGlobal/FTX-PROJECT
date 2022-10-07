package com.ftx.qa.testcases;

import org.testng.annotations.AfterMethod;
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

		@Test
		public void setup() {
			intialization();
			loginPages = new LoginPage();
	}
		
		
		
		//@Test(priority = 2)
		//public void loginTest() {
			//homepages=loginPages.login(prop.getProperty("username"), prop.getProperty("password"));

		
		@AfterMethod
		public void tearDown() throws InterruptedException {
			
	    
		driver.quit();
		}
		
		
		
	}
