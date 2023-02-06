package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import base.LaunchBrowser;

public class HomePage extends LaunchBrowser{
	//WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver= driver;
	}
	
	By depatureCity =By.xpath("//select[@name='fromPort']");
	public void chooseDepatureCity() {
				new Select(driver.findElement(depatureCity)).selectByIndex(1);
	
	}
	By destinationCity= By.xpath("//select[@name='toPort']");
	public void chooseDestinationCity() {
		new Select(driver.findElement(destinationCity)).selectByIndex(1);


}
	By findFlightButton= By.xpath("//input[@value='Find Flights']");
	public void clickFindFlightButton() {
		driver.findElement(findFlightButton).click();
		


}

}
