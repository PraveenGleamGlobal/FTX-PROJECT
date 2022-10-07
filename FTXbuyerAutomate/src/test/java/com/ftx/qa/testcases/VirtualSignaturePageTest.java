package com.ftx.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.LoginPage;
import com.ftx.qa.pages.VirtualSignaturePage;

public class VirtualSignaturePageTest extends TestBase {

LoginPage loginPage;
	
	
	public VirtualSignaturePageTest () {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intialization();
		loginPage = new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			
}
	
	public void executeVirtualSignatureLink() throws InterruptedException {
		
		VirtualSignaturePage vpage= new VirtualSignaturePage();
		
		Thread.sleep(2000);
		vpage.verifyVirtualSignature();
	}
	
	@Test
	public void executeSignature() throws InterruptedException {
		
		executeVirtualSignatureLink();
		
		VirtualSignaturePage vpage= new VirtualSignaturePage();
		Thread.sleep(2000);
		vpage.verifysignauture();
		
	}
	
	  @AfterMethod
	    public static void tearDown() throws InterruptedException {
	    	
		  Thread.sleep(2000);
	    	driver.quit();
	    }
}
