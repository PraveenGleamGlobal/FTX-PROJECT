package com.ftx.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.CallsModulePage;
import com.ftx.qa.pages.ClientStatusModulePage;
import com.ftx.qa.pages.LoginPage;

public class ClientStatusModulePageTest extends TestBase {
	static LoginPage loginPages;
	ClientStatusModulePage Clientpage; 

	public ClientStatusModulePageTest() {
		super();
	}

	@BeforeClass
	public void setup() {
		intialization();
		loginPages = new LoginPage();
	    Clientpage = new ClientStatusModulePage();
	}

	@Test(priority = 1)
	public static void ClienstatusModule() {
		loginPages.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 2)
	public static void executeAgreementPendinglink() throws InterruptedException {

		ClientStatusModulePage Clientpage = new ClientStatusModulePage();

		Clientpage.verifyAgreementPendinglink();
		
	}
	
	@Test(priority = 3)
	public static void executeAgreementCompletedlink() throws InterruptedException {

		ClientStatusModulePage Clientpage = new ClientStatusModulePage();

		Clientpage.verifyAgreementCompletedlink();
		
	}
	
	
	@Test(priority = 4)
	public static void executeAgreementReceivedlink() throws InterruptedException {

		ClientStatusModulePage Clientpage = new ClientStatusModulePage();

		Clientpage.verifyAgreementReceivedlink();
		
	}
	
	@Test(priority = 5)
	public static void executeInstallationPendinglink() throws InterruptedException {

		ClientStatusModulePage Clientpage = new ClientStatusModulePage();

		Clientpage.verifyInstallationPendinglink();
	}
	
	
	@Test(priority = 6)
	public static void executePartiallyInstalledlink() throws InterruptedException {

		ClientStatusModulePage Clientpage = new ClientStatusModulePage();

		Clientpage.verifyPartiallyInstalledlink();
	}
	
	
	@Test(priority = 7)
	public static void executeInstallationCompletedlink() throws InterruptedException {

		ClientStatusModulePage Clientpage = new ClientStatusModulePage();

		Clientpage.verifyInstallationCompletedlink();
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.quit();
	}
	
	
	}

