package com.ftx.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.LoginPage;
import com.ftx.qa.pages.StaffPasswordPage;

public class StaffPasswordPageTest extends TestBase {

static LoginPage loginPages;
	
	
	public StaffPasswordPageTest() {
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
	public static void executeStaffPasswordPage() throws InterruptedException {
		
		loginTest();
		
		StaffPasswordPage passwordpage= new StaffPasswordPage();
		passwordpage.verifyStaffPaswordPage();
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
	
		Thread.sleep(2000);
		driver.quit();
	}
	
}
