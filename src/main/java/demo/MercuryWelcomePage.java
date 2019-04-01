package acn.pageobjects;

import org.openqa.selenium.WebDriver;

import common.BasePage;
import common.BaseTest;

public class MercuryWelcomePage extends BasePage {

	public MercuryWelcomePage(WebDriver driver) {
		super(driver);
	}
	
	public void enterUserName(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("userName", "name", value);
		BaseTest.log("Entered user name in welcome page...");
	}
	
	public void enterPassword(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("password", "name", value);
		BaseTest.log("Entered password in welcome page...");
	}
	
	public void clickHomeLink(){

		click("Home", "linktext");
		BaseTest.log("Clicked Home link...");
	}
	
	public void clickRegisterLink(){

		click("REGISTER", "linktext");
		BaseTest.log("Clicked REGISTER link...");
	}
	
	public void clickSignInButton(){

		click("login", "name");
		BaseTest.log("Clicked Sign-In button...");
	}

}
