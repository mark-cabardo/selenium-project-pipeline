package acn.pageobjects;

import org.openqa.selenium.WebDriver;
import common.BasePage;
import common.BaseTest;

public class GooglePage extends BasePage{


	public GooglePage(WebDriver driver) {
		super(driver);
	}

	public void enterSearchBar(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("q", "name", value);
		BaseTest.log("Entered value in google search bar...");
	}	
	
	public void clickSearchButton(){

		click("btnG", "name");
		BaseTest.log("Clicked search button...");
	}

}
