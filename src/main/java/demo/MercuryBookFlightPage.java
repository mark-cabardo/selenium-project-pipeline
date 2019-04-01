package acn.pageobjects;

import org.openqa.selenium.WebDriver;

import common.BasePage;
import common.BaseTest;

public class MercuryBookFlightPage extends BasePage {
	
	public MercuryBookFlightPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickSecurePurchaseButton(){

		click("buyFlights", "name");
		BaseTest.log("Clicked Secure Purchase button...");
	}
	
	public void enterFirstName(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("passFirst0", "name", value);
		BaseTest.log("Entered first name in book flight page...");
	}
	
	public void enterLastName(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("passLast0", "name", value);
		BaseTest.log("Entered last name in book flight page...");
	}
	
	public void enterCreditNumber(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("creditnumber", "name", value);
		BaseTest.log("Entered credit card number in book flight page...");
	}
}
