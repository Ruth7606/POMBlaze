package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.LaunchBrowser;


public class ReservationPage extends LaunchBrowser{
	WebDriver driver;
	public ReservationPage(WebDriver driver) {
		this.driver= driver;
	}

	By chooseThisFlightButton =By.xpath("//tbody/tr[1]/td[1]/input[1]");
	public void clickOnChooseThisFlightButton() {
		driver.findElement(chooseThisFlightButton).click();
		}
	By getFlightNumber =By.xpath("//th[normalize-space()='Flight #']");
	public void flightNumber() {
		driver.findElement(getFlightNumber).getText();
		}
}