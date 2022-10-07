package com.ftx.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.HistoryModulePage;
import com.ftx.qa.pages.LoginPage;

public class HistoryModulePageTest extends TestBase {

	
	static LoginPage loginPages;
	
	
	public HistoryModulePageTest() {
		super();
	}

	@BeforeClass
	public void setup() {
		intialization();
		loginPages = new LoginPage();
}
	//@Test(priority = 1)
	//public void loginPageTitleTest() {
		//loginPages.validateLoginPageTitle();
		
	//}
	

	@Test(priority = 1)
	public static void loginTest() {
		loginPages.login(prop.getProperty("username"), prop.getProperty("password"));
		
}
	
	@Test(priority = 2)
	public static void executeHistoryPageModule() throws InterruptedException {
		
		
		HistoryModulePage historymodule= new HistoryModulePage();
		
		historymodule.verifyHistoryModule();
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
}






