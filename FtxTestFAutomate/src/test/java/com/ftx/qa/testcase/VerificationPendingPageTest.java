package com.ftx.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.HomePage;
import com.ftx.qa.pages.LoginPage;
import com.ftx.qa.pages.VerificationPage;
import com.ftx.qa.pages.VerificationPendingPage;

public class VerificationPendingPageTest extends TestBase {

	static LoginPage loginPage;
	static HomePage homepages;
	static SignEnqModuleTest enqtest;
	
	public VerificationPendingPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intialization();
		loginPage = new LoginPage();
		HomePage homepage= new HomePage();
		homepages=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Parameter()
   @Test
   public static void executeVerifyPendingPage() throws InterruptedException {
	   
	   
	   VerificationPendingPage vpage2= new VerificationPendingPage();
	   vpage2.verifyPendingPage();
	   
	   
   }
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	
}
}