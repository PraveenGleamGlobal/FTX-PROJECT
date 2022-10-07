package com.ftx.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.LoginPage;
import com.ftx.qa.pages.StaffTransferPage;

public class StaffTransferPageTest extends TestBase {

	
static LoginPage loginPages;
	
	
	public StaffTransferPageTest() {
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
	
	
	public static void executeRequestTransfer() throws InterruptedException {
		
		loginTest();
		StaffTransferPage transpage= new StaffTransferPage();
		transpage.verifyRequestTrasfer();
		
	}
	
	@Test
	public static void executeRequestSubModule() throws InterruptedException {
		executeRequestTransfer();
		
		
		StaffTransferPage transpage= new StaffTransferPage();
		transpage.verifyRequestSubmodule();
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
	
		Thread.sleep(3000);
		driver.quit();
	}
}
