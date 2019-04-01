package acn.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import acn.pageobjects.MercuryBookFlightPage;
import acn.pageobjects.MercuryFlightConfirmationPage;
import acn.pageobjects.MercuryReservationPage;
import acn.pageobjects.MercurySelectFlightPage;
import acn.pageobjects.MercuryWelcomePage;
import common.BaseTest;

public class MercuryToursDebuggingTest extends BaseTest {

	final public String xcelSheetName = "TestData";
	final public String xcelFilePath = "C:\\Workspace\\SeleniumProject2\\src\\acn\\testdata\\ReservationTestData.xlsx";
	
	@Test
	public void MercuryTours() throws Exception{		
		
		startTest(xcelFilePath, xcelSheetName);
		
		MercuryWelcomePage actionsMercuryWelcome = new MercuryWelcomePage(driver);
		
		takescreenshot();
		assertElementPresentInPage("//img[contains(@src,'featured_destination.gif')]", "xpath");
		actionsMercuryWelcome.enterUserName(2);
		actionsMercuryWelcome.enterPassword(3);
		takescreenshot();
		actionsMercuryWelcome.clickSignInButton();
		Thread.sleep(2000);
		assertElementPresentInPage("//img[contains(@src,'mast_flightfinder.gif')]", "xpath");
		takescreenshot();
		
		MercuryReservationPage actionsMercuryReservation = new MercuryReservationPage(driver);
		
		//assertTextPresentInElement("//img[contains(@src,'mast_flightfinder.gif')]//following::font[1]", "xpath", 4);
		assertElementPresentInPage("//img[contains(@src,'mast_flightfinder.gif')]//following::font[1]", "xpath");
		actionsMercuryReservation.selectArrivingIn(5);
		actionsMercuryReservation.selectReturningDate(6);
		actionsMercuryReservation.selectAirline(7);
		takescreenshot();
		actionsMercuryReservation.clickContinueButton();
		Thread.sleep(2000);
		assertElementPresentInPage("//img[contains(@src,'mast_selectflight.gif')]", "xpath");
		takescreenshot();
		
		MercurySelectFlightPage actionsMercurySelectFlight = new MercurySelectFlightPage(driver);
		
		assertTextPresentInElement("//b/font[text()='DEPART']//following::font[1]", "xpath", 8);
		actionsMercurySelectFlight.clickContinueButton();
		Thread.sleep(2000);
		assertElementPresentInPage("//img[contains(@src,'mast_book.gif')]", "xpath");
		takescreenshot();
		
		MercuryBookFlightPage actionsMercuryBookFlight = new MercuryBookFlightPage(driver);
		
		assertElementPresentInPage("//input[@name='buyFlights']", "xpath");
		actionsMercuryBookFlight.enterFirstName(9);
		actionsMercuryBookFlight.enterLastName(10);
		actionsMercuryBookFlight.enterCreditNumber(11);
		takescreenshot();
		actionsMercuryBookFlight.clickSecurePurchaseButton();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Alert alert = driver.switchTo().alert();
		alert.accept();		
		
		assertElementPresentInPage("//img[contains(@src,'mast_confirmation.gif')]", "xpath");
		takescreenshot();
		
		MercuryFlightConfirmationPage actionsMercuryFlightConfirmation = new MercuryFlightConfirmationPage(driver);
		
		assertElementPresentInPage("//b/font[contains(text(),'itinerary has been booked!')]", "xpath");
		assertElementPresentInPage("//img[contains(@src,'printit.gif')]", "xpath");
		String value = driver.findElement(By.xpath("//font[contains(text(),'Price (including taxes):')]//following::font[1]")).getText();
		System.out.println(value);
		assertTextPresentInElement("//font/b/font/font/b/font", "xpath", 12);
		actionsMercuryFlightConfirmation.clickLogoutImage();
		Thread.sleep(2000);	
				
		assertElementPresentInPage("//img[contains(@src,'mast_signon.gif')]", "xpath");
		
	}
}
