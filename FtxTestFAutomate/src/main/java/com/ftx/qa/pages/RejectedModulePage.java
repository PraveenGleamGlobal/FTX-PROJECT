package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ftx.qa.base.TestBase;

public class RejectedModulePage extends TestBase {

	@FindBy(xpath="//ul[@id='menu']/li[2]/ul[1]/li[2]/a[1]")
	public static WebElement rejectedlink;
	
	@FindBy(xpath="//a[contains(@class,'badge badge-warning')]")
	public static WebElement rejectedbutton;
	
	@FindBy(xpath="//span[text()=' Search']")
	public static WebElement searchbutton1;
	
	@FindBy(name="searchkey")
	public static WebElement searchrejected;
	
    @FindBy(xpath="//button[@type='button']")
    public static WebElement fetchbutton;
    
    @FindBy(xpath="//select[@name='DataTables_Table_0_length']")
    public static WebElement dropdownrejectedsubmodule;
	
	public RejectedModulePage() {
		PageFactory.initElements(driver, this);
	}
	
	public static void clickonrejectedlink() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", rejectedlink);
	
		Thread.sleep(2000);
		searchrejected.sendKeys("disha");
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", searchbutton1);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", fetchbutton);
		
		Select select= new Select(dropdownrejectedsubmodule);
		
		Thread.sleep(1000);
		select.selectByVisibleText("10");
		
		Thread.sleep(1000);
		select.selectByVisibleText("25");
		
		Thread.sleep(1000);
		select.selectByVisibleText("50");
		
		Thread.sleep(1000);
		select.selectByVisibleText("100");
		
		//Thread.sleep(1000);
		//executor.executeScript("arguments[0].click();", rejectedbutton);


	
}

}