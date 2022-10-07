package com.ftx.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.InvoiceOtp;
import com.ftx.qa.pages.LoginPage;

public class InvoiceOtpTest extends TestBase {

static LoginPage loginPages;
	
	
	public InvoiceOtpTest() {
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
	public static void verifyInvoiceOtpTest() throws InterruptedException {
		
		loginTest();
		InvoiceOtp inotp= new InvoiceOtp();
		inotp.verifyOtp();
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
	
		Thread.sleep(2000);
		driver.quit();
	}
	
}
