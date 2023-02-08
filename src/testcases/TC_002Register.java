package testcases;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegisterPage;
import utility.Base;

public class TC_002Register extends Base {
	@Test
	public void TC_002_Register() {
		HomePage homePage =new HomePage(driver);
		RegisterPage registerpage =new RegisterPage(driver);
		homePage.clickOnHomeButton();
		registerpage.clickRegisterButton();		
		registerpage.EnterYourName();
		registerpage.EnterYourCompanyName();
		registerpage.EnterYourEmailAddress();
		registerpage.EnterYourPassword();
		registerpage.EnterYourConfirmationPassword();
		registerpage.clickRegisterButtonSection();
		
	}

	

}
