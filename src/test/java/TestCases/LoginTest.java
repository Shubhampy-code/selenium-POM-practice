package TestCases;

import org.testng.annotations.Test;

import PageClasses.HomePage;
import PageClasses.LoginPage;
import generics.BaseTest;

public class LoginTest extends BaseTest{
	
	
	@Test
	public void logintest() {
		LoginPage lP = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		hp.getLoginregisterlink().click();
		lP.login(email_ID, pass);

	}

}
