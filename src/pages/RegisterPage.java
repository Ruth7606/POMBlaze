package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Base;

public class RegisterPage extends Base {
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
	}	
	By registerButton =By.xpath("//a[normalize-space()='Register']");
	public void clickRegisterButton() {
		driver.findElement(registerButton).click();;		
	}
	By enterName =By.xpath("//input[@id='name']");
	public void EnterYourName() {
		driver.findElement(enterName).sendKeys("Kaluki");		
	}
	By enterCompanyName =By.xpath("//input[@id='company']");
	public void EnterYourCompanyName() {
		driver.findElement(enterCompanyName).sendKeys("Tezza");		
	}
	By enterEmail =By.xpath("//input[@id='email']");
	public void EnterYourEmailAddress() {
		driver.findElement(enterEmail).sendKeys("Kalu@gmail.com");		
	}
	By enterPassword =By.xpath("//input[@id='password']");
	public void EnterYourPassword() {
		driver.findElement(enterPassword).sendKeys("1234");		
	}
	By enterConfirmPassword =By.xpath("//input[@id='password-confirm']");
	public void EnterYourConfirmationPassword() {
		driver.findElement(enterConfirmPassword).sendKeys("1234");		
	}

	By registerButtonSec =By.xpath("//button[@type='submit']");
	public void clickRegisterButtonSection() {
		driver.findElement(registerButtonSec).click();;		
	}

}
