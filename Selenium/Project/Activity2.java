package CRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Reporter;


public class Activity2 {
	
	WebDriver driver;
	
	@BeforeClass
	public void BeforeSteps() {
		
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		Reporter.log("Ttile of the page:" + driver.getTitle());
		
	}
	
	@Test
	public void testheaderimage() {
		 
		//WebElement element = driver.findElement(By.xpath("//div[@class='companylogo']//img[@src='themes']"));
		WebElement element = driver.findElement(By.tagName("img"));
		String ImageURL = element.getAttribute("src");
		
		//System.out.println("Header Image URL: " + ImageURL);
		Reporter.log("Header Image URL: " + ImageURL + " |");
	}

	
	@AfterClass
	public void EndStep() {
		driver.quit();
	}
}
