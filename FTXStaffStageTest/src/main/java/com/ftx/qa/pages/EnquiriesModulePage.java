package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ftx.qa.base.TestBase;

public class EnquiriesModulePage extends TestBase {

	@FindBy(xpath="//span[@class='side-menu__label active']")
	public static WebElement enquirieslink;
	
	@FindBy(xpath="//span[normalize-space()='New']")
	public static WebElement newlink;
	
	@FindBy(xpath="//a[@class='btn btn-app btn-secondary mr-2 mt-1 mb-1 add_enq']")
	public static WebElement addenquiry;
	
	@FindBy(xpath="//input[@placeholder='Name']")
	public static WebElement nametextbox;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	public static WebElement emailtextbox;
	
	@FindBy(xpath="//input[@placeholder='Phone Number']")
	public static WebElement phonenumberfield;
	
	@FindBy(xpath="//select[@name='country']")
	public static WebElement selectcountry;
	
	@FindBy(xpath="//input[@placeholder='City']")
	public static WebElement citytextbox;
	
	@FindBy(xpath="//a[@class='btn btn-app btn-success mr-2 mt-1 mb-1 Save_enquiry']")
	public static WebElement savebtn;
	
	@FindBy(xpath="//span[normalize-space()='Assigned']")
	public static WebElement assignedlink;
	
	@FindBy(xpath="//select[@name='DataTables_Table_0_length']")
	public static WebElement dropdownassigned;
	
	@FindBy(xpath="//a[@class='nav-link mt-2 mr-2 border p-1 text-info']")
	public static WebElement ringing1;
	
	@FindBy(xpath="(//li[@class='nav-item']//a)[3]")
	public static WebElement postponed1;
	
	@FindBy(xpath="//a[contains(@class,'border p-1 text-dark')]")
	public static WebElement invoice1;
	
	@FindBy(xpath="//a[contains(@class,'nav-link mt-2 mr-2 border p-1 text-gray')]")
	public  static WebElement signed1;
	
	@FindBy(xpath="//a[@class='nav-link mt-2 mr-2 border p-1 text-danger']")
	public static WebElement notinterested1;
	
	@FindBy(xpath="//a[@class='nav-link mt-2 mr-2 border p-1 text-primary']")
	public static WebElement todayringing1;
	
	@FindBy(xpath="//a[@class='nav-link mt-2 mr-2 border p-1 text-warning']")
	public static WebElement todaypostponed1;
	
	@FindBy(xpath="//a[contains(@class,'nav-link mt-2')]")
	public static WebElement assigned1;
	
	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	public static WebElement searchoption;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/div[1]/button[1]/i[1]")
	public static WebElement actionbutton;
	
	@FindBy(xpath="//ul[contains(@class,'dropdown-menu vertical-dropdown')]//a")
	public static WebElement ringingaction;
	
	@FindBy(xpath = "//input[@id='dp1663824855836']")
	public static WebElement clickdate;
	
	@FindBy(xpath="//a[contains(text(), '10')]")
	public static WebElement dateselection;
	
	@FindBy(xpath="//button[text()='Close']")
	public static WebElement closebtn;

	
	@FindBy(xpath="//span[normalize-space()='Ringing']")
	public static WebElement ringing;
	
	@FindBy(xpath="//select[@name='DataTables_Table_0_length']")
	public static WebElement dropdownringing;
	
	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	public static WebElement searchoption2;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/div[1]/button[1]/i[1]")
	public static WebElement action;
	
	@FindBy(xpath="(//ul[@role='menu']//a)[3]")
	public static WebElement actionperform;
	
	@FindBy(xpath="(//textarea[@name='description'])[3]")
	public static WebElement description2;
	
	@FindBy(xpath="(//button[text()='Close'])[3]")
	public static WebElement closebtn2;
	
	
	
	@FindBy(xpath="//span[normalize-space()='Postponed']")
	public static WebElement postponedlink;
	
	@FindBy(xpath="//select[@name='DataTables_Table_0_length']")
	public static WebElement dropdownpostponed;
	
	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	public static WebElement searchoption3;
	
	@FindBy(xpath="//tr[@class='odd']//i[@class='fa fa-bars']")
	public static WebElement actionbutton2;
	
	@FindBy(xpath="//ul[@role='menu']//a")
	public static WebElement actionriningoption1;
	
	@FindBy(xpath="//textarea[@name='description']")
	public static WebElement description;
	
	@FindBy(id="dp1663828018886")
	public static WebElement choosedate1;
	
	@FindBy(xpath="//input[@placeholder='dd-mm-yyyy']")
	public static WebElement selectdate1;
	
	@FindBy(xpath="//button[text()='Close']")
	public static WebElement closebutton1;
	

	
	public EnquiriesModulePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public static void verifyEnquiriesModulePage() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", enquirieslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", newlink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", addenquiry);
		
		Thread.sleep(1000);
		nametextbox.sendKeys("sabari");
		
		Thread.sleep(1000);
		emailtextbox.sendKeys("sabari4663@gmail.com");
		
		Thread.sleep(1000);
		phonenumberfield.sendKeys("9875642549");
		
		Thread.sleep(1000);
		Select select= new Select(selectcountry);
		
		select.selectByVisibleText("India");
		
		Thread.sleep(1000);
		select.selectByVisibleText("Israel");
		
		Thread.sleep(1000);
		select.selectByVisibleText("Kazakhstan");
		
		Thread.sleep(1000);
		select.selectByVisibleText("Lebanon");
		
		Thread.sleep(1000);
		citytextbox.sendKeys("erode");
		
		Thread.sleep(1000);
		savebtn.click();
		
	}
	
	
	public static void verifyEnquiriesAssignedSubModule() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", enquirieslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", assignedlink);
		
//		Thread.sleep(1000);
//		Select select= new Select(dropdownassigned);
//		select.selectByVisibleText("10");
//		
//		Thread.sleep(1000);
//		select.selectByVisibleText("25");
//		
//		Thread.sleep(1000);
//		select.selectByVisibleText("50");
//		
//		Thread.sleep(1000);
//		select.selectByVisibleText("100");
//		
//		Thread.sleep(1000);
//		executor.executeScript("arguments[0].click();", ringing1);
//		
//		Thread.sleep(1000);
//		executor.executeScript("arguments[0].click();", postponed1);
//		
//		Thread.sleep(1000);
//		executor.executeScript("arguments[0].click();", invoice1);
//		
//		Thread.sleep(1000);
//		executor.executeScript("arguments[0].click();", signed1);
//		
//		Thread.sleep(1000);
//		executor.executeScript("arguments[0].click();", notinterested1);
//		
//		Thread.sleep(1000);
//		executor.executeScript("arguments[0].click();", todayringing1);
//		
//		Thread.sleep(1000);
//		executor.executeScript("arguments[0].click();", todaypostponed1);
//		
//		Thread.sleep(1000);
//		executor.executeScript("arguments[0].click();", assigned1);
		
		Thread.sleep(1000);
		searchoption2.sendKeys("test enquiry");
		
//		Thread.sleep(1000);
//		searchoption2.clear();
	
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", actionbutton);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", ringingaction);
		
		Thread.sleep(1000);
		description.sendKeys("due to personal reason");
		
		Thread.sleep(1000);
		Actions actions= new Actions(driver);
		actions.click(clickdate);
//		
//		Thread.sleep(1000);
//		executor.executeScript("arguments[0].click();", clickdate);
		
//		Thread.sleep(1000);
//		executor.executeScript("arguments[0].click();", dateselection);
//
//		Thread.sleep(1000);
//		executor.executeScript("arguments[0].click();", closebtn);
	}
	
	
	public static void verifyRingingSubModule() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", enquirieslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", ringing);
		
		Thread.sleep(1000);
		Select select= new Select(dropdownringing);
		select.selectByVisibleText("10");
		
		Thread.sleep(1000);
		select.selectByVisibleText("25");
		
		Thread.sleep(1000);
		select.selectByVisibleText("50");
		
		Thread.sleep(1000);
		select.selectByVisibleText("100");
		
		Thread.sleep(1000);
		searchoption2.sendKeys("simla");
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", action);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", actionperform);
		
		Thread.sleep(1000);
		description2.sendKeys("due to some reason");
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", closebtn2);
	}
	
	public static void verifyPostponedSubModule() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", enquirieslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", postponedlink);
		
//		Thread.sleep(1000);
//		Select select= new Select(dropdownpostponed);
//		select.selectByVisibleText("10");
//		
//		Thread.sleep(1000);
//		select.selectByVisibleText("25");
//		
//		Thread.sleep(1000);
//		select.selectByVisibleText("50");
//		
//		Thread.sleep(1000);
//		select.selectByVisibleText("100");
		
		Thread.sleep(1000);
		searchoption3.sendKeys("mahalakshmi");
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", actionbutton2);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", actionriningoption1);
		
		Thread.sleep(1000);
		description.sendKeys("due to some reason");
		
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", choosedate1);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", selectdate1);
		
//		Thread.sleep(1000);
//		executor.executeScript("arguments[0].click();", closebutton1);
	
	}
}



































