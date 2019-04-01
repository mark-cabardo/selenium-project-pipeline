package acn.pageobjects;

import org.openqa.selenium.WebDriver;

import common.BasePage;
import common.BaseTest;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void clickCheckoutLink(){

		click("//div[@id='header_cart']/a", "xpath");
		BaseTest.log("Clicked Checkout link...");
	}
	
	public void clickAllProductLink(){

		click("//a[text()='All Product']", "xpath");
		BaseTest.log("Clicked All Product link...");
	}
	
	public void clickAddToCartButton(){

		click("//div[@id='default_products_page_container']/div[4]/div[2]/form/div[2]/div/span/input", "xpath");
		BaseTest.log("Clicked Add To Cart Button...");
	}
	
	public void clickGoToCheckoutLinkButton(){

		click("Go to Checkout", "linktext");
		BaseTest.log("Clicked Go to Checkout Link Button...");
	}
	
	public void enterQuantity(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("quantity", "name", value);
		BaseTest.log("Entered quantity in Checkout page...");
	}
	
	public void clickUpdateButton(){

		click("submit", "name");
		BaseTest.log("Clicked Update Button...");
	}
	
	public void clickContinueButton(){

		click("//div[2]/div/a/span", "xpath");
		BaseTest.log("Clicked Continue Button...");
	}
	
	public void clickCountry() {
		
		click("//select[@id='current_country']/option[1]", "xpath");
		BaseTest.log("Selected country in calculate shipping page...");
	}
	
	public void clickOptionPH() {
		
		click("//option[@value='PH']", "xpath");
		BaseTest.log("Selected PH country in calculate shipping page...");
	}
	
	public void enterProvince(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("collected_data[15]", "name", value);
		BaseTest.log("Entered province in calculate shipping page...");
	}
	
	public void clickCalculateButton(){

		click("wpsc_submit_zipcode", "name");
		BaseTest.log("Clicked Calculate Button...");
	}
	
	public void enterEmail(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("collected_data[9]", "name", value);
		BaseTest.log("Entered email in calculate shipping page...");
	}
	
	public void enterFirstName(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("collected_data[2]", "name", value);
		BaseTest.log("Entered first name in calculate shipping page...");
	}
	
	public void enterLastName(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("collected_data[3]", "name", value);
		BaseTest.log("Entered last name in calculate shipping page...");
	}
	
	public void enterAddress(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("collected_data[4]", "name", value);
		BaseTest.log("Entered address in calculate shipping page...");
	}
	
	public void enterCity(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("collected_data[5]", "name", value);
		BaseTest.log("Entered city in calculate shipping page...");
	}
	
	public void enterUndefined(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("collected_data[6]", "name", value);
		BaseTest.log("Entered undefined in calculate shipping page...");
	}
	
	public void enterPostal(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("collected_data[8]", "name", value);
		BaseTest.log("Entered postal in calculate shipping page...");
	}
	
	public void enterPhone(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("collected_data[18]", "name", value);
		BaseTest.log("Entered phone in calculate shipping page...");
	}
	
	public void clickBillingCountry() {
		
		click("//select[@id='wpsc_checkout_form_7']/option[1]", "xpath");
		BaseTest.log("Selected country in calculate shipping page...");
	}
	
	public void clickOptionPH2() {
		
		click("(//option[@value='PH'])[2]", "xpath");
		BaseTest.log("Selected PH country in calculate shipping page...");
	}

	public void clickSameAsBillingAddTick(){

		click("shippingSameBilling", "name");
		BaseTest.log("Clicked Same As Billing Tick Box...");
	}
	
	public void clickPurchaseButton(){

		click("//div[@id='wpsc_shopping_cart_container']/form/div[4]/div/div/span/input", "xpath");
		BaseTest.log("Clicked Purchase Button...");
	}

}
