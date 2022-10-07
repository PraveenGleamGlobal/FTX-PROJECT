package com.ftx.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.LoginPage;
import com.ftx.qa.pages.TodayChecklistModulePage;

public class TodayChecklistModulePageTest extends TestBase {

	static LoginPage loginPages;
	
	
	public TodayChecklistModulePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		intialization();
		loginPages = new LoginPage();
}
	//@Test(priority = 1)
	//public void loginPageTitleTest() {
		//loginPages.validateLoginPageTitle();
		
	//}
	
	
	public static void loginTest() {
		loginPages.login(prop.getProperty("username"), prop.getProperty("password"));
		
}
	
	@Test
	public static void executeTodayChecklistModule() throws InterruptedException {
		
		loginTest();
		TodayChecklistModulePage checklistmodule= new TodayChecklistModulePage();
		
		checklistmodule.verifyChecklistModule();
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
}
