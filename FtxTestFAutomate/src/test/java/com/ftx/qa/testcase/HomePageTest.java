package com.ftx.qa.testcase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.HomePage;
import com.ftx.qa.pages.LoginPage;

public class HomePageTest extends TestBase {

	public class SignEnqModuleTest extends TestBase {
		
		LoginPage loginPage;
		HomePage homepages;
		
		public SignEnqModuleTest() {
			super();
		}
		
		@BeforeMethod
		public void setup() {
			intialization();
			loginPage = new LoginPage();
			HomePage homepage= new HomePage();
			homepages=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
				
	}
		
	@Test
	public void verifyDashboard() throws InterruptedException {
		
		Thread.sleep(2000);
		HomePage.clickOnDashboardButton();
		
	}	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	}
}
	
		
		
		
	

