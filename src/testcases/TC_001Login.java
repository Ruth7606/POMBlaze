package testcases;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utility.Base;

public class TC_001Login extends Base{
	@Test
	public void TC_001_Login() {
		log.info("===========================TC_001Login =====================");
		
		HomePage homePage =new HomePage(driver);
		LoginPage loginpage= new LoginPage(driver);
		homePage.clickOnHomeButton();
		loginpage.enterEmailAddress();		
		loginpage.enterPassword();
		loginpage.clickLoginButton();
		
		
	}

	
}
