package testcases;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ReservationPage;
import utility.Base;

public class TC_003Reservation extends Base{
	@Test
	public void ReserveFlight() {	
		HomePage homepage =new HomePage(driver);
		ReservationPage reservationpage = new ReservationPage(driver);
		homepage.chooseDepatureCity();
		homepage.chooseDestinationCity();
		homepage.clickFindFlightButton();
		reservationpage.clickOnChooseThisFlightButton();
		//reservationpage.flightNumber();

}
}
