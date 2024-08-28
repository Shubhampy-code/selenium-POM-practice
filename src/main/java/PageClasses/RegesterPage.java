package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegesterPage {
	
	WebDriver driver;
	Select s;
	
	public RegesterPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "[name=\"firstname\"]")
	private WebElement firstname;
	
	@FindBy(css = "[name=\"lastname\"]")
	private WebElement lastname;
	
	@FindBy(css = "[id=\"AccountFrm_email\"]")
	private WebElement emailregister;
	
	@FindBy(css = "[name=\"telephone\"]")
	private WebElement telephone;
	
	@FindBy(css = "[name=\"fax\"]")
	private WebElement faxElement;
	
	@FindBy(name = "company")
	private WebElement company;
	
	@FindBy(css = "[name=\"address_1\"]")
	private WebElement address1;
	
	@FindBy(css = "[name=\"address_2\"]")
	private WebElement address2;
	
	@FindBy(css = "[name=\"city\"]")
	private WebElement city;
	
	@FindBy(css = "[id=\"AccountFrm_postcode\"]")
	private WebElement zipcode;
	
	@FindBy(css = "[name=\"country_id\"]")
	private WebElement countryDripDown;
	
	@FindBy(css = "[name=\"zone_id\"]")
	private WebElement stateDropDown;
	
	@FindBy(css = "[name=\"loginname\"]")
	private WebElement loginname;
	
	@FindBy(css = "[name=\"password\"]")
	private WebElement password;
	
	@FindBy(css = "[id=\"AccountFrm_confirm\"]")
	private WebElement confirmPassword;
	
	@FindBy(css = "[id=\"AccountFrm_newsletter1\"]")
	private WebElement yesRadioElement;
	
	@FindBy(css = "[id=\"AccountFrm_newsletter0\"]")
	private WebElement noredioElement;
	
	@FindBy(css = "[id=\"AccountFrm_agree\"]")
	private WebElement privacyPolicyCheckBox;
	
	@FindBy(css = "[class=\"btn btn-orange pull-right lock-on-click\"]")
	private WebElement continueClickElement;



	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmailregister() {
		return emailregister;
	}

	public WebElement getTelephone() {
		return telephone;
	}

	public WebElement getFaxElement() {
		return faxElement;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getCountryDripDown() {
		return countryDripDown;
	}

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	public WebElement getLoginname() {
		return loginname;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getYesRadioElement() {
		return yesRadioElement;
	}

	public WebElement getNoredioElement() {
		return noredioElement;
	}

	public WebElement getPrivacyPolicyCheckBox() {
		return privacyPolicyCheckBox;
	}
	
	public WebElement getContinueClickElement() {
		return continueClickElement;
	}
	
	public void PersonalDetail(String firstname, String lastname, String emailregister, String telephone) {
		this.firstname.sendKeys(firstname);
		this.lastname.sendKeys(lastname);
		this.emailregister.sendKeys(emailregister);
		this.telephone.sendKeys(telephone);
	}
	
	public void yourAddress(String company, String address1, String city, String countryDripDown, String stateDropDown, String zipcode) {
		this.company.sendKeys(company);
		this.address1.sendKeys(address1);
		this.city.sendKeys(city);
		this.zipcode.sendKeys(zipcode);
		s = new Select(this.countryDripDown);
		s.selectByVisibleText(countryDripDown);
		s = new Select(this.stateDropDown);
		s.selectByVisibleText(stateDropDown);
	}
	
	public void loginDetails(String loginname, String password){ 
		this.loginname.sendKeys(loginname);
		this.password.sendKeys(password);
		confirmPassword.sendKeys(password);
		noredioElement.click();
		privacyPolicyCheckBox.click();
	}
	
	public void clickLogin() {
		continueClickElement.click();
		
	}

}
