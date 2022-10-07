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
import com.ftx.qa.pages.EnquiriesModulePage2;
import com.ftx.qa.pages.LoginPage;
import com.ftx.qa.testutils.TestUtils;

	public class EnquiriesModulePage2Test extends TestBase{
		LoginPage loginPages;
		EnquiriesModulePage2 enqmodule2;
		
		public EnquiriesModulePage2Test() {
			super();
		}

		@BeforeClass
		public void setup() {
			intialization();
			loginPages = new LoginPage();
			enqmodule2= new EnquiriesModulePage2();
	}
	
		
		@Test(priority= 1)
		public void EnquiriesModule2() {
			loginPages.login(prop.getProperty("username"), prop.getProperty("password"));
			
}
		@Test(priority = 2)
		public static void executeNotInterestedSubmodule() throws InterruptedException {
			
			EnquiriesModulePage2 enqmodule2= new EnquiriesModulePage2();
			enqmodule2.VerifyNotInterestedSubmodule();
			
		}
		
		@Test(priority = 3)
		public static void executeTodayRingingSubModule() throws InterruptedException {
			
			EnquiriesModulePage2 enqmodule2= new EnquiriesModulePage2();
			enqmodule2.VerifyTodayRingingSubModule();
			
		}
		
		@Test(priority = 4) 
		public static void executeTodayPostponedSubModule() throws InterruptedException {
			
			EnquiriesModulePage2 enqmodule2= new EnquiriesModulePage2();
			enqmodule2.verifyTodayPostponedSubModule();
			
		}
		
		
		@AfterClass
		public void tearDown() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.quit();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	