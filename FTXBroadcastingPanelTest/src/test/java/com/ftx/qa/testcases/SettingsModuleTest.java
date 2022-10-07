package com.ftx.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.HomePage;
import com.ftx.qa.pages.LoginPage;
import com.ftx.qa.pages.SettingsModule;
import com.ftx.qa.pages.TemplatesModule;

public class SettingsModuleTest extends TestBase{

	LoginPage loginpage;
    HomePage Homepage;
	SettingsModule settingsmodule;
	
	public SettingsModuleTest() {
		super();
	}
	
	@BeforeClass
	public void setup() {
		
		initialization();
		loginpage= new LoginPage();
		Homepage= new HomePage();
	    settingsmodule= new SettingsModule();
		
	}
	

		@Test(priority = 1)
		public void loginTest() {
			Homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
		
		@Test(priority = 2)
		public void executeSupportSMTPLink() throws InterruptedException {
			
			settingsmodule.verifySupportSMTPLink();
		}
		
		
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.quit();
	}
}
