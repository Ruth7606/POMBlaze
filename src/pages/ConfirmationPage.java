package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Base;

public class ConfirmationPage extends Base {

	public ConfirmationPage(WebDriver driver) {
		this.driver= driver;
	}
	
	By getIdNumber =By.cssSelector("tbody tr:nth-child(1) td:nth-child(2)");
	public String IdNumber() {
		String confirmID = driver.findElement(getIdNumber).getText();
		return confirmID;
				
		}
	By getFlightStatus =By.cssSelector("tbody tr:nth-child(2) td:nth-child(2)");
	public String flightStatus() {
		String flightStatus = driver.findElement(getFlightStatus).getText();
		return flightStatus;
				
		}
	By FlightAmount =By.cssSelector("tbody tr:nth-child(3) td:nth-child(2)");
	public String flightAmountPaid() {
		String flightAmount = driver.findElement(FlightAmount).getText();
		return flightAmount;
				}
	By FlightCardNumber =By.cssSelector("tbody tr:nth-child(4) td:nth-child(2)");
	public String flightCardNo() {
		String flightcardN = driver.findElement(FlightCardNumber).getText();
		return flightcardN;
				
		}
	By FlightExpirationDate =By.cssSelector("tbody tr:nth-child(5) td:nth-child(2)");
	public String flightExpirationDateSet() {
		String flightexpirydate = driver.findElement(FlightExpirationDate).getText();
		return flightexpirydate;
				
		}
		
}
