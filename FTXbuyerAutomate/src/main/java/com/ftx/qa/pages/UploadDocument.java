package com.ftx.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.eclipse.aether.util.graph.transformer.JavaScopeSelector;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ftx.qa.base.TestBase;

public class UploadDocument extends TestBase {

	
	@FindBy(xpath="//span[text()='Upload Documents']")
	public static WebElement uploaddocumets;
	
	@FindBy(xpath="//div[text()='Driving License']")
	public static WebElement voterid;
	
	@FindBy(xpath="//div[text()='Driving License']")
	public static WebElement drivinglicense;
	
	@FindBy(xpath="//select[@name='proof_title']")
	public static WebElement selectoption;
	
	@FindBy(xpath="//input[@id='imageUpload']")
	public static WebElement Uploadbutton;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement uploadbutton2;
	
	public UploadDocument() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	public static void verfifyUploadDocumets() {
		
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", uploaddocumets);
		
	}
	

	public static void ChooseImage1() throws InterruptedException, AWTException, IOException  {
		
		
		Thread.sleep(2000);
        Select select= new Select(selectoption);
		select.selectByVisibleText("Driving License");
		
		Thread.sleep(2000);
		Actions actions=new Actions(driver);
		actions.moveToElement(Uploadbutton);
		actions.click().build().perform();
		
		
	
		Thread.sleep(2000);
      StringSelection ss = new StringSelection("C:\\Users\\CCM Hardware\\Pictures\\Saved Pictures\\upload1.jpg");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	    
	    

	    Robot robot = new Robot();	   
	    robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    
	    Thread.sleep(2000);
	    JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", uploadbutton2);
		
	    
	    
	    
	}  
	    public static void chooseImage2() throws InterruptedException, AWTException, IOException {
	    	
	    	Thread.sleep(2000);
	    	Select select= new Select(selectoption);
	    	
	    	
	    	select.selectByVisibleText("Voter ID");
	    	
	    	Thread.sleep(2000);
			Actions actions=new Actions(driver);
			actions.moveToElement(Uploadbutton);
			actions.click().build().perform();
	    	
	    	

			Thread.sleep(2000);
	      StringSelection ss = new StringSelection("C:\\Users\\CCM Hardware\\Videos\\Praveen\\upload2.jpg");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		    
		    

		    Robot robot = new Robot();	   
		    robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyRelease(KeyEvent.VK_V);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
		    
		    Thread.sleep(2000);
		    JavascriptExecutor executor= (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", uploadbutton2);
	    	
	    	
	    }
	}


