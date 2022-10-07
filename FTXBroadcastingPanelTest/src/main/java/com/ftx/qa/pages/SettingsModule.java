package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;

public class SettingsModule extends TestBase{

	
	@FindBy(xpath="//span[text()='Settings']")
	public static WebElement settingslink;
	
	@FindBy(xpath="(//li[@class='mm-active']//a)[3]")
	public static WebElement supportsmtps;
	
	@FindBy(xpath="//button[text()='View']")
	public static  WebElement viewbutton;
	
	@FindBy(xpath="(//input[@name='username'])[2]")
	public static WebElement mastertextbox;
	
	@FindBy(xpath="(//input[@name='username'])[3]")
	public static WebElement usernametextbox;
	
	@FindBy(xpath="(//input[@name='password'])[2]")
	public static WebElement passwordtextbox;
	
	@FindBy(xpath="(//input[@name='host'])[2]")
	public static WebElement hosttextbox;
	
	@FindBy(xpath="(//input[@name='port'])[2]")
	public static WebElement porttextbox;
	
	@FindBy(xpath="(//input[@name='smtpmethod'])[2]")
	public static WebElement smtpmethodtextbox;
	
	@FindBy(xpath="(//input[@name='from_email'])[2]")
	public static WebElement fromemailtextbox;
	
	@FindBy(xpath="(//input[@name='from_name'])[2]")
	public static WebElement fromnametextbox;
	
	@FindBy(xpath="(//input[@name='reply_email'])[2]")
	public static WebElement replyemailtextbox;
	
	@FindBy(xpath="(//input[@name='reply_name'])[2]")
	public static WebElement replynametextbox;
	
	@FindBy(xpath="(//input[@name='driver'])[2]")
    public static WebElement drivertextbox;
	
	@FindBy(xpath="(//button[text()='Cancel'])[2]")
	public static WebElement cancelbtn;
	
	@FindBy(xpath="(//input[@name='driver'])[2]")
	public static WebElement updatebtn;
	
	
	
	@FindBy(xpath="//select[@name='master_id']")
	public static WebElement selectmasterdropdown;
	
	@FindBy(xpath="//input[@name='username']")
	public static WebElement usernametextbox1;
	
	@FindBy(xpath="//input[@name='password']")
	public static WebElement passwordtextbox1;
	
	@FindBy(xpath="//input[@name='host']")
	public static WebElement hosttextbox1;
	
	@FindBy(xpath="//input[@name='port']")
	public static WebElement porttextbox1;
	
	@FindBy(xpath="//input[@name='smtpmethod']")
	public static WebElement smtpmethodtextbox1;
	
	@FindBy(xpath="//input[@name='from_email']")
	public static WebElement fromemailtextbox1;
	
	@FindBy(xpath="//input[@name='from_name']")
	public static WebElement fromnametextbox1;
	
	@FindBy(xpath="//input[@name='reply_email']")
	public static WebElement replymailtextbox;
	
	@FindBy(xpath="//input[@name='reply_name']")
	public static WebElement replaynametextbox;
	
	@FindBy(xpath="//input[@name='driver']")
	public static WebElement drivertextbox1;
	
	@FindBy(xpath="//input[@name='driver']")
	public static WebElement createbtn;
	
	@FindBy(xpath="//input[@name='driver']")
	public static  WebElement cancelbtn1;
	
	public SettingsModule() {
		
		PageFactory.initElements(driver, this);
	}
	
	public static void verifySupportSMTPLink() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", settingslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", supportsmtps);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", viewbutton);
		
		Thread.sleep(1000);
		mastertextbox.clear();
		
		Thread.sleep(1000);
		mastertextbox.sendKeys("krishna");
		
		Thread.sleep(1000);
		usernametextbox.clear();
		
		Thread.sleep(1000);
		usernametextbox.sendKeys("krishna123");
		
		Thread.sleep(1000);
		passwordtextbox.clear();
		
		Thread.sleep(1000);
		passwordtextbox.sendKeys("krishna5678");
		
		Thread.sleep(1000);
		hosttextbox.clear();
		
		Thread.sleep(1000);
		hosttextbox.sendKeys("smtp.gmail.com");
		
		Thread.sleep(1000);
		porttextbox.clear();
		
		Thread.sleep(1000);
		porttextbox.sendKeys("687");
		
		Thread.sleep(1000);
		smtpmethodtextbox.clear();
		
		Thread.sleep(1000);
		smtpmethodtextbox.sendKeys("THS");
		
		Thread.sleep(1000);
		fromemailtextbox.clear();
		
		Thread.sleep(1000);
		fromemailtextbox.sendKeys("krishna123@gmail.com");
		
		Thread.sleep(1000);
		fromnametextbox.clear();
		
		Thread.sleep(1000);
		fromnametextbox.sendKeys("krishna97495");
		
		Thread.sleep(1000);
       replyemailtextbox.clear();
       
       Thread.sleep(1000);
       replyemailtextbox.sendKeys("krishna123@gmail.com");
       
       Thread.sleep(1000);
       replaynametextbox.clear();
       
       Thread.sleep(1000);
       replaynametextbox.sendKeys("krishna948");
       
       Thread.sleep(1000);
       drivertextbox.sendKeys("1234455667");
       
       
		
	}
	
	
}
