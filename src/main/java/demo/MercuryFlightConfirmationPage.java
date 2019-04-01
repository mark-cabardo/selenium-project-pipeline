package acn.pageobjects;

import org.openqa.selenium.WebDriver;

import common.BasePage;
import common.BaseTest;

public class MercuryFlightConfirmationPage extends BasePage {

	public MercuryFlightConfirmationPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickLogoutImage(){

		click("//img[contains(@src,'Logout.gif')]", "xpath");
		BaseTest.log("Clicked log out image button...");
	}
}
