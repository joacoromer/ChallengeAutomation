package project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonPage extends Wrapper {

	//By name
	By nameSearch = By.name("field-keywords");
	
	//By Xpath
	By postalCodeSearch = By.xpath("//input[@aria-label='o introduce un código postal en EE. UU.']");
	By sendPostalCode = By.xpath("//div[@role='button']//input[@type='submit']");
	By applyButton = By.xpath("//div[@class='a-popover-footer']//input[@id='GLUXConfirmClose']");
	By pageTwoXpath = By.xpath("//span//*[@aria-label=\"Ir a la página 2\"]");
	By thirdSearchResult = By.xpath("//div[@data-cel-widget='MAIN-SEARCH_RESULTS-3']//div[@class='a-section']//h2//a");
	By sendTo = By.xpath("//div[@id='nav-global-location-slot']//span[@id='nav-global-location-data-modal-action']");
	By buyNowButton = By.xpath("//div[@id='addToCart_feature_div']//input[@id='add-to-cart-button-ubb']");
	By checkoutButton = By.xpath("//div[@data-feature-id='proceed-to-checkout-label']");
	


	public void changeCountry() throws InterruptedException {
		//Al tomar la dirección como argentina, las ubicaciones no me permiten añadir al carrito
		//Por lo tanto, le pongo un código postal de Miami para que me deje
		click(sendTo);
		sleep(1000L);
		setText("33012", postalCodeSearch);
		sleep(1000L);
		click(sendPostalCode);
		sleep(1000L);
		click(applyButton);
		sleep(1000L);
	}
	
	public void searchProductToBuy() throws InterruptedException {
		clearText(nameSearch);
		setText("alexa", nameSearch);
		submit(nameSearch);
		sleep(1000L);
		scrollItByPx("2800");
		sleep(1000L);
		scrollItByPx("2800");
		sleep(1000L);
		click(pageTwoXpath);
		sleep(1000L);
		click(thirdSearchResult);
		sleep(1000L);
		click(buyNowButton);		
	}
	
	public String getCheckoutText() {
		return getText(checkoutButton);
	}
	
}
