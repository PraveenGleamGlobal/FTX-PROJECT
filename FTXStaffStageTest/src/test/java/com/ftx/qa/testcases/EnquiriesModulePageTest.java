package com.ftx.qa.testcases;

	import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.EnquiriesModulePage;
import com.ftx.qa.pages.LoginPage;
import com.ftx.qa.testutils.TestUtils;

	public class EnquiriesModulePageTest extends TestBase{
		LoginPage loginPages;
		EnquiriesModulePage enqmodule;
		
		public EnquiriesModulePageTest() {
			super();
		}

		@BeforeClass
		public void setup() {
			intialization();
			loginPages = new LoginPage();
		    enqmodule= new EnquiriesModulePage();
	}
		
		@Test(priority=1)
		public void EnquiriesModule() {
			loginPages.login(prop.getProperty("username"), prop.getProperty("password"));
			
}
//		@Test(priority = 2)
//		public static void executeNewSubModule() throws InterruptedException {
//			
//			EnquiriesModulePage enqmodule= new EnquiriesModulePage();
//			enqmodule.verifyEnquiriesModulePage();
//			
//		}
		
//		
//		@Test(priority = 3)
//	        public static void executeARingingSubModule() throws InterruptedException {
//			
//			EnquiriesModulePage enqmodule= new EnquiriesModulePage();
//			enqmodule.verifyEnquiriesAssignedSubModule();
//		
//		}
//		
//		@Test(priority = 4)
//		public static void executePostponedSubModule() throws InterruptedException {
//			
//			EnquiriesModulePage enqmodule= new EnquiriesModulePage();
//			enqmodule.verifyRingingSubModule();
//		
//		}
//		
//		
//
		@Test(priority = 5)
		public static void executeAssignedSubModule() throws InterruptedException {
			
			EnquiriesModulePage enqmodule= new EnquiriesModulePage();
			enqmodule.verifyPostponedSubModule();
		}
		
		
//	@AfterClass
//	public void tearDown() throws InterruptedException {
//		
//		Thread.sleep(2000);
//		driver.quit();
//	}
	
		
}
