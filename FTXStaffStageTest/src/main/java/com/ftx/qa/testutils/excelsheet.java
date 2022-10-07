package com.ftx.qa.testutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class excelsheet {
	public static WebDriver driver;
	static List<String> userNameList=new ArrayList<String>();
	static List<String> passwordList=new ArrayList<String>();
	
	@DataProvider(name= "logindata")
	public void readexcel() throws IOException {
		FileInputStream excel=new FileInputStream("C:\\Users\\CCM Hardware\\eclipse-workspace\\FTXStaffStageTest\\src\\main\\java\\com\\ftx\\qa\\testdata\\logindata.xlsx");
		
		Workbook workbook=new XSSFWorkbook(excel);
	
		Sheet sheet=workbook.getSheetAt(0);
		
		Iterator<Row> rowiterator=sheet.iterator();
		
		while(rowiterator.hasNext()) {
			Row rowvalue=rowiterator.next();
			Iterator<Cell> columniterator=rowvalue.iterator();
			int i=2;
			while(columniterator.hasNext()) {
				if(i%2==0) {
					userNameList.add(columniterator.next().getStringCellValue());
				}else {
					passwordList.add(columniterator.next().getStringCellValue());
				}
				
		i++;
			}
	
			
		}
		
	}
	
	@Test(priority = 2)
	public void executetest() throws InterruptedException {
		
		for(int i=0;i<userNameList.size();i++) {
			
			login(userNameList.get(i),passwordList.get(i) );
			
		}
	}
	
	@Test(dataProvider = "logindata")
	public void login(String user, String pass) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\CCM Hardware\\Downloads\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://stage.ftxtradingsoftware.com/");
		
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("email"));
		Thread.sleep(1000);
		username.sendKeys(user);
		WebElement password=driver.findElement(By.id("password"));
		Thread.sleep(1000);
		password.sendKeys(pass);
		WebElement loginbtn=driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(1000);
		loginbtn.click();
		
		Thread.sleep(2000);
		driver.quit();
	}
//	public static void main(String[] args) throws IOException, InterruptedException {
//		excelsheet usingpoi=new excelsheet();
//		usingpoi.readexcel();
//		System.out.println("username list"+userNameList );
//		System.out.println("password list"+passwordList );
//		usingpoi.executetest();
//	}

}
