package Pomclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIM  {
	
	@FindBy(xpath="(//div[@class='oxd-select-text oxd-select-text--active']/div/following::div/i)[1]")
	private WebElement SelectDrodown;
	
	
	@FindBy(xpath="//div[@class='oxd-select-option']/span[contains(text(),'Full-Time Permanent')]")
	private WebElement EmpStatus;
	
	@FindBy(xpath="(//div[@class='oxd-select-text oxd-select-text--active']/div/following::div/i)[3]")
	private WebElement JobTitledropdown;

	@FindBy(xpath="//div[@class='oxd-select-option']/following::div/span[contains(text(),'Software Engineer')]")
	private WebElement JobTitle;
	
	@FindBy(xpath="(//div[@class='oxd-select-text oxd-select-text--active']/div/following::div/i)[4]")
	private WebElement subunit;
	
	@FindBy(xpath="//div[@class='oxd-select-option']/following::div/span[contains(text(),'Engineering')]")
	private WebElement subunitfield;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchbtn;
	
	static WebDriver d;
	
	
	
	
	
	public PIM(WebDriver d) {
		this.d=d;
		PageFactory.initElements(d, this);
		
	}
	
	public void ClickonselectDropdown() throws InterruptedException {
		SelectDrodown.click();
		Thread.sleep(3000);
	}
	public void SelectTypeofEmploymentstatus() {
		EmpStatus.click();
	}
	
	public void ClickonJobTitleDropdown() {
		JobTitledropdown.click();
	}
	public void SelectJobTitle() {
		 JobTitle.click();
	}
	
	public void ClickOnsubunitDropDown() {
		subunit.click();
	}
	
	public void ClickOnsubunitField() {
		subunitfield.click();
	}
	
	public void ClickonSearchBtn() {
		searchbtn.click();
	}
}