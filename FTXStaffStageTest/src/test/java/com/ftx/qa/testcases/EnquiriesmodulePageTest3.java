package com.ftx.qa.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.EnquiriesModulePage3;
import com.ftx.qa.pages.LoginPage;

public class EnquiriesmodulePageTest3 extends TestBase {

	
	static LoginPage loginPages;
	static EnquiriesModulePage3 modulepage3;
	
	public EnquiriesmodulePageTest3() {
		super();
	}

	@BeforeClass
	public void setup() {
		intialization();
		loginPages = new LoginPage();
	    modulepage3= new EnquiriesModulePage3();
}

	
	@Test(priority=1)
	public void EnquiriesModule3() {
		loginPages.login(prop.getProperty("username"), prop.getProperty("password"));
		
}
	@Test(priority =2)
    public static void executeInvoiceModule() throws InterruptedException {
		
		modulepage3.verifyInvoiceModule();
		
		
	}	
		
	@Test(priority =3)
	public static void executeSignedModule() throws InterruptedException, AWTException {
		
		modulepage3.verifySignedModule();
	
	}
	
	
	@Test(priority =4)
	public static void executeRequestTransfer() throws InterruptedException {
		
		modulepage3.verifyRequestTransfer();
	
	}		
	
	@Test(priority = 5)
	public static void executeTransferList() throws InterruptedException {
		
		modulepage3.verifyTransferList();
	}
	
		
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.quit();
	}
	
}
