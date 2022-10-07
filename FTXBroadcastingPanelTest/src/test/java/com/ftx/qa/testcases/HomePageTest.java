package com.ftx.qa.testcases;

import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.HomePage;
import com.ftx.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;

	public HomePageTest() {
		super();
	}

	@BeforeClass
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
	}

	@Test(priority = 1)
	public void logintest() {
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 2)
	public void verifyHomepage() throws InterruptedException {
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homepage.verifyCampaignPerformance();
		homepage.verifyCampaigns();
		homepage.verifyTodaysSMTPPerformance();
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
