package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;



public class SenderDomainModule extends TestBase {
@FindBy(xpath="//span[text()='Sender Domain']")
public static WebElement SenderDomainlink;
@FindBy(xpath="(//div[@class='card-header']//h4)[2]")
public static WebElement ActiveSMTPSupportDomain;

public SenderDomainModule() {
	PageFactory.initElements(driver, this);
}
public static void verifySenderDomain() throws InterruptedException {

	Thread.sleep(2000);
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", SenderDomainlink);
	executor.executeScript("arguments[0].scrollIntoView(true);", ActiveSMTPSupportDomain);
	Thread.sleep(2000);
	executor.executeScript("window.scrollBy(0, -1250)", " ");
	
}
}
