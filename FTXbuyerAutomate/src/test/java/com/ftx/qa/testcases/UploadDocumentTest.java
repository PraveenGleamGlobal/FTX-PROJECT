package com.ftx.qa.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.LoginPage;
import com.ftx.qa.pages.UploadDocument;

public class UploadDocumentTest extends TestBase {

	
	LoginPage loginPage;
	
	
	public UploadDocumentTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intialization();
		loginPage = new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			
}
	
	
	public void executeUploadDocuments() throws InterruptedException {
		
		UploadDocument document= new UploadDocument();
		
		
		document.verfifyUploadDocumets();
	}
	

	
	

	public void executeUploadButton() throws InterruptedException, AWTException, IOException{
		
		
		executeUploadDocuments();
		UploadDocument document= new UploadDocument();
		
		
		
		document.ChooseImage1();	
	
	}
	
	@Test
	public void verifyUploadButton() throws InterruptedException, AWTException, IOException {
		
		
		executeUploadButton();
		
		
		
		UploadDocument document= new UploadDocument();
		
		Thread.sleep(2000);
		document.chooseImage2();	
		
		Thread.sleep(2000);
		driver.quit();
}

	
	  
	}

