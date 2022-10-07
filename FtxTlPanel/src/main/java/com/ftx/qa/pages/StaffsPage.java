package com.ftx.qa.pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ftx.qa.base.TestBase;

public class StaffsPage extends TestBase {

	@FindBy(xpath="(//span[@class='nav-text'])[2]")
	public static WebElement staffslink;
	
	@FindBy(xpath="//select[@name='table1_length']")
	public static WebElement differententries;

	@FindBy(xpath="//a[contains(@class,'list-group-item list-group-item-action')]")
	public static WebElement activelink;
	
	@FindBy(xpath="//input[@type='search']")
	public static WebElement searchbox;
	
	@FindBy(xpath="//span[text()=' View']")
	public static WebElement viewbutton;
	
	@FindBy(xpath="//a[@type='button']/child::i")
	public static WebElement editoption;
	
	@FindBy(xpath="//input[@class='form-control name']")
	public static WebElement namefield;
	
	@FindBy(xpath="(//a[@type='button']//i)[3]")
	public static WebElement editoption2;
	
	@FindBy(xpath="//input[@class='form-control Uname']")
	public static WebElement usernamefield;
	
	@FindBy(xpath="//a[@class='ml-3 emaillow']//i[1]")
	public static WebElement editoption3;
	
	@FindBy(xpath="//input[@class='form-control email']")
	public static WebElement emailfield;
	
	@FindBy(xpath="//a[@class='ml-3 extlow']//i[1]")
	public static WebElement editoption4;
	
	@FindBy(xpath="//input[@class='form-control ext']")
	public static WebElement extensionnumberfield;
	
	@FindBy(xpath="//a[@class='ml-3 phonelow']//i[1]")
	public static WebElement editoption5;
	
	
	@FindBy(xpath="//input[@class='form-control phone']")
	public static WebElement phonenumberfield;
	
	@FindBy(xpath="//a[@class='ml-3 enqlimitlow']//i[1]")
	public static WebElement editoption6;
	
	@FindBy(xpath="//input[@class='form-control enqlimit']")
	public static WebElement enquirylimitfield;
	
	@FindBy(xpath="//div[@id='list-tab']/child::a[2]")
	public static WebElement invoicelink;
	
	@FindBy(xpath="//div[@id='list-tab']/child::a[3]")
	public static WebElement Domains;
	
	@FindBy(xpath="//div[@id='list-tab']/child::a[4]")
	public static WebElement passwordresetlink;
	
	@FindBy(xpath="//div[@id='list-tab']/child::a[5]")
	public static WebElement attendancelink;
	
	
	@FindBy(xpath="//select[@class='form-control sortmonth']")
	public static WebElement monthslectioncalendar;
	
	
	@FindBy(xpath="(//a[@type='button']//i)[2]")
	public static WebElement saveOption1;
	
	@FindBy(xpath="//a[contains(@class,'ml-1 Unamesave')]//i[1]")
	public static WebElement saveoption2;
	
	@FindBy(xpath="//a[contains(@class,'ml-1 emailsave')]//i[1]")
	public static WebElement saveoption3;
	
	@FindBy(xpath="//a[contains(@class,'ml-1 extsave')]//i[1]")
	public static WebElement saveoption4;
	
	@FindBy(xpath="//a[contains(@class,'ml-1 phonesave')]//i[1]")
	public static WebElement saveoption5;
	
	@FindBy(xpath="//a[contains(@class,'ml-1 enqlimitsave')]//i[1]")
	public static WebElement saveoption6;
	
	@FindBy(xpath="//a[@class='ml-3 passwordlow']//i[1]")
	public static WebElement passwordeditoption;
	
	@FindBy(xpath="//i[contains(@class,'fas fa-sync')]")
	public static WebElement passwordchange;
	
	@FindBy(xpath="//a[contains(@class,'ml-1 passwordsave')]//i[1]")
	public static WebElement passwordsaveoption;
	
	
	public StaffsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public static void verifyProfilePage1() throws InterruptedException {
		
		Thread.sleep(2000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", staffslink);
		
		
		Select select= new Select(differententries);
		
		Thread.sleep(1000);
		select.selectByVisibleText("10");
		
		Thread.sleep(1000);
		select.selectByVisibleText("25");
		
		Thread.sleep(1000);
		select.selectByVisibleText("50");
		
		Thread.sleep(1000);
		select.selectByVisibleText("100");
		
		Thread.sleep(1000);
		searchbox.sendKeys("angelina@ftxtradingsoftware.com");
		
		Thread.sleep(1000);
		searchbox.clear();
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", viewbutton);
		
		String oldwindow =driver.getWindowHandle();
		
		Set<String>  handles= driver.getWindowHandles();
		
		for (String newwindow : handles) {
			
			driver.switchTo().window(newwindow);
			
		}
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", editoption);
		Thread.sleep(1000);
		namefield.clear();
		Thread.sleep(1000);
		namefield.sendKeys("Angel");
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", saveOption1);
	
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", editoption2);
		Thread.sleep(1000);
		usernamefield.clear();
		Thread.sleep(1000);
		usernamefield.sendKeys("ANGEL123");
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", saveoption2);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", editoption3);
	    Thread.sleep(1000);
	    emailfield.clear();
	    Thread.sleep(1000);
	    emailfield.sendKeys("angelina@ftxtradingsoftware.com");
	    Thread.sleep(1000);
	    executor.executeScript("arguments[0].click();", saveoption3);
	    
	    Thread.sleep(1000);
	    executor.executeScript("arguments[0].click();", editoption4);
	    Thread.sleep(1000);
	    extensionnumberfield.clear();
	    Thread.sleep(1000);
	    extensionnumberfield.sendKeys("110");
	    Thread.sleep(1000);
	    executor.executeScript("arguments[0].click();", saveoption4);
		
	    Thread.sleep(1000);
	    executor.executeScript("arguments[0].click();", editoption5);
	    Thread.sleep(1000);
	    phonenumberfield.clear();
	    Thread.sleep(1000);
	    phonenumberfield.sendKeys("9677619449");
	    Thread.sleep(1000);
	    executor.executeScript("arguments[0].click();", saveoption5);
	    
	    Thread.sleep(1000);
	    executor.executeScript("arguments[0].click();", editoption6);
	    enquirylimitfield.clear();
	    Thread.sleep(1000);
	    enquirylimitfield.sendKeys("110");
	    Thread.sleep(1000);
	    executor.executeScript("arguments[0].click();", saveoption6);
	}
	
	
	public static void verifyprofilepage2() throws InterruptedException {
	
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", invoicelink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", Domains);

		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", passwordresetlink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", passwordeditoption);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", passwordchange);
		
		Thread.sleep(1000);
		passwordchange.click();
		
		Thread.sleep(1000);
		passwordchange.click();
		
		Thread.sleep(1000);
		passwordchange.click();
		
		Thread.sleep(1000);
		passwordchange.click();
		
		Thread.sleep(1000);
		passwordsaveoption.click();
	
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", attendancelink);
		
		Select select= new Select(monthslectioncalendar);
		
		Thread.sleep(1000);
		select.selectByVisibleText("January");
		
		Thread.sleep(1000);
		select.selectByVisibleText("February");
		
		Thread.sleep(1000);
		select.selectByVisibleText("March");
		
		Thread.sleep(1000);
		select.selectByVisibleText("April");
		
		Thread.sleep(1000);
		select.selectByVisibleText("May");
		
		Thread.sleep(1000);
		select.selectByVisibleText("June");
		
		Thread.sleep(1000);
		select.selectByVisibleText("July");
		
		Thread.sleep(1000);
		select.selectByVisibleText("August");
		
	}
	
}

   

	   
	 
	   
	   

























