package acn.pageobjects;

import org.openqa.selenium.WebDriver;

import common.BasePage;
import common.BaseTest;

public class MercurySignOnPage extends BasePage {

	public MercurySignOnPage(WebDriver driver) {
		super(driver);
	}

	public void enterUserName(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("userName", "name", value);
		BaseTest.log("Entered user name in sign-on page...");
	}
	
	public void enterPassword(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("password", "name", value);
		BaseTest.log("Entered password in sign-on page...");
	}
	
	public void clickSubmitButton(){

		click("login", "name");
		BaseTest.log("Clicked Submit button...");
	}
}
