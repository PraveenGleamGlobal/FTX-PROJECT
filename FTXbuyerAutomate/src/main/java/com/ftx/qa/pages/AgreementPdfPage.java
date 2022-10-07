package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;

public class AgreementPdfPage extends TestBase {

	@FindBy(xpath="//span[text()='Agreement PDF']")
	public static WebElement agreementpdflink;
	
	public AgreementPdfPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public static void verifyAgreementPagePDF() {
		

		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", agreementpdflink);
		
	}
}
