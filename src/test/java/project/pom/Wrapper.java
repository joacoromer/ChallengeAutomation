package project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wrapper {
	
	private WebDriver driver;
	private JavascriptExecutor js;
	
	public Wrapper() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.js = (JavascriptExecutor) driver;
	}
	
	
	public void maximizeBrowser() throws InterruptedException {
		driver.manage().window().maximize();
		sleep(1000L);
	}
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void setText(String textInput, By locator) {
		driver.findElement(locator).sendKeys(textInput);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public void clearText(By locator) {
		driver.findElement(locator).clear();
	}
	
	public void submit(By locator) {
		driver.findElement(locator).submit();
	}

	public void scrollItByPx(String cantPx) {
		js.executeScript("window.scrollBy(0,"+ cantPx +")");
	}
	
	public void openBrowser(String url) {
		driver.get(url);
	}
	
	public void sleep(Long timeMilis) throws InterruptedException {
		Thread.sleep(timeMilis);
	}
	
	public void quit() {
		driver.quit();
	}

}
