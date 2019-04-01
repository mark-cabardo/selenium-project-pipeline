package acn.pageobjects;

import org.openqa.selenium.WebDriver;

import common.BasePage;
import common.BaseTest;

public class MercurySelectFlightPage extends BasePage {

	public MercurySelectFlightPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickContinueButton(){

		click("reserveFlights", "name");
		BaseTest.log("Clicked Continue button...");
	}
	
}
