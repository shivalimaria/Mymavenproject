package pompackage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseHRMclass;
public class Pomlogin extends BaseHRMclass{
	@FindBy(css="#app > div.orangehrm-login-layout > div > "
			+ "div.orangehrm-login-container > div > div.orangehrm-login-slot >"
			+ " div.orangehrm-login-form > form > "
			+ "div:nth-child(2) > div > div:nth-child(2) > input")
	WebElement username;
	@FindBy(css="#app > div.orangehrm-login-layout > div > div.orangehrm-login-container >"
			+ " div > div.orangehrm-login-slot >"
			+ " div.orangehrm-login-form > form > div:nth-child(2) > div > div:nth-child(2) > input")
	WebElement password;
	@FindBy(css="#app > div.orangehrm-login-layout > div > div.orangehrm-login-container"
			+ " > div > div.orangehrm-login-slot > div.orangehrm-login-form >"
			+ " form > div.oxd-form-actions.orangehrm-login-action > button")
	WebElement login;
public Pomlogin () {
	PageFactory.initElements(driver,this);
}
public void typeusername(String uname) {
	username.sendKeys(uname);}
	public void typepassword(String pass) {
		password.sendKeys(pass);}
	
	public void clickbutton() {
		login.click();}
	
	public String verify() {
		return driver.getTitle();
	}
	}

	


