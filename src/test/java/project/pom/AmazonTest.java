package project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AmazonTest {
	
	private AmazonPage amazonPage;
	
	public AmazonTest() {
		amazonPage = new AmazonPage();
	}

	@Before
	public void setUp() throws Exception {
		try {
			amazonPage.openBrowser("https://www.amazon.com");
			amazonPage.maximizeBrowser();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	@Test
	public void test() throws InterruptedException {
		amazonPage.changeCountry();
		amazonPage.searchProductToBuy();
	}
	
	@After
	public void tearDown() {
		amazonPage.quit();
	}
	

}
