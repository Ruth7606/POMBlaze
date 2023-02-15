package testcases;

import org.testng.annotations.Test;

import pages.ConfirmationPage;
import pages.HomePage;
import pages.PurchasePage;
import pages.ReservationPage;
import utility.Base;

public class Bookflight extends Base {
	
	
@Test
public void BookFlight() {	
		
	HomePage homepage =new HomePage(driver);
	ReservationPage reservationpage = new ReservationPage(driver);
	PurchasePage purchasepage=new PurchasePage(driver);
	ConfirmationPage confirmationpage=new ConfirmationPage(driver);
	homepage.chooseDepatureCity();
	homepage.chooseDestinationCity();
	homepage.clickFindFlightButton();
	reservationpage.clickOnChooseThisFlightButton();
	purchasepage.purchaseName();
	purchasepage.yourAddress();
	purchasepage.yourCity();
	purchasepage.yourState();
	purchasepage.yourZipCode();
	purchasepage.chooseCardType1();
	purchasepage.yourCreditCardNumber();
	purchasepage.yourMonth();
	purchasepage.yourYear();
	purchasepage.nameOnCard();
	purchasepage.clickRemember();
	purchasepage.clickPurchaseFlight();
	confirmationpage.IdNumber();
	confirmationpage.flightStatus();
	confirmationpage.flightAmountPaid();
	confirmationpage.flightCardNo();
	confirmationpage.flightExpirationDateSet();


	
}
}
