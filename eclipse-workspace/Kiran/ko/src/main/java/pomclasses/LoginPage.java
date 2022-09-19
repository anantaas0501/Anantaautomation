package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.Testbase;

public class LoginPage extends com.rm.qa.base.Testbase  {




@FindBy(xpath="//input[@name='username']")
private WebElement username;

@FindBy(xpath="//input[@name='password']")
private WebElement password;

@FindBy(xpath="//button[@type='submit']")
private WebElement Loginbtn;

static WebDriver d;

public LoginPage(WebDriver d) {
	this.d=d;
	PageFactory.initElements(d, this);

}

public void enterusername( ) {
	username.sendKeys("Admin");
}
public void enterpassword() {
	password.sendKeys("admin123");
}
public void Clickonloginbtn() {
	Loginbtn.click();
}

}