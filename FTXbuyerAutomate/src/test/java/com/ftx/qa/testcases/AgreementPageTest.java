package com.ftx.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.AgreementPage;
import com.ftx.qa.pages.LoginPage;

public class AgreementPageTest extends TestBase {

LoginPage loginPage;
	
	
	public AgreementPageTest () {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intialization();
		loginPage = new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			
}
	
	@Test
	public void executeAcceptAgreementLink() throws InterruptedException {
		
		AgreementPage agreepage= new AgreementPage();
		
		Thread.sleep(2000);
		agreepage.verifyAcceptAgreementLink();
	}
		
		//Thread.sleep(2000);
		//agreepage.verifyAcceptButton();
		
	//}
	
	  @AfterMethod
	    public static void tearDown() throws InterruptedException {
	    	
		  Thread.sleep(2000);
	    	driver.quit();
	    }
}
