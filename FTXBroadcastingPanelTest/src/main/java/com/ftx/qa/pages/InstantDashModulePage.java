package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import com.ftx.qa.base.TestBase;

public class InstantDashModulePage extends TestBase {
	@FindBy(xpath = "//span[text()='Instant Dash']")
	public static WebElement InstantDashlink;
	@FindBy(xpath = "//a[text()='Month']")
	public static WebElement Monthlink;
	@FindBy(xpath = "//a[text()='Weak']")
	public static WebElement Weeklink;
	@FindBy(xpath = "//h4[text()='Campaigns']")
	public static WebElement Campaignslink;
	@FindBy(xpath = "//a[text()='Emergency']")
	public static WebElement Emergencylink;
	@FindBy(xpath = "//a[text()='Basic']")
	public static WebElement Basiclink;
	@FindBy(xpath = "//div[@class='card-header justify-content-start']")
	public static WebElement TodaysSMTPPerformance;

	public InstantDashModulePage () {
		PageFactory.initElements(driver, this);
	}

	public static void verifyInstantDashlink() throws InterruptedException {

		Thread.sleep(1000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", InstantDashlink);
	}

	public static void verifyCampaignPerformance() throws InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", Monthlink);
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", Weeklink);
	}

	public static void verifyCampaigns() throws InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", Campaignslink);

		executor.executeScript("arguments[0].click();", Emergencylink);
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", Basiclink);
	}

	public static void verifyTodaysSMTPPerformance() throws InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView();", TodaysSMTPPerformance);
		Thread.sleep(1000);
		executor.executeScript("window.scrollBy(0,-1250)", " ");
	}
}
