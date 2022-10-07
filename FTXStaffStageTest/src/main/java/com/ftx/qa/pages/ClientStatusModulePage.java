package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;

public class ClientStatusModulePage extends TestBase {

	@FindBy(xpath="//span[text()='Client Status']")
	public static WebElement clientstatuslink;
	@FindBy(id = "agrpending-tab4")
	public static WebElement AgreementPendinglink;
	@FindBy(xpath = "//div[@id='agree_pending']//input[@placeholder='Search Enquiry Here...']")
	public static WebElement searchvalue;
	@FindBy(xpath = "//div[@id='agree_pending']//i[@class='fe fe-search']")
	public static WebElement clickonsearchlink;
	@FindBy(xpath = "//div[@id='agree_pending']//button[contains(@type,'button')][normalize-space()='Refresh']")
	public static WebElement clickonrefreshlink;

	@FindBy(id = "agrcompleted-tab4")
	public static WebElement AgreementCompletedlink;
	@FindBy(xpath = "//div[@id='agree_completed']//input[@placeholder='Search Enquiry Here...']")
	public static WebElement searchvalue1;
	@FindBy(xpath = "//div[@id='agree_completed']//i[@class='fe fe-search']")
	public static WebElement clickonsearchlink1;
	@FindBy(xpath = "//div[@id='agree_completed']//button[@type='button'][normalize-space()='Refresh']")
	public static WebElement clickonrefreshlink1;

	@FindBy(id = "agrreceived-tab4")
	public static WebElement AgreementReceivedlink;
	@FindBy(xpath = "//div[@id='agree_received']//input[contains(@placeholder,'Search Enquiry Here...')]")
	public static WebElement searchvalue2;
	@FindBy(xpath = "//div[@id='agree_received']//i[contains(@class,'fe fe-search')]")
	public static WebElement clickonsearchlink2;
	@FindBy(xpath = "//div[@id='agree_received']//button[contains(@type,'button')][normalize-space()='Refresh']")
	public static WebElement clickonrefreshlink2;

	@FindBy(id = "installpending-tab4")
	public static WebElement InstallationPendinglink;
	@FindBy(xpath = "//div[@id='insta_pending']//input[@placeholder='Search Enquiry Here...']")
	public static WebElement searchvalue3;
	@FindBy(xpath = "//div[@id='insta_pending']//i[@class='fe fe-search']")
	public static WebElement clickonsearchlink3;
	@FindBy(xpath = "//div[@id='insta_pending']//button[@type='button'][normalize-space()='Refresh']")
	public static WebElement clickonrefreshlink3;

	@FindBy(id = "partialinstall-tab4")
	public static WebElement PartiallyInstalledlink;
	@FindBy(xpath = "//div[@id='partially_installed']//input[contains(@placeholder,'Search Enquiry Here...')]")
	public static WebElement searchvalue4;
	@FindBy(xpath = "//div[@id='partially_installed']//i[contains(@class,'fe fe-search')]")
	public static WebElement clickonsearchlink4;
	@FindBy(xpath = "//div[@id='partially_installed']//button[contains(@type,'button')][normalize-space()='Refresh']")
	public static WebElement clickonrefreshlink4;

	@FindBy(id = "installcompleted-tab4")
	public static WebElement InstallationCompletedlink;
	@FindBy(xpath = "//div[@id='insta_completed']//input[contains(@placeholder,'Search Enquiry Here...')]")
	public static WebElement searchvalue5;
	@FindBy(xpath = "//div[@id='insta_completed']//i[@class='fe fe-search']")
	public static WebElement clickonsearchlink5;
	@FindBy(xpath = "//div[@id='insta_completed']/div[1]/div[1]/div[2]/div[1]/span[1]/button[1]")
	public static WebElement clickonrefreshlink5;

	public ClientStatusModulePage() {
		PageFactory.initElements(driver, this);
	}

	public static void verifyAgreementPendinglink() throws InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", clientstatuslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", AgreementPendinglink);
		

		Thread.sleep(1000);
		searchvalue.sendKeys("vijaya");

		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", clickonsearchlink);
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", clickonrefreshlink);

	}

	public static void verifyAgreementCompletedlink() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", AgreementCompletedlink);
		Thread.sleep(1000);
		searchvalue1.sendKeys("vijaya");

		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", clickonsearchlink1);
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", clickonrefreshlink1);
	}

	public static void verifyAgreementReceivedlink() throws InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", AgreementReceivedlink);
		Thread.sleep(1000);
		searchvalue2.sendKeys("vijaya");

		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", clickonsearchlink2);
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", clickonrefreshlink2);
	}

	public static void verifyInstallationPendinglink() throws InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", InstallationPendinglink);
		Thread.sleep(1000);
		searchvalue3.sendKeys("vijaya");

		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", clickonsearchlink3);
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", clickonrefreshlink3);
	}

	public static void verifyPartiallyInstalledlink() throws InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", PartiallyInstalledlink);
		Thread.sleep(1000);
		searchvalue4.sendKeys("vijaya");

		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", clickonsearchlink4);
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", clickonrefreshlink4);
	}

	public static void verifyInstallationCompletedlink() throws InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", InstallationCompletedlink);
		Thread.sleep(1000);
		searchvalue5.sendKeys("Vignesh");

		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", clickonsearchlink5);
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", clickonrefreshlink5);
	}

}
