package com.ftx.qa.testcases;

import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.InstantDashModulePage;
import com.ftx.qa.pages.LoginPage;

public class InstantDashModulePageTest extends TestBase{
	LoginPage loginpage;
	InstantDashModulePage instantdashboard;
	public InstantDashModulePageTest() {
		super();
	}
	@BeforeClass
	public void setup() {
		initialization();
		loginpage=new LoginPage();
		instantdashboard=new InstantDashModulePage();
	}
	@Test(priority=1)
public void logintest() {
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
}
	@Test(priority=2)
	public void verifyInstantdashboard() throws InterruptedException{
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		instantdashboard.verifyInstantDashlink();
		instantdashboard.verifyCampaignPerformance();
		instantdashboard.verifyCampaigns();
		instantdashboard.verifyTodaysSMTPPerformance();
	}
	@AfterClass
	public void teardown() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.quit();
	}
}
