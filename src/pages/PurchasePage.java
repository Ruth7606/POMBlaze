package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utility.Base;

public class PurchasePage extends Base {
	
	public PurchasePage(WebDriver driver) {
		this.driver= driver;
	}
	By Name= By.id("inputName");
	public void purchaseName() {
		driver.findElement(Name).sendKeys("Kaluki");;		
}
	By Address= By.xpath("//input[@id='address']");
	public void yourAddress() {
		driver.findElement(Address).sendKeys("90200");;		
}
	By City= By.xpath("//input[@id='city']");
	public void yourCity() {
		driver.findElement(City).sendKeys("nai");;		
}
	By State= By.xpath("//input[@id='state']");
	public void yourState() {
		driver.findElement(State).sendKeys("I dont know");;		
}
	By Zipcode= By.xpath("//input[@id='zipCode']");
	public void yourZipCode() {
		driver.findElement(Zipcode).sendKeys("3494302");;		
}
	By cadeType =By.xpath("//select[@id='cardType']");
	public void chooseCardType1() {
				new Select(driver.findElement(cadeType)).selectByIndex(0);
	
	}
	By creditCardNumber= By.xpath("//input[@id='creditCardNumber']");
	public void yourCreditCardNumber() {
		driver.findElement(creditCardNumber).sendKeys("56728394567654");;		
}
	By month= By.xpath("//input[@id='creditCardMonth']");
	public void yourMonth() {
		driver.findElement(month).sendKeys("09");;		
}
	By year= By.xpath("//input[@id='creditCardYear']");
	public void yourYear() {
		driver.findElement(year).sendKeys("1975");;		
}
	
	By cardName= By.xpath("//input[@id='nameOnCard']");
	public void nameOnCard() {
		driver.findElement(cardName).sendKeys("KalukiMwanga");;		
}

	By remember= By.xpath("//input[@id='rememberMe']");
	public void clickRemember() {
		driver.findElement(remember).click();		
}
	By purchaseFlight= By.xpath("//input[@value='Purchase Flight']");
	public void clickPurchaseFlight() {
		driver.findElement(purchaseFlight).click();		
}
	
	

}
