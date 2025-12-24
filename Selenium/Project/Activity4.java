package CRMProject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void BeforeSteps() {
		
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://alchemy.hguy.co/crm");
		Reporter.log("Title of the page is: " + driver.getTitle());
	}
	
	@Test
	public void loginTest() {
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		Reporter.log("Login Successfull");
		
		Boolean element = wait.until(ExpectedConditions.urlToBe("https://alchemy.hguy.co/crm/index.php?module=Home&action=index"));
		Reporter.log("Successfully logged into CRM Suite " + element);
	}
	
	@AfterClass
	public void EndSteps() {
		driver.quit();
	}

}
