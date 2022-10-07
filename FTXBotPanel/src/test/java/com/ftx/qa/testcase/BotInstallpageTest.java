package com.ftx.qa.testcase;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.BotInstallPage;
import com.ftx.qa.pages.Homepage;
import com.ftx.qa.pages.InstallationModulePage;
import com.ftx.qa.pages.LoginPage;
import com.ftx.qa.testutils.TestUtils;


public class BotInstallpageTest extends TestBase {

	LoginPage loginPage;
	Homepage homepages;
	String sheetName = "Sheet1";
	
	public BotInstallpageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intialization();
		loginPage = new LoginPage();
		Homepage homepage= new Homepage();
		homepages=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
}
	@Test
	public void executeInstallationlink() throws InterruptedException {
		
		InstallationModulePage installpage= new InstallationModulePage();
		
		installpage.verifyInstallationLink();
	}
	
	@DataProvider
	public Object [][] getFtxTestData() throws org.apache.poi.openxml4j.exceptions.InvalidFormatException  {
		Object data [][]=TestUtils.getTestData(sheetName);
		return data;
	}
	
	   @Test(dataProvider="getFtxTestData")
	   public static void getBotForm(String an,String un, String ps, String tp, String ip) {
		   
		  BotInstallPage botpage= new BotInstallPage();
		  botpage.botform(an, un, ps, tp, ip);
	}
}



