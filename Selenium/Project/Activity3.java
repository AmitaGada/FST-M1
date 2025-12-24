package CRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	
	WebDriver driver;
	
	@BeforeClass
	public void BeforeSteps() {
		
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		Reporter.log("Title of the page: " + driver.getTitle());
	}
	
	@Test
	public void copyrightText() {
		
		WebElement element = driver.findElement(By.id("admin_options"));
		
		String copyrightText = element.getText();
		Reporter.log("The first copyright text in the footer is: " + copyrightText);
	}
	
	@AfterClass
	public void EndSteps() {
		driver.quit();
	}

}
