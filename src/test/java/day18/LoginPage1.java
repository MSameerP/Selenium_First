package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	WebDriver driver;
	
	//constructor
	LoginPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locator
	@FindBy(xpath="//input[@placeholder='username']") WebElement txt_username_loc;
	@FindBy(xpath="//input[@placeholder='password']") WebElement txt_password_loc;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement btn_login_loc;
//	@FindBy(how = How.XPATH, using="//input[@placeholder='username']") WebElement txt1_username_loc;

	
	//action Methods
	public void setUserName(String user) {
		txt_username_loc.sendKeys(user);
	}
	
	public void setPassword(String pass) {
		txt_password_loc.sendKeys(pass);
	}
	
	public void clickLogin() {
		btn_login_loc.click();
	}

}
