package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Base;


public class ReservationPage extends Base{
	
	public ReservationPage(WebDriver driver) {
		this.driver= driver;
	}

	
	By chooseThisFlightButton =By.xpath("//tbody/tr[1]/td[1]/input[1]");
	public void clickOnChooseThisFlightButton() {
		driver.findElement(chooseThisFlightButton).click();
		}
	By getFlightNumber =By.xpath("//td[normalize-space()='43']");
	public String flightNumber() {
		String flightID = driver.findElement(getFlightNumber).getText();
		return flightID;
				
		}
}