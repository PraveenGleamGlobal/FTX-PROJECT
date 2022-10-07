package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ftx.qa.base.TestBase;

public class StaffPage2 extends TestBase{

	@FindBy(xpath="(//span[@class='nav-text'])[2]")
	public static WebElement staffslink;
	
	@FindBy(id="list-inactive")
	public static WebElement inactivelink;
	
	@FindBy(xpath="//div[@id='table2_length']//select[1]")
	public static WebElement inactivedropdown;
	
	@FindBy(xpath="(//input[@type='search'])[2]")
	public static WebElement inactivesearchbox;
	
	
	@FindBy(id="list-transfer")
	public static WebElement transferenquirylink;
	
	
	@FindBy(xpath="//*[@id=\"DataTables_Table_0_length\"]/label/div/select")
	public static WebElement transferenqdropdown;
	
	
	@FindBy(xpath="//input[@class='form-control searchkey']")
	public static WebElement transferenqsearchbox2;
	
	@FindBy(xpath="//button[text()='Search']")
	public static WebElement transferenqsearchbutton;
	
	public StaffPage2() {
		PageFactory.initElements(driver, this);
	}



public static void verifyProfilePage3() throws InterruptedException {
	   
	   Thread.sleep(2000);
	   JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", staffslink);
	   
	   Thread.sleep(1000);
	   executor.executeScript("arguments[0].click();", inactivelink);
	  
	   Select select= new Select(inactivedropdown);
	   
	   Thread.sleep(1000);
	   select.selectByVisibleText("25");
	   
	   Thread.sleep(1000);
	   select.selectByVisibleText("50");
	   
	   Thread.sleep(1000);
	   select.selectByVisibleText("100");
	   
	   Thread.sleep(1000);
	   inactivesearchbox.sendKeys("praveen");
	   
}

public static void verifyProfilePage4() throws InterruptedException {
	   
	   Thread.sleep(1000);
	   JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", transferenquirylink);
		
		Select select= new Select(transferenqdropdown);
		
		Thread.sleep(1000);
		select.selectByVisibleText("25");
		
		Thread.sleep(1000);
		select.selectByVisibleText("50");
		
		Thread.sleep(1000);
		select.selectByVisibleText("100");
		
		Thread.sleep(1000);
		transferenqsearchbox2.sendKeys("nsk786@gmail.com");
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", transferenqsearchbutton);
		
	   
}

}