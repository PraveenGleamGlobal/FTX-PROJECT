package com.ftx.qa.testcase;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.ApprovedPage;
import com.ftx.qa.pages.HomePage;
import com.ftx.qa.pages.LoginPage;
import com.ftx.qa.pages.SignedEnquiryModulePage;

public class ApprovedPageTest extends TestBase {

	static LoginPage loginPage;
	static HomePage homepages;
	static SignEnqModuleTest enqtest;
	
	public ApprovedPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intialization();
		loginPage = new LoginPage();
		HomePage homepage= new HomePage();
		homepages=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	public static void ExecuteSignEnqModule() throws InterruptedException {
		
		SignedEnquiryModulePage signpage=new SignedEnquiryModulePage();
		signpage.clickOnSignEnqLink();
		
	}
	
	@Test(priority= 2)
	public static void executeApproveLink() throws InterruptedException {
		
		
		ExecuteSignEnqModule();
		ApprovedPage approvepage= new ApprovedPage();
		
		
		approvepage.clickOnapprovedlink();
	
		
	}
	
	@AfterMethod
	public static void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}
	

}
