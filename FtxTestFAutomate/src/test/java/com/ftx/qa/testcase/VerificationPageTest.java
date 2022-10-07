package com.ftx.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.HomePage;
import com.ftx.qa.pages.LoginPage;
import com.ftx.qa.pages.VerificationPage;

public class VerificationPageTest extends TestBase {

	static LoginPage loginPage;
	static HomePage homepages;
	static SignEnqModuleTest enqtest;
	
	public VerificationPageTest() {
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
	public static void executeVerificationPage() throws InterruptedException {
		
		VerificationPage verifypage=new VerificationPage();
		
		verifypage.verifyIncompletePage2();;
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
}
}
