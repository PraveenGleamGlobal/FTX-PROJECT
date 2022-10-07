package com.ftx.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ftx.qa.base.TestBase;

public class TemplatesModule extends TestBase {

	
	@FindBy(xpath="(//a[@href='javascript:void()']//span)[3]")
	public static WebElement templateslink;
	
	@FindBy(xpath="//a[@href='https://broadcasting.ftxtradingsoftware.com/broadcasting/template/mail/index']")
	public static WebElement maillink;
	
	@FindBy(xpath="//input[@name='mail']")
	public static WebElement entermail1;
	
	@FindBy(xpath="(//input[@name='mail'])[2]")
	public static WebElement entermail2;
	
	@FindBy(xpath="(//input[@name='mail'])[3]")
	public static WebElement entermail3;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement sendbutton1;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	public static WebElement sendbutton2;
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	public static WebElement sendbutton3;
	
	
	
	
	@FindBy(xpath="//button[text()='Add New']")
	public static WebElement addnewoption;
	
	@FindBy(id="name")
	public static WebElement eventname;
	
	@FindBy(id="keyword")
	
	public static WebElement keyword;
	
	@FindBy(id="subject")
	public static WebElement subject;
	
	@FindBy(id="tinymce")
	public static WebElement paragraphwrite;
	
	@FindBy(xpath="//div[@class='row']/following-sibling::button[1]")
	public static WebElement savetemplatebutton;
	
	@FindBy(xpath="//li[@class='breadcrumb-item']//a[1]")
	public static WebElement homelink;
	
	
	
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/ul/li[2]/a")
	public static WebElement smslink;
	
	@FindBy(xpath="(//button[@type='button']//i)[2]")
	public static WebElement viewbtn;
	
	@FindBy(xpath="//button[text()='Edit']")
	public static WebElement editoption;
	
	@FindBy(id="name")
	public static WebElement nametextbox;
	
	@FindBy(id="title")
	public static WebElement titletextbox;
	
	@FindBy(id="sender")
	public static WebElement sendertextbox;
	
	@FindBy(xpath="//select[@id='category']")
	public static WebElement selectcategory;
	
	@FindBy(id="message")
	public static WebElement messagetextbox;
	
	@FindBy(id="update_form_template")
	public static WebElement savebtn;
	
	
	
	@FindBy(xpath="//button[text()='Create New Template']")
	public static WebElement createnewtemplate;
	
	@FindBy(xpath="//input[@name='name']")
	public static WebElement entername1;
	
	@FindBy(xpath="//input[@name='title']")
	public static WebElement entertitle1;
	
	@FindBy(xpath="//input[@name='sender']")
	public static WebElement entersender;
	
	@FindBy(xpath="//select[@class='form-control select_cat select2-hidden-accessible']")
	public static WebElement selectcategory1;
	
	@FindBy(xpath="//select[@class='form-control select_keyword select2-hidden-accessible']")
	public static WebElement selectkeywords;
	
	@FindBy(id="comment")
	public static WebElement messagetextbox1;
	
	@FindBy(id="save_template")
	public static WebElement savebtn1;
	
	@FindBy(xpath="//input[@placeholder='Enter Number']")
	public static WebElement enternumber;
	
	public TemplatesModule() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public static void verifyMailSubModule() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", templateslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", maillink);
		
//        entermail1.sendKeys("vijayalakshmi19945@gmail.com");
//		
//		executor.executeScript("arguments[0].click();", sendbutton1);
//	
//		entermail2.sendKeys("vijayalakshmi19945@gmail.com");
//		
//		executor.executeScript("arguments[0].click();", sendbutton2);
//		
//		entermail3.sendKeys("vijayalakshmi19945@gmail.com");
//		
//		executor.executeScript("arguments[0].click();", sendbutton3);
		
		
	}
	
	public static void verifyAddNew() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", addnewoption);
		
		Thread.sleep(1000);
		eventname.sendKeys("praveen");
		
		Thread.sleep(1000);
		keyword.sendKeys("123456");
		
		Thread.sleep(1000);
		subject.sendKeys("praveen");
		
		driver.switchTo().frame(0);
		
		Thread.sleep(1000);
		paragraphwrite.sendKeys("This is the purpose to write the template");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].scrollIntoView(true)",savetemplatebutton);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", savetemplatebutton);
		
		
	}
	
	public static void verifySmsModule() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", homelink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", templateslink);
	
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", smslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", viewbtn);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", editoption);
		
		Thread.sleep(1000);
		nametextbox.clear();
		
		Thread.sleep(1000);
		nametextbox.sendKeys("praveen");
		
		Thread.sleep(1000);
		titletextbox.clear();
		
		Thread.sleep(1000);
		titletextbox.sendKeys("testing01");
		
		Thread.sleep(1000);
		sendertextbox.clear();
		
		Thread.sleep(1000);
		sendertextbox.sendKeys("testing111");
		
		Thread.sleep(1000);
		Select select= new Select(selectcategory);
		select.selectByVisibleText("Client Notifications");
		
		Thread.sleep(1000);
		select.selectByVisibleText("Promotoins");
		
		Thread.sleep(1000);
		messagetextbox.clear();
		
		Thread.sleep(1000);
		messagetextbox.sendKeys("welcome all");
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", savebtn);
		
	}
	
	public static void verifyCreateNewTemplate() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", createnewtemplate);
		
		Thread.sleep(1000);
		entername1.sendKeys("praveen");
		
		Thread.sleep(1000);
		entertitle1.sendKeys("Ftx trading");
		
		Thread.sleep(1000);
		entersender.sendKeys("praveen kumar");
		
		Thread.sleep(1000);
		Select select= new Select(selectcategory1);
		select.selectByVisibleText("Client Notifications");
		
		Thread.sleep(1000);
		select.selectByVisibleText("Promotoins");
		
		Thread.sleep(1000);
		Select select2= new Select(selectkeywords);
		select2.selectByVisibleText("Client Name");
		
		Thread.sleep(1000);
		select2.selectByVisibleText("Staff Name");
		
		Thread.sleep(1000);
		select2.selectByVisibleText("Website");
		
		Thread.sleep(1000);
		select2.selectByVisibleText("Company Number");
		
		Thread.sleep(1000);
		select2.selectByVisibleText("Company Name");
		
		Thread.sleep(1000);
		select2.selectByVisibleText("Extension");
		
		Thread.sleep(1000);
		messagetextbox1.sendKeys("This is to write the messages");


		Thread.sleep(1000);
		enternumber.sendKeys("9677619447");
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", savebtn1);
		
		
		
	}
	
}






















