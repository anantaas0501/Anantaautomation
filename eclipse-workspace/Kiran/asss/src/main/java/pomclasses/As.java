package pomclasses;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class As {

	static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91885\\ananta\\chromedriver.exe");	
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.navigate().to("https://ultimateqa.com/simple-html-elements-for-automation/");
		Thread.sleep(10000);
	boolean b=	d.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isDisplayed();
	System.out.println("checkbox is displayed  " + b);
	d.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	boolean bg=	d.findElement(By.id("et_pb_contact_name_0")).isEnabled();
	System.out.println("search field is enabled   " + bg);
	Thread.sleep(3000);
	Select sc=new Select(d.findElement(By.xpath("//div[@class='et_pb_blurb_description']/select")));
	Thread.sleep(3000);
	sc.selectByVisibleText("Audi");
	Thread.sleep(3000);
	boolean bgs=	d.findElement(By.xpath("//div[@class='et_pb_blurb_description']/select/following::div/preceding::option[contains(text(),'Audi')]")).isSelected();
	System.out.println("value is selected    " + bg);
	
	d.findElement(By.linkText("Go to login page")).click();
	
	d.navigate().back();
	Thread.sleep(3000);
	d.navigate().refresh();
	String a=d.findElement(By.xpath("//h2[text()='Click here to login']")).getText();
	System.out.println(" text value is" + a);
//		d.quit();
		
//		Set<String> handler=d.getWindowHandles();
//		Iterator<String> it=handler.iterator();
//		String parantwindowid=it.next();
//		String childwindowid=	it.next();
//		d.switchTo().window(childwindowid);
//		d.close();
//		d.switchTo().window(parantwindowid);
		
}
}