package com.ftx.qa.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.HomePage;
import com.ftx.qa.pages.LoginPage;
import com.ftx.qa.pages.TemplatesModule;

public class TemplatesModuleTest extends TestBase {

	LoginPage loginpage;
	static HomePage Homepage;
	static TemplatesModule Templatesmodule; 
	
	public TemplatesModuleTest() {
		super();
	}
	
	@BeforeClass
	public void setup() {
		
		initialization();
		loginpage= new LoginPage();
		Homepage= new HomePage();
		Templatesmodule= new TemplatesModule();
		
	}
	

		@Test(priority = 1)
		public void loginTest() {
			Homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
		@Test(priority = 2)
		public static void executeMailSubModule() throws InterruptedException {
			
			Templatesmodule.verifyMailSubModule();
			
		}
		
		@Test(priority = 3)
		public static void executeAddNew() throws InterruptedException {
			
			Templatesmodule.verifyAddNew();
			
		}
		
		@Test(priority = 4)
		public static void executeSmsModule() throws InterruptedException {
			
			Templatesmodule.verifySmsModule();
			
		}
		
		@Test(priority = 5)
		public static void executeCreateNewTemplate() throws InterruptedException {
			
			Templatesmodule.verifyCreateNewTemplate();
			
		}
		
		@AfterClass
		public void tearDown() throws InterruptedException {
			
			Thread.sleep(1000);
			driver.quit();
		}
}
