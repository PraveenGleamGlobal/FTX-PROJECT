package com.ftx.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.LoginPage;
import com.ftx.qa.pages.StaffsPage;

public class StaffsPageTest extends TestBase {

static LoginPage loginPages;
	
	
	public StaffsPageTest() {
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
		
		StaffsPage Spage= new StaffsPage();
		
        Spage.verifyProfilePage1();
		
		Spage.verifyprofilepage2();
		
		
	}
	

	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	}
