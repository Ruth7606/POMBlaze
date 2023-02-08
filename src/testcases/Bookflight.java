package testcases;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ReservationPage;
import utility.Base;

public class Bookflight extends Base {
	
	
@Test
public void BookFlight() {	
	HomePage homepage =new HomePage(driver);
	ReservationPage reservationpage = new ReservationPage(driver);
	homepage.chooseDepatureCity();
	homepage.chooseDestinationCity();
	homepage.clickFindFlightButton();
	reservationpage.clickOnChooseThisFlightButton();
	
}
}
