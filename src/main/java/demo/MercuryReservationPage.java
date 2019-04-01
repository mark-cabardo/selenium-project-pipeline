package acn.pageobjects;

import org.openqa.selenium.WebDriver;

import common.BasePage;
import common.BaseTest;

public class MercuryReservationPage extends BasePage {

	public MercuryReservationPage(WebDriver driver) {
		super(driver);
	}
	
	public void selectArrivingIn(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		selectDropdownByVisibleText("toPort", "name", value);
		BaseTest.log("Selected destination in reservation page...");
	}
	
	public void selectReturningDate(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		selectDropdownByVisibleText("toDay", "name", value);
		BaseTest.log("Selected returning date in reservation page...");
	}

	public void selectAirline(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		selectDropdownByVisibleText("airline", "name", value);
		BaseTest.log("Selected airline in reservation page...");
	}
	
	public void clickContinueButton(){

		click("findFlights", "name");
		BaseTest.log("Clicked Continue button...");
	}
}
