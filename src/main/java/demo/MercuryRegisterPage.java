package acn.pageobjects;

import org.openqa.selenium.WebDriver;

import common.BasePage;
import common.BaseTest;

public class MercuryRegisterPage extends BasePage {

	public MercuryRegisterPage(WebDriver driver) {
		super(driver);
	}
	
	public void enterFirstName(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("firstName", "name", value);
		BaseTest.log("Entered first name in register page...");
	}
	
	public void enterLastName(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("lastName", "name", value);
		BaseTest.log("Entered last name in register page...");
	}
	
	public void enterPhone(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("phone", "name", value);
		BaseTest.log("Entered phone in register page...");
	}
	
	public void enterEmail(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("userName", "name", value);
		BaseTest.log("Entered email in register page...");
	}
	
	public void enterAddress1(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("address1", "name", value);
		BaseTest.log("Entered address1 in register page...");
	}
	
	public void enterAddress2(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("address2", "name", value);
		BaseTest.log("Entered address2 in register page...");
	}
	
	public void enterCity(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("city", "name", value);
		BaseTest.log("Entered city in register page...");
	}
	
	public void enterState(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("state", "name", value);
		BaseTest.log("Entered state in register page...");
	}
	
	public void enterPostalCode(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("postalCode", "name", value);
		BaseTest.log("Entered postal code in register page...");
	}
	
	public void enterUserName(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("email", "name", value);
		BaseTest.log("Entered user name in register page...");
	}
	
	public void enterPassword(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("password", "name", value);
		BaseTest.log("Entered password in register page...");
	}
	
	public void enterConfirmPassword(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("confirmPassword", "name", value);
		BaseTest.log("Entered confirm password in register page...");
	}
	
	public void clickSubmitButton(){

		click("register", "name");
		BaseTest.log("Clicked submit button...");
	}
	
	public void clickSignInLink(){

		click("sign-in", "linktext");
		BaseTest.log("Clicked sign-in link...");
	}

}
