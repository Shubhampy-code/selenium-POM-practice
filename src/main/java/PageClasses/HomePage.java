package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(linkText = "Login or register")
	private WebElement loginregisterlink;
	
	@FindBy(linkText = "Specials")
	private WebElement specials;
	
	@FindBy(linkText = "Account")
	private WebElement accountlink;
	
	@FindBy(linkText = "Cart")
	private WebElement cartlink;
	
	@FindBy(linkText = "Checkout")
	private WebElement checkoutlink;
	
    // Getters Methods for all my Web elements.

	public WebElement getLoginregisterlink() {
		return loginregisterlink;
	}

	public WebElement getSpecials() {
		return specials;
	}

	public WebElement getAccountlink() {
		return accountlink;
	}

	public WebElement getCartlink() {
		return cartlink;
	}

	public WebElement getCheckoutlink() {
		return checkoutlink;
	}
	
	


	


}
