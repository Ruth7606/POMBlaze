package testcases;

import org.testng.annotations.Test;

import base.LaunchBrowser;
import pages.HomePage;
import pages.ReservationPage;

public class Bookflight extends LaunchBrowser {
	
	
@Test
public void atTest() {	
	HomePage homepage =new HomePage(driver);
	ReservationPage reservationpage = new ReservationPage(driver);
	homepage.chooseDepatureCity();
	homepage.chooseDestinationCity();
	homepage.clickFindFlightButton();
	
}
}
