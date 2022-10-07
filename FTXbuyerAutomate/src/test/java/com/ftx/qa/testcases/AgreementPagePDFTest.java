package com.ftx.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.AgreementPage;
import com.ftx.qa.pages.AgreementPdfPage;
import com.ftx.qa.pages.LoginPage;

public class AgreementPagePDFTest extends TestBase {

	LoginPage loginPage;
	
	public AgreementPagePDFTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intialization();
		loginPage = new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			
}
	@Test
	public void executeAgreementPDFPage() throws InterruptedException {
		
		AgreementPdfPage pdfpage= new AgreementPdfPage();
		
		Thread.sleep(2000);
		pdfpage.verifyAgreementPagePDF();
	}
	
	 @AfterMethod
	    public static void tearDown() throws InterruptedException {
	    	
		 Thread.sleep(2000);
	    	driver.quit();
	    }
}
