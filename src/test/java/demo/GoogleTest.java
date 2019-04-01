package acn.test;

import org.testng.annotations.Test;
import acn.pageobjects.GooglePage;
import common.BaseTest;

public class GoogleTest extends BaseTest {
	
	final public String xcelSheetName = "Sample Sheet";
	final public String xcelFilePath = "C:\\Workspace\\SeleniumProject2\\src\\acn\\testdata\\SampleTestData.xlsx";
	
	
	@Test
	public void Googletest() throws Exception{
		
		
	startTest(xcelFilePath, xcelSheetName);	
	
	GooglePage actions = new GooglePage(driver);
	
	takescreenshot();
	assertElementPresentInPage("q", "name");
	actions.enterSearchBar(2);
	takescreenshot();
	actions.clickSearchButton();
	Thread.sleep(2000);
	assertTextPresentInElement("//*[@id='rhs_block']/ol/div/div[1]/div/div[1]/ol/div[2]/div/div[1]", "xpath", 3);
	takescreenshot();
		
	}
	 	  
  }

