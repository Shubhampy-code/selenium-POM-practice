package TestCases;

import org.testng.annotations.Test;

import PageClasses.HomePage;
import PageClasses.LoginPage;
import PageClasses.RegesterPage;
import generics.BaseTest;

public class RegesterTest extends BaseTest {
	
	@Test
	public void registertest() {
		HomePage hp = new HomePage(driver);
		hp.getLoginregisterlink().click();
		
		LoginPage lP = new LoginPage(driver);
		lP.getContinuebutton().click();
		
		RegesterPage rp = new RegesterPage(driver);
		rp.PersonalDetail(firstname, lastname, emailregister, telephone);
		rp.yourAddress(company, address1, city, country, state,zipcode);
		rp.loginDetails(loginname, pass);
		
		rp.clickLogin();
		
	
	}

}
