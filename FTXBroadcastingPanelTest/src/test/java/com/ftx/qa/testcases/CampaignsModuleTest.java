package com.ftx.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.CampaignsModule;
import com.ftx.qa.pages.HomePage;
import com.ftx.qa.pages.LoginPage;

public class CampaignsModuleTest extends TestBase {

	LoginPage loginpage;
	HomePage Homepage;
	static CampaignsModule campaignsmodule;
	
	public CampaignsModuleTest() {
		super();
	}
	
	@BeforeClass
	public void setup() {
		
		initialization();
		loginpage= new LoginPage();
	    campaignsmodule= new CampaignsModule();
	}
	

		@Test(priority = 2)
		public void loginTest() {
			Homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
//		
//		@Test(priority = 3)
//		public static void executeMailSubModule() throws InterruptedException {
//			
//			campaignsmodule.verifyMailLink();
//			
//		}
//		
//	   @Test(priority = 4)
//	   public static void executeNewCampaign() throws InterruptedException {
//		
//			campaignsmodule.verifyNewCampaign();
//			
//		}
	   @Test(priority = 5)
	   public static void executeSMSSubModule() throws InterruptedException {
			
			campaignsmodule.verifySMS();
			
		}
	   
	   @AfterClass
	   public void tearDown() throws InterruptedException {
		   
		   Thread.sleep(1000);
		   driver.quit();
	   }
	   
}
