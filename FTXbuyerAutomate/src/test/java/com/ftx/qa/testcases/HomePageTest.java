package com.ftx.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.Homepage;
import com.ftx.qa.pages.LoginPage;


	public  class HomePageTest extends TestBase {
			
			LoginPage loginPage;
			
			
			public HomePageTest() {
				super();
			}
			
			@BeforeMethod
			public void setup() {
				intialization();
				loginPage = new LoginPage();
				loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
				
					
		}
			
			
			public static void executeProfilelink() throws InterruptedException {
				
				
				Homepage homepage= new Homepage();
				
				Thread.sleep(2000);
				homepage.verifyProfilelink();
				
				Thread.sleep(2000);
				driver.navigate().back();
				
			}
			
	    @Test
		public static void executeProfileAndSupportLink() throws InterruptedException {
			
	    	
	    	executeProfilelink();
	    	
            Homepage homepage= new Homepage();
			
            Thread.sleep(2000);
			homepage.verifySupportlink();
	    
			
		}
	    
	    @AfterMethod
	    public static void tearDown() throws InterruptedException {
	    	
	    	Thread.sleep(2000);
	    	driver.quit();
	    }
}

