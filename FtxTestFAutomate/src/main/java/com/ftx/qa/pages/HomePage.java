package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;

import dev.failsafe.internal.util.Assert;

public class HomePage extends TestBase {

	@FindBy(xpath="//input[contains(@class,'form-control h-auto')]")
	public static WebElement SearchOption;
	
	@FindBy(xpath="//button[contains(@class,'btn btn-primary')]")
	public static WebElement SearchButton;
	
	@FindBy(xpath="(//h6[@class='text-secondary fs-16'])[2]")
	public static WebElement praveen;
	
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public static void clickOnDashboardButton() {
		
		//DashBoardButton.click();
		
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", SearchButton);
		
		SearchOption.sendKeys("praveen");
	
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", SearchButton);
		
	   // String Actualtext=  praveen.getText();
	    
	}
}
