package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Base;

public class LoginPage extends Base{
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}	
	
	By emailAddress =By.xpath("//input[@id='email']");
	public void enterEmailAddress() {
		driver.findElement(emailAddress).sendKeys("kalu@gmail.com");		
	}
	By  passwordSet=By.xpath("//input[@id='password']");
	public void enterPassword() {
		driver.findElement(passwordSet).sendKeys("1234");;		
	}
	By  rememberMeCheckBox=By.xpath("//input[@name='remember']");
	public void clickRememberMe() {
		driver.findElement(rememberMeCheckBox).click();	
	}
	By  loginButton=By.xpath("//button[@type='submit']");
	public void clickLoginButton() {
		driver.findElement(loginButton).click();	
	}
}
