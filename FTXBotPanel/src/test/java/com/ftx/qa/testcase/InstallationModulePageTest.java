package com.ftx.qa.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.Homepage;
import com.ftx.qa.pages.InstallationModulePage;
import com.ftx.qa.pages.LoginPage;

public class InstallationModulePageTest extends TestBase {

	
	LoginPage loginPage;
	Homepage homepages;
	
	public InstallationModulePageTest() {
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
}
