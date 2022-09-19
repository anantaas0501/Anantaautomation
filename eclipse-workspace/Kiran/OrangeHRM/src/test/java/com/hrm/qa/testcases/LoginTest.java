package com.hrm.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.pages.LoginPage;
import com.hrm.qa.testbase.Testbase;

public class LoginTest extends Testbase {

	LoginPage log;
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		log=new LoginPage(d);
	}
	
	@Test
	public void VerifyLoginTest() throws InterruptedException {
		log=new LoginPage(d);
		log.enterusername();
		Thread.sleep(5000);
		log.enterpassword();
		Thread.sleep(5000);
		log.Clickonloginbtn();
	}
	@AfterMethod
	public void teardown() {
		d.quit();
	}
}
