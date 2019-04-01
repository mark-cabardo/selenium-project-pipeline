package acn.test;

import org.testng.annotations.Test;
import acn.pageobjects.HomePage;
import common.BaseTest;

public class FinalExam extends BaseTest {
	
	final public String xcelSheetName = "TestData";
	final public String xcelFilePath = "C:\\Workspace\\SeleniumProject2\\src\\acn\\testdata\\FinalExamTestData.xlsx";
	
	@Test
	public void DemoQA() throws Exception{		
		
		startTest(xcelFilePath, xcelSheetName);
		
		HomePage actionsHome = new HomePage(driver);
		
		assertElementPresentInPage("//a[text()='Home']", "xpath");
		assertElementPresentInPage("//a[text()='Product Category']", "xpath");
		assertElementPresentInPage("//a[text()='All Product']", "xpath");
		assertElementPresentInPage("//div[@id='header_cart']/a", "xpath");
		actionsHome.clickCheckoutLink();
		Thread.sleep(5000);
		assertTextPresentInElement("//article[@id='post-29']/div", "xpath", 2);
		actionsHome.clickAllProductLink();
		Thread.sleep(5000);
		assertElementPresentInPage("//a[text()='Magic Mouse']", "xpath");
		assertTextPresentInElement("//p/span[2]", "xpath", 3);
		assertElementPresentInPage("//div[@id='default_products_page_container']/div[4]/div[2]/form/div[2]/div/span/input", "xpath");
		actionsHome.clickAddToCartButton();
		Thread.sleep(20000);
		assertElementPresentInPage("//*[@id='fancy_notification_content']", "xpath");
		assertTextPresentInElement("//*[@id='fancy_notification_content']/span", "xpath", 4);
		assertElementPresentInPage("//a[text()='Go to Checkout']", "xpath");
		assertElementPresentInPage("//a[text()='Continue Shopping']", "xpath");
		actionsHome.clickGoToCheckoutLinkButton();
		Thread.sleep(5000);
		assertTextPresentInElement("//div[@id='checkout_page_container']/div/span", "xpath", 5);
		assertTextPresentInElement("//a[text()='Magic Mouse']", "xpath", 6);
		actionsHome.enterQuantity(7);
		actionsHome.clickUpdateButton();
		Thread.sleep(6000);
		assertValuePresentInElement("quantity", "name", 7);
		assertTextPresentInElement("//div[@id='checkout_page_container']/div/table/tbody/tr[2]/td[5]/span/span", "xpath", 8);
		actionsHome.clickContinueButton();
		Thread.sleep(5000);
		assertTextPresentInElement("//div[@id='wpsc_shopping_cart_container']/h2", "xpath", 9);
		actionsHome.clickCountry();
		actionsHome.clickOptionPH();
		actionsHome.enterProvince(11);
		actionsHome.clickCalculateButton();
		Thread.sleep(5000);
		assertTextPresentInElement("//td[2]/span/span", "xpath", 12);
		assertTextPresentInElement("//tr[3]/td[2]/span/span", "xpath", 13);
		assertTextPresentInElement("//tr[4]/td[2]/span/span", "xpath", 14);
		assertTextPresentInElement("//tr[5]/td[2]/span/span", "xpath", 15);
		actionsHome.enterEmail(16);
		actionsHome.enterFirstName(17);
		actionsHome.enterLastName(18);
		actionsHome.enterAddress(19);
		actionsHome.enterCity(20);
		actionsHome.enterUndefined(21);
		actionsHome.clickBillingCountry();
		actionsHome.clickOptionPH2();
		actionsHome.enterPostal(23);
		actionsHome.enterPhone(24);
		actionsHome.clickSameAsBillingAddTick();
		assertTextPresentInElement("shippingsameasbillingmessage", "id", 25);
		actionsHome.clickPurchaseButton();
		Thread.sleep(5000);
	}
}
