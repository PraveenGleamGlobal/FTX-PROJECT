package com.ftx.qa.pages;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ftx.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//input[@type='search']")
	public static WebElement searchoption;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	public static WebElement dashboardlink;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[1]/div/div/div/div[1]/form/div[2]/div[3]/a")
	public static WebElement ringinglink;
	
	@FindBy(id="fullscreen-button")
	public static WebElement fullscreenoption;
	
	@FindBy(xpath="//a[@class='nav-link icon updateQuestionViewStatus cursor-pointer']")
	public static WebElement  notificationoption;
	
	@FindBy(xpath="//div[@class='dropdown']//a)[2]")
	public static WebElement lockoption;
	
	@FindBy(xpath="(//div[@class='dropdown']//a)[3]")
	public static WebElement knowledgelink;
	
	@FindBy(xpath="//a[@class='nav-link icon siderbar-link']")
	public static WebElement profileclick;
	
	@FindBy(xpath="//a[@href='#tab2']")
	public static WebElement activitylink;
	
	@FindBy(xpath="//a[@href='https://stage.ftxtradingsoftware.com/logout']//i)[2]")
	public static WebElement signout;
	
	
	
	
	@FindBy(xpath="//a[@data-toggle='dropdown']")
	public static WebElement enquirieslink;
	
	@FindBy(xpath="//div[@class='col-2']//a")
	public static WebElement newlink;
	
	
	@FindBy(xpath="//div[@class='col-2']/child::a[2]")
	public static WebElement assignedlink;
	
	@FindBy(xpath="//div[@class='col-2']/child::a[3]")
	public static WebElement ringing;
	
	@FindBy(xpath="//div[@class='col-2']/child::a[4]")
	public static WebElement postponed;
	
	@FindBy(xpath="//a[contains(text(),'Not Interested')]")
	public static WebElement notinterested;
	
	@FindBy(xpath="//ul[@class='nav navbar-nav horizontal-nav header-nav']//div[2]//a[1]")
	public static WebElement todayringing;
	
	@FindBy(xpath="//div[@class='page is-expanded']//div[2]//a[2]")
	public static WebElement todaypostponed;
	
	@FindBy(xpath="//a[contains(text(),'Invoice')]")
	public static WebElement invoice;
	
	@FindBy(xpath="//a[contains(text(),'Signed')]")
	public static WebElement signed;
	
	@FindBy(xpath="//a[contains(text(),'Request Transfer')]")
	public static WebElement requesttransafer;
	
	@FindBy(xpath="//a[contains(text(),'Transfer List')]")
	public static WebElement transferlist;
	
	@FindBy(xpath="//a[normalize-space()='My Sales']")
	public static WebElement mysaleslink;
	
	@FindBy(xpath="//a[normalize-space()='Home']")
	public static WebElement homebacklink;
	
	@FindBy(xpath="//a[@id='profile-tab']")
	public static WebElement todaylink;
	
	@FindBy(xpath="//a[@id='home-tab']")
	public static WebElement weeklink;
	
	@FindBy(xpath="//input[@placeholder='Search for...']")
	public static WebElement searchoption2;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public static void verifyHomePage() throws InterruptedException {
		
		Thread.sleep(1000);
	    searchoption.sendKeys("a");
		
		Thread.sleep(1000);
		searchoption.clear();
		
//	    Thread.sleep(1000);
//		JavascriptExecutor executor= (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", ringinglink);
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", dashboardlink);
	
		Thread.sleep(1000);
		driver.navigate().refresh();

//		Thread.sleep(1000);
//		JavascriptExecutor executor2= (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", fullscreenoption);
//		
//		Thread.sleep(1000);
//		executor.executeScript("arguments[0].click();", fullscreenoption);
//		
		
		executor.executeScript("arguments[0].click();", notificationoption);
		
		String oldwindow=driver.getWindowHandle();
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", knowledgelink);
		
		Set<String> handles=driver.getWindowHandles();
		
		for (String newWindow : handles) {
			
			driver.switchTo().window(newWindow);
		}
		
		Thread.sleep(2000);
		driver.close();
		
		Thread.sleep(1000);
		driver.switchTo().window(oldwindow);
		
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", profileclick);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", activitylink);
		
	}
	
	public static void verifyHomePage2() throws InterruptedException {
		
		Thread.sleep(2000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", enquirieslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", newlink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", enquirieslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", assignedlink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", enquirieslink);
	
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", ringing);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", enquirieslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", postponed);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", enquirieslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", notinterested);
		
	
}
	public static void verifyHomePage3() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", enquirieslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", todayringing);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", enquirieslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", todaypostponed);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", enquirieslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", invoice);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", enquirieslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", signed);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", enquirieslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", requesttransafer);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", enquirieslink);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", transferlist);
		
		
	}
	
}





















