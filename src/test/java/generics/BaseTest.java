package generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	//We have to create before class and after class
	
	protected WebDriver driver;
	String url;
	public	String email_ID;
	public	String pass;
	public String firstname;
	public String lastname;
	public String emailregister;
	public String telephone;
	public String company;
	public String address1;
	public String city;
	public String zipcode;
	public String country;
	public String state;
	public String loginname;
	
	@BeforeClass
	public void setup() throws IOException {
		
		driver = new ChromeDriver();
		
		// create a proper object for atteching data from config.properties
		Properties pr =new Properties();
		
		//Given the path using fileinutstream
		FileInputStream fis = new FileInputStream("C:\\Users\\Shubham Shrivastava\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\NOP_POM\\src\\test\\resources\\config.properties");
		
		//load file in it
		pr.load(fis);
		
		url = pr.getProperty("url");
		email_ID = pr.getProperty("emailid");
		pass = pr.getProperty("password");
		firstname = pr.getProperty("firstname");
		lastname = pr.getProperty("lastname");
		emailregister = pr.getProperty("emailregister");
		telephone = pr.getProperty("telephone");
		company = pr.getProperty("company");
		address1 = pr.getProperty("address1");
		city = pr.getProperty("city");
		zipcode = pr.getProperty("zipcode");
		country = pr.getProperty("country");
		state = pr.getProperty("state");
		loginname = pr.getProperty("loginname");
		
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
