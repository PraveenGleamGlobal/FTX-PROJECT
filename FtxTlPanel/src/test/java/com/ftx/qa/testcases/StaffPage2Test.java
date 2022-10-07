package com.ftx.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.LoginPage;
import com.ftx.qa.pages.StaffPage2;

public class StaffPage2Test extends TestBase {


static LoginPage loginPages;
	
	
	public StaffPage2Test() {
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
	public static void executeStaffPage() throws InterruptedException {
		
		loginTest();
		
		StaffPage2 page2= new StaffPage2();
		page2.verifyProfilePage3();
		page2.verifyProfilePage4();
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}
}
