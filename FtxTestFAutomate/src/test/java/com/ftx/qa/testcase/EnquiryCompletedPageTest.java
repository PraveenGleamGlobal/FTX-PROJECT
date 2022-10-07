package com.ftx.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.EnquiryCompletedPage;
import com.ftx.qa.pages.HomePage;
import com.ftx.qa.pages.LoginPage;

public class EnquiryCompletedPageTest extends TestBase {

	static LoginPage loginPage;
	static HomePage homepages;
	static SignEnqModuleTest enqtest;
	
	public EnquiryCompletedPageTest() {
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
	public static void executeEnquiryCompletedTest() throws InterruptedException {
		
		EnquiryCompletedPage completepage= new EnquiryCompletedPage();
		
		completepage.verifyEnquiryCompletedPage();
	
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}
	
}