package com.ftx.qa.testcases;

import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.ftx.qa.base.TestBase;
import com.ftx.qa.pages.LoginPage;
import com.ftx.qa.pages.SenderDomainModule;


public class SenderDomainModuleTest extends TestBase{
	LoginPage loginpage;
	SenderDomainModule senderDomain;
public SenderDomainModuleTest() {
	super();
}
@BeforeClass
public void setup() {
	initialization();
	loginpage=new LoginPage();
	senderDomain=new SenderDomainModule();
}
@Test(priority=1)
public void logintest() {
	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
}
@Test(priority=2)
public void verifySenderDomainpage() throws InterruptedException{

	senderDomain.verifySenderDomain();
}
@AfterClass
public void teardown() throws InterruptedException {
	
	Thread.sleep(1000);
	driver.close();
}

}
