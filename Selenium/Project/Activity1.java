package CRMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		
	}
	
	@Test
	public void WebSiteTitle() {
		
		Assert.assertEquals(driver.getTitle(), "SuiteCRM");
		
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
		
	}

}
