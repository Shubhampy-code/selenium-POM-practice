package TestCases;

import org.testng.annotations.Test;

import PageClasses.HomePage;
import PageClasses.LoginPage;
import PageClasses.RegesterPage;
import generics.BaseTest;

public class FinalTest extends BaseTest {
	
	LoginPage lP;
	HomePage hp;
	RegesterPage rp;
	
	@Test
	public void logintest() {
		lP = new LoginPage(driver);
		hp = new HomePage(driver);
		hp.getLoginregisterlink().click();
		lP.login(email_ID, pass);

	}
	
	@Test
	public void registertest() {
		hp = new HomePage(driver);
		hp.getLoginregisterlink().click();
		
		lP = new LoginPage(driver);
		lP.getContinuebutton().click();
		
		rp = new RegesterPage(driver);
		rp.PersonalDetail(firstname, lastname, emailregister, telephone);
		rp.yourAddress(company, address1, city, country, state,zipcode);
		rp.loginDetails(loginname, pass);
		
		rp.clickLogin();
		
	
	}

}
