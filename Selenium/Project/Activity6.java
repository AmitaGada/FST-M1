package CRMProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {
	
	WebDriver driver;
	WebDriverWait wait;
		
	@BeforeClass
	public void BeforeSteps() {
		
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("http://alchemy.hguy.co/crm");
		Reporter.log("Title of the page is: " + driver.getTitle());
	}
	
	@Test
	public void ActivitiesMenu() {
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		boolean activity = driver.findElement(By.id("grouptab_3")).isDisplayed();
		Reporter.log("Activity menu item is available " + activity);
	}
	
	@AfterClass
	public void EndSteps() {
		
		driver.quit();
	}

}
