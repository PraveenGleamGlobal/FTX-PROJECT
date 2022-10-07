
package com.ftx.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ftx.qa.base.TestBase;

public class EnquiriesModulePage3 extends TestBase {

	@FindBy(xpath="//span[text()='Enquiries']")
	public static WebElement enquirylink;
	
	@FindBy(xpath="//span[normalize-space()='Invoice']")
	public static WebElement invoicelink;
	
    @FindBy(xpath="//select[@name='DataTables_Table_0_length']")
    public static WebElement dropdowninvoicelink;
    
    @FindBy(xpath="//input[@class='form-control form-control-sm']")
    public static WebElement searchoption;
    
    @FindBy(xpath="//tbody/tr[1]/td[6]/a[1]/i[1]")
    public static WebElement actionbutton;
    
    @FindBy(xpath="//select[@name='currency_id']")
    public static WebElement currencychoosing;
    
    @FindBy(xpath="//select[@id='item_id']")
    public static WebElement selectproducts;
    
    @FindBy(xpath="//tbody/tr[1]/td[3]/div[1]/span[4]/button[1]")
    public static WebElement addbutton;
    
    @FindBy(xpath="//tbody/tr[1]/td[3]/div[1]/span[4]/button[1]")
    public static WebElement addbutton2;
    
    @FindBy(xpath="//select[@class='form-control inputTax inputTax1']")
    public static WebElement dropdownnotax;
    
    @FindBy(xpath="//select[@class='form-control inputTax inputTax2']")
    public static WebElement dropdownnotax2;
    
    @FindBy(xpath="//input[@placeholder='Enter Amount']")
    public static WebElement enteramount;
    
    @FindBy(xpath="//button[normalize-space()='Apply']")
    public static WebElement applybutton;
    
    
    
    
    @FindBy(xpath="//span[normalize-space()='Signed']")
    public static WebElement signedlink;
    
    @FindBy(xpath="//select[@name='DataTables_Table_0_length']")
    public static WebElement dropdownsigned;
    
    @FindBy(xpath="//input[@class='form-control form-control-sm']")
    public static WebElement searchoption1;
    
    @FindBy(xpath="//a[@title='View Enquiry']")
    public static WebElement actionbutton2;
    
    @FindBy(xpath="//a[@id='generate-inv-tab4']")
    public static WebElement generateinvoice;
    
    @FindBy(xpath="//a[@type='button']")
    public static WebElement downloadinvoice;
    
    @FindBy(xpath="//input[@class='form-control trans_id']")
    public static WebElement transactionid;
    
    @FindBy(xpath="//input[@type='file']")
    public static WebElement proofupload;
    
    @FindBy(xpath="//button[@type='submit']")
    public static WebElement submitbutton;
    
    @FindBy(name = "invoicepdf")
    public static WebElement downloadftx;
    
    @FindBy(xpath="//li[@class='breadcrumb-item']//a[1]")
    public static WebElement dashboardlink;
    
    
    
    
    
    
    
    @FindBy(xpath="//span[normalize-space()='Request Transfer']")
    public static WebElement reqtransfer;
    
    @FindBy(xpath="//input[@class='form-control search_enq_input']")
    public static WebElement searchoption2;
    
    @FindBy(xpath="//button[@type='button']")
    public static WebElement searchbutton;
    
    @FindBy(xpath="//button[normalize-space()='Refresh']")
    public static WebElement refreshbutton;
    
    
    @FindBy(xpath="//span[normalize-space()='Transfer List']")
    public static WebElement transferlist;
    
    @FindBy(xpath="//a[@id='home-tab']")
    public static WebElement myreq;
    
    public EnquiriesModulePage3() {
    	
    	PageFactory.initElements(driver, this);
    }
    
    public static void verifyInvoiceModule() throws InterruptedException {
    	
    	Thread.sleep(1000);
    	
    	JavascriptExecutor executor= (JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click();", enquirylink);
    	
    	Thread.sleep(1000);
    	executor.executeScript("arguments[0].click();", invoicelink);
    	
    	Thread.sleep(1000);
    	Select select= new Select(dropdowninvoicelink);
    	select.selectByVisibleText("10");
    	
    	Thread.sleep(1000);
    	select.selectByVisibleText("25");
    	
    	Thread.sleep(1000);
    	select.selectByVisibleText("50");
    	
    	Thread.sleep(1000);
    	select.selectByVisibleText("100");
    	
    	Thread.sleep(1000);
    	searchoption.sendKeys("Hirthik");
    	
    	Thread.sleep(1000);
    	searchoption.clear();
    	
    	String oldwindow= driver.getWindowHandle();
    	
    	Thread.sleep(1000);
    	executor.executeScript("arguments[0].click();", actionbutton);
    	
    	Set<String> handles= driver.getWindowHandles();
    	
    	for (String newiwndow : handles) {
    		
    		driver.switchTo().window(newiwndow);
			
		}
    	
    	
    	Thread.sleep(1000);
    	Select select2= new Select(currencychoosing);
    	select2.selectByVisibleText("INR");
    	
    	Thread.sleep(1000);
    	select2.selectByVisibleText("EUR");
    	
    	Thread.sleep(1000);
    	Select select3= new Select(selectproducts);
    	select3.selectByValue("1");
    	
    	Thread.sleep(1000);
    	select3.selectByValue("2");
    	
    	Thread.sleep(1000);
    	executor.executeScript("arguments[0].click", addbutton);
    	
    	Thread.sleep(1000);
    	Select select4= new Select(dropdownnotax);
    	select4.selectByValue("1");
    	
    	Thread.sleep(1000);
    	enteramount.sendKeys("50");
    	
    	Thread.sleep(1000);
    	executor.executeScript("arguments[0].click", applybutton);	
    	
    }
    
    
    public static void verifySignedModule() throws InterruptedException, AWTException {
    	
    	Thread.sleep(1000);
    	JavascriptExecutor executor= (JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click();", signedlink);
    	
    	Thread.sleep(1000);
    	Select select= new Select(dropdownsigned);
    	select.selectByVisibleText("10");
    	
    	Thread.sleep(1000);
    	select.selectByVisibleText("25");
    	
    	Thread.sleep(1000);
    	select.selectByVisibleText("50");
    	
    	Thread.sleep(1000);
    	select.selectByVisibleText("100");
    	
    	Thread.sleep(1000);
    	searchoption1.sendKeys("Abhi developer");
    	
    	String oldwindow= driver.getWindowHandle();
    	
    	Thread.sleep(1000);
    	executor.executeScript("arguments[0].click();", actionbutton2);
    	
    	Set<String> handles= driver.getWindowHandles();
        
        for (String newwindow : handles) {
			
        	driver.switchTo().window(newwindow);
		}
        
    	
    	Thread.sleep(1000);
    	transactionid.sendKeys("9677619345");
    	
    	Thread.sleep(1000);
    	executor.executeScript("arguments[0].click();", proofupload);
    	
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
 
  	    Thread.sleep(1000);
  	    executor.executeScript("arguments[0].click();", submitbutton);
  
  	    
  	    String oldwindow2= driver.getWindowHandle();
  	   
  	    Thread.sleep(1000);
    	executor.executeScript("arguments[0].click();", downloadinvoice);
    	
    	Set<String> handles2= driver.getWindowHandles();
    
        for (String newwindow2 : handles2) {
			
        	driver.switchTo().window(newwindow2);
		}
        
        Thread.sleep(1000);
        executor.executeScript("arguments[0].click();", downloadftx);
        
        Thread.sleep(1000);
        driver.navigate().back();
        
        Thread.sleep(1000);
        driver.switchTo().window(oldwindow2);
        
        Thread.sleep(1000);
        executor.executeScript("arguments[0].click();", dashboardlink);
    	
    }
    
    public static void verifyRequestTransfer() throws InterruptedException {
    	
    	Thread.sleep(2000);
    	JavascriptExecutor executor= (JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click();", enquirylink);
    	
    	Thread.sleep(1000);
    	executor.executeScript("arguments[0].click();", reqtransfer);
    	
    	Thread.sleep(1000);
    	searchoption2.sendKeys("praveen");
    	
    	Thread.sleep(1000);
    	executor.executeScript("arguments[0].click();", searchbutton);
    	
    	Thread.sleep(1000);
    	executor.executeScript("arguments[0].click();", refreshbutton);
    	
    	
    }
    
    public static void verifyTransferList() throws InterruptedException {
    	
    	Thread.sleep(1000);
    	JavascriptExecutor executor= (JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click();", transferlist);
    	
    	Thread.sleep(1000);
    	executor.executeScript("arguments[0].click();", myreq);
   
   
    }
}





















