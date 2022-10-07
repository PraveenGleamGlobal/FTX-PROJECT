package com.ftx.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.CallsModulePage;
import com.ftx.qa.pages.LoginPage;

public class CallsModulePageTest extends TestBase {

	
	static LoginPage loginPages;
	static CallsModulePage callspage;
	
	public CallsModulePageTest() {
		super();
	}

	@BeforeClass
	public void setup() {
		intialization();
		loginPages = new LoginPage();
		callspage= new CallsModulePage();
}
	
	
	@Test(priority = 1)
	public static void executeCallsModule() {
		loginPages.login(prop.getProperty("username"), prop.getProperty("password"));
		
}
	
	@Test(priority = 2)
	public static void executeInboundLink() throws InterruptedException {
			
		callspage.verifyCallsModulePage();
		
	}
	
	@Test(priority = 3)
	public static void executeOutBoundlink() throws InterruptedException {
		
		callspage.verifyCallsModulepage2();
		
	}
	
	@Test(priority = 4)
	public static void executeSharedLink() throws InterruptedException {
		
		callspage.verifyCallsModulePage3();
		
	}
	
	@Test(priority = 5)
	public static void executeDisputeLink() throws InterruptedException {
		
		callspage.verifyCallsModulePage4();
		
		
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.quit();
	}
			
		
	}

