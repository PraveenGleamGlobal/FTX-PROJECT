package com.ftx.qa.testcase;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.ExcelLoginData;
import com.ftx.qa.pages.HomePage;
import com.ftx.qa.pages.LoginPage;
import com.ftx.qa.utils.TestUtils;


public class ExcelLoginDataTest extends TestBase {


	static LoginPage loginPage;
    HomePage homepages;
	String sheetName = "Financelogintest";
	
	public ExcelLoginDataTest() {
		
		super();
	}
	
	
	public static void setup() {
		intialization();
		loginPage = new LoginPage();
		
		
		//homepages=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
}
	
	@DataProvider
	public Object [][] getLoginTestData() throws org.apache.poi.openxml4j.exceptions.InvalidFormatException  {
		Object[][] data=TestUtils.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider = "getLoginTestData")
	public static void getLoginData(String un, String pwd) throws InterruptedException {
		
		setup();
		ExcelLoginData exlogindata= new ExcelLoginData();
		exlogindata.login(un, pwd);
		
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
	
}




