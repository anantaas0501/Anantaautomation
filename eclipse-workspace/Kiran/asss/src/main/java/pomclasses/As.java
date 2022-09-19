package pomclasses;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class As {

	static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91885\\ananta\\chromedriver.exe");	
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(5000);
		d.findElement(By.xpath("//button[@type='submit']")).click();
}
}