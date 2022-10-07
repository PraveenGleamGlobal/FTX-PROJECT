package com.ftx.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.HomePage;
import com.ftx.qa.pages.LoginPage;
import com.ftx.qa.pages.RejctedVerificationPage;
import com.ftx.qa.pages.VerificationPage;

public class RejectedVerificationPageTest extends TestBase {

	static LoginPage loginPage;
	static HomePage homepages;
	static SignEnqModuleTest enqtest;
	
	public RejectedVerificationPageTest () {
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
	public static void executeRejectedVerificationPage() throws InterruptedException {
		
		RejctedVerificationPage rejpage= new RejctedVerificationPage();
		rejpage.verifyRejectedVerificationPage();
		
	
	
	
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	
}
}