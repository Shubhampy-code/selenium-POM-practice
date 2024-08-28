package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css = "[name=\"loginname\"]")
	private WebElement loginName;
	
	@FindBy(css = "[name=\"password\"]")
	private WebElement password;

	@FindBy(css = "[title=\"Login\"]")
	private WebElement loginbutton;
	
	@FindBy(linkText = "Forgot your password?")
	private WebElement forgetpassword;
	
	@FindBy(linkText = "Forgot your login?")
	private WebElement forgotlogin;
	
	@FindBy(css = "[title=\"Continue\"]")
	private WebElement continuebutton;

	
	// Getters Methods for all my Web elements.
	
	public WebElement getLoginName() {
		return loginName;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginbutton() {
		return loginbutton;
	}


	public WebElement getForgetpassword() {
		return forgetpassword;
	}


	public WebElement getForgotlogin() {
		return forgotlogin;
	}


	public WebElement getContinuebutton() {
		return continuebutton;
	}
	
	//buisness method
	public void login(String emailid, String password) {
		
		this.loginName.sendKeys(emailid);
		this.password.sendKeys(password);
		loginbutton.click();
	}
}
