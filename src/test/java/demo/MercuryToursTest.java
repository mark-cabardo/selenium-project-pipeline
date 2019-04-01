package acn.test;
import org.testng.annotations.Test;
import acn.pageobjects.MercuryRegisterPage;
import acn.pageobjects.MercurySignOnPage;
import acn.pageobjects.MercuryWelcomePage;
import common.BaseTest;

public class MercuryToursTest extends BaseTest {
	final public String xcelSheetName = "TestData";
	final public String xcelFilePath = "C:\\Workspace\\SeleniumProject2\\src\\acn\\testdata\\MercuryTestData.xlsx";
	
	@Test
	public void MercuryWelcome() throws Exception{		
		
		startTest(xcelFilePath, xcelSheetName);	
		
		MercuryWelcomePage actionsMercuryWelcome = new MercuryWelcomePage(driver);
		
		takescreenshot();
		assertElementPresentInPage("//img[contains(@src,'featured_destination.gif')]", "xpath");
		actionsMercuryWelcome.clickRegisterLink();
		Thread.sleep(2000);
		assertElementPresentInPage("//img[contains(@src,'mast_register.gif')]", "xpath");
		takescreenshot();	
		
		MercuryRegisterPage actionsMercuryRegister = new MercuryRegisterPage(driver);
			
		Thread.sleep(2000);
		actionsMercuryRegister.enterFirstName(2);
		actionsMercuryRegister.enterLastName(3);
		actionsMercuryRegister.enterPhone(4);
		actionsMercuryRegister.enterEmail(5);
		actionsMercuryRegister.enterAddress1(6);
		actionsMercuryRegister.enterAddress2(7);
		actionsMercuryRegister.enterCity(8);
		actionsMercuryRegister.enterState(9);
		actionsMercuryRegister.enterPostalCode(10);
		actionsMercuryRegister.enterUserName(11);
		actionsMercuryRegister.enterPassword(12);
		actionsMercuryRegister.enterConfirmPassword(12);
		takescreenshot();
		actionsMercuryRegister.clickSubmitButton();		
		Thread.sleep(2000);
		assertTextPresentInElement("//b[contains(text(),'Dear')]", "xpath", 13);
		assertTextPresentInElement("//b[contains(text(),'Note: Your user name is')]", "xpath", 14);
		takescreenshot();
		actionsMercuryRegister.clickSignInLink();
		Thread.sleep(2000);
		assertElementPresentInPage("//img[contains(@src,'mast_signon.gif')]", "xpath");
		takescreenshot();
		
		MercurySignOnPage actionsMercurySignOn = new MercurySignOnPage(driver);
		
		assertElementPresentInPage("//img[contains(@src,'mast_signon.gif')]", "xpath");
		actionsMercurySignOn.enterUserName(11);
		actionsMercurySignOn.enterPassword(12);
		takescreenshot();
		actionsMercurySignOn.clickSubmitButton();
		Thread.sleep(2000);
		assertElementPresentInPage("//img[contains(@src,'mast_flightfinder.gif')]", "xpath");
		takescreenshot();
	}
}
