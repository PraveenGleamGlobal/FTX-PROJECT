package com.ftx.qa.testcases;



	
	import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	import com.ftx.qa.base.TestBase;
	import com.ftx.qa.pages.LoginPage;
import com.ftx.qa.testutils.TestUtils;

	public class LoginPageTest extends TestBase{
		LoginPage loginPages;
		
		
		public LoginPageTest() {
			super();
		}

		@BeforeClass
		public void setup() {
			intialization();
			loginPages = new LoginPage();
	}
		//@Test(priority = 1)
		//public void loginPageTitleTest() {
			//loginPages.validateLoginPageTitle();
			
		//}
		
		
		public void loginTest() {
			loginPages.login(prop.getProperty("username"), prop.getProperty("password"));
			
}
		public static String sheetName ="logindata";

	    @DataProvider
	    public Object[][] getFTXTestData() throws InvalidFormatException {
	        Object data[][] = TestUtils.getTestData(sheetName);
	        return data;
	    }

	    @Test(dataProvider = "getFTXTestData")
	    public static void botform4(String email, String password) throws InterruptedException {
	        System.out.println(sheetName);
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        driver.findElement(By.id("email")).sendKeys(email);
	        Thread.sleep(2000);
	        driver.findElement(By.id("password")).sendKeys(password);
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
	        driver.findElement(By.id("email")).clear();
	        driver.findElement(By.id("password")).clear();
	    }
	    
	    
	    @Test(dataProvider = "getFTXTestData")
	    public static void loginpage() {
	    	
	    	   System.out.println(sheetName);
	    	   driver.manage().window().maximize();
	    	   
	    	   LoginPage lpage= new LoginPage();
	    	   lpage.login(sheetName, sheetName);
	    	   
	    }
	        
	        
	       
	       // driver.quit();
	        
	    }
//		@AfterClass
//		public void tearDown() throws InterruptedException {
//			
//			Thread.sleep(2000);
//			driver.quit();
//		}
		
		
	
	
