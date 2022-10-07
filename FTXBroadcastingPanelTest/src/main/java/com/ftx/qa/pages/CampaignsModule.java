package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ftx.qa.base.TestBase;

public class CampaignsModule extends TestBase {

	@FindBy(xpath="//span[text()='Campaigns']")
	public static WebElement campaignslink;
	
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/ul/li[1]/a")
	public static WebElement maillink;
	
	@FindBy(xpath="//select[@name='DataTables_Table_0_length']")
	public static WebElement dropdown1;
	
	@FindBy(xpath="//input[@type='search']")
	public static WebElement searchoption;
	
	@FindBy(xpath="//a[contains(@class,'btn btn-dark')]")
	public static WebElement viewbutton;
	
	@FindBy(xpath="//select[@name='DataTables_Table_0_length']")
	public static WebElement dropdown2;
	
	@FindBy(xpath="//input[@type='search']")
	public static WebElement searchoption2;
	
	@FindBy(xpath="//button[normalize-space()='New campaign']")
	public static WebElement newcampaign;
	
	@FindBy(xpath="//input[@placeholder='Enter Name']")
	public static WebElement entername;
	
	@FindBy(xpath="//select[@name='template_id']")
	public static WebElement selecttemplate;
	
	@FindBy(xpath="//select[@name='group_id']")
	public static WebElement selectgroup;
	
	@FindBy(id="campaign_date")
	public static WebElement clickdate;
	
	@FindBy(xpath="//div[text()='24']")
	public static WebElement selectdate;
	
	@FindBy(xpath="//i[contains(@class,'fa fa-times')]")
	public static WebElement cancelbtn;
	
	@FindBy(xpath="//button[text()='Save']")
	public static WebElement savebtn;
	
	
	
	
	@FindBy(xpath="//a[@href='https://broadcasting.ftxtradingsoftware.com/broadcasting/campaign/sms/index']")
	public static WebElement smslink;
	
	@FindBy(xpath="//button[text()='New campaign']")
	public static WebElement newcampaign2;
	
	@FindBy(xpath="//input[@placeholder='Enter Name']")
	public static WebElement entername1;
	
	@FindBy(xpath="//select[@name='template_id']")
	public static WebElement selecttemplate2;
	
	@FindBy(xpath="//select[@name='group_id']")
	public static WebElement selectgroup2;
	
	@FindBy(id="campaign_date")
	public static WebElement clickdate2;
	
	@FindBy(xpath="//div[text()='24']")
	public static WebElement selectdate2;
	
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	public static WebElement cancelbtn2;
	
	public CampaignsModule() {
		
		PageFactory.initElements(driver, this);
	}
	
	public static void verifyMailLink() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", campaignslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", maillink);
		
		Thread.sleep(1000);
		Select select= new Select(dropdown1);
		select.selectByVisibleText("25");
		
		Thread.sleep(1000);
		select.selectByVisibleText("50");
		
		Thread.sleep(1000);
		select.selectByVisibleText("100");
		
		Thread.sleep(1000);
		searchoption.sendKeys("test123");
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", viewbutton);
		
		Thread.sleep(1000);
		Select select2= new Select(dropdown2);
		select2.selectByVisibleText("25");
		
		Thread.sleep(1000);
		select2.selectByVisibleText("50");
		
		Thread.sleep(1000);
		select2.selectByVisibleText("100");
		
		Thread.sleep(1000);
		searchoption2.sendKeys("Allan Joshua");
		
	}
	
	public static void verifyNewCampaign() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.navigate().back();
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", newcampaign);
		
		Thread.sleep(1000);
		entername.sendKeys("praveen");
		
		Thread.sleep(1000);
		Select select= new Select(selecttemplate);
		select.selectByValue("7");
		
		Thread.sleep(1000);
		select.selectByValue("6");
		
		Thread.sleep(1000);
		select.selectByValue("3");
		
		Thread.sleep(1000);
		Select select2= new Select(selectgroup);
		select2.selectByValue("30");
		
		Thread.sleep(1000);
		select2.selectByValue("29");
		
		Thread.sleep(1000);
		select2.selectByValue("27");
		
		Thread.sleep(1000);
		select2.selectByValue("24");
		
		Thread.sleep(1000);
		select2.selectByValue("23");
		
		Thread.sleep(1000);
		select2.selectByValue("21");
		
		Thread.sleep(1000);
		select2.selectByValue("19");
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", clickdate);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", selectdate);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", cancelbtn);
	}
	
	public static void verifySMS() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", campaignslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", smslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", newcampaign2);
		
		Thread.sleep(1000);
		entername.sendKeys("praveen");
		
		Thread.sleep(1000);
		Select select= new Select(selecttemplate);
		select.selectByValue("39");
		
		Thread.sleep(1000);
		select.selectByValue("38");
		
		Thread.sleep(1000);
		select.selectByValue("33");
		
		Thread.sleep(1000);
		select.selectByValue("28");
		
		Thread.sleep(1000);
		Select select2= new Select(selectgroup2);
		select2.selectByIndex(1);

		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", selectdate2);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", clickdate2);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", cancelbtn2);
	}
	
}
