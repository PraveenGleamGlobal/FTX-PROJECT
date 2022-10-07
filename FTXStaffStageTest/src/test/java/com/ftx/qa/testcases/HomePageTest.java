package com.ftx.qa.testcases;


	import java.time.Duration;

    import org.testng.annotations.AfterClass;
    import org.testng.annotations.AfterMethod;
    import org.testng.annotations.BeforeClass;
    import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.ftx.qa.base.TestBase;
    import com.ftx.qa.pages.HomePage;
    import com.ftx.qa.pages.LoginPage;

	public class HomePageTest extends TestBase{
		static LoginPage loginPages;
		
		
		public HomePageTest() {
			super();
		}

		@BeforeClass
		public void setup() {
			intialization();
			loginPages = new LoginPage();
	}
		
		
		@Test(priority = 1)
		public static void loginTest() {
			loginPages.login(prop.getProperty("username"), prop.getProperty("password"));
			
}
		
		@Test(priority = 2)
		public static void executeHomePage() throws InterruptedException {
			
		
			HomePage homepage= new HomePage();
			homepage.verifyHomePage();
			
			homepage.verifyHomePage2();
			
			homepage.verifyHomePage3();
			
			
		}
		
		@AfterClass
		public void tearDown() throws InterruptedException {
			
			Thread.sleep(1000);
			driver.quit();
		}
}
