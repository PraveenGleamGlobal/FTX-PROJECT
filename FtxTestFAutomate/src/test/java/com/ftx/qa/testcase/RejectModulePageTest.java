package com.ftx.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.HomePage;
import com.ftx.qa.pages.LoginPage;
import com.ftx.qa.pages.RejectedModulePage;
import com.ftx.qa.pages.SignedEnquiryModulePage;

public class RejectModulePageTest extends TestBase{

	LoginPage loginPage;
	HomePage homepages;
	
	public RejectModulePageTest() {
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
	    @Test
	    public static void executeRejectedLink() throws InterruptedException {
	    	
	    	ExecuteSignEnqModule();
	    	RejectedModulePage modulepage=new RejectedModulePage();
	    	
	    	modulepage.clickonrejectedlink();
	
	    	
	    }
	    
	    @AfterMethod
		public void tearDown() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.quit();
		}
	    
	

	
}
