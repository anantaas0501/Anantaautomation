package hrmTestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import Pomclasses.LoginPage;

public class Logintest  extends LoginPage{
  WebDriver d;
	LoginPage log;
	public Logintest(WebDriver d) {
		super(d);
		
	}
	@Test
	public void VerifyLoginTest() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91885\\ananta\\msedgedriver.exe");
		 d = new EdgeDriver();
		 LoginPage log=new LoginPage(d);
			d.manage().deleteAllCookies();
			d.manage().window().maximize();
			d.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		log.enterusername();
		log.enterpassword();
		log.Clickonloginbtn();
			
		
	}
	

	
}
