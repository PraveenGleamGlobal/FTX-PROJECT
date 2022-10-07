package com.ftx.qa.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;

public class HomePage extends TestBase{
@FindBy(xpath="(//a[@data-toggle='tab'])[2]")
public static WebElement monthlink;
@FindBy(xpath="//a[@href='#navpills-1']")
public static WebElement weeklink;
@FindBy(xpath="//div[@class='card-header']")
public static WebElement Campaignslink;
@FindBy(xpath="//a[text()='Emergency']")
public static WebElement emergencylink;
@FindBy(xpath="//a[text()='Basic']")
public static WebElement basiclink;
@FindBy(xpath="//div[@class='card-header justify-content-start']//h4[@class='card-title']")
public static WebElement TodaysSMTPPerformancelink;
public HomePage() {
	PageFactory.initElements(driver, this);
}
public static void verifyCampaignPerformance() throws InterruptedException {
	Thread.sleep(1000);
	JavascriptExecutor executor= (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", monthlink);
	Thread.sleep(1000);
	executor.executeScript("arguments[0].click();", weeklink);
}
public static void verifyCampaigns() throws InterruptedException{
	
	Thread.sleep(1000);
	JavascriptExecutor executor= (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].scrollIntoView(true)", Campaignslink);
//	Actions a = new Actions(driver);
//	scroll down a page
//	a.sendKeys(Keys.PAGE_DOWN).build().perform();
//	scroll up a page
//	a.sendKeys(Keys.PAGE_UP).build().perform();
	executor.executeScript("arguments[0].click();", emergencylink);
	Thread.sleep(1000);
	executor.executeScript("arguments[0].click();", basiclink);	

}


public static void verifyTodaysSMTPPerformance() throws InterruptedException{
	
Thread.sleep(1000);
JavascriptExecutor js= (JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView(true)",TodaysSMTPPerformancelink);
Thread.sleep(1000);
js.executeScript("window.scrollBy(0,-1250)"," ");

}
}
	