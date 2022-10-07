package com.ftx.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.LoginPage;
import com.ftx.qa.pages.UpdateEnquiryPage;

public class UpdateEnquiryPageTest extends TestBase {

static LoginPage loginPages;
	
	
	public UpdateEnquiryPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		intialization();
		loginPages = new LoginPage();
}
		
	
	
	public static void loginTest() {
		loginPages.login(prop.getProperty("username"), prop.getProperty("password"));
}
	
	@Test
	public static void executeUpdateEnquiryPage() throws InterruptedException {
		
		loginTest();
		UpdateEnquiryPage enqpage= new UpdateEnquiryPage();
		enqpage.VerifyUpdateEnquiryPage();
		
	}
	

	@AfterMethod
	public void tearDown() throws InterruptedException {
	
		Thread.sleep(2000);
		driver.quit();
	}
}