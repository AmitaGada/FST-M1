package CRMProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity9 {
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
	
	@BeforeClass
	public void BeforeSteps() {
	
			driver = new FirefoxDriver();
			driver.get("http://alchemy.hguy.co/crm");
				
	}
			
	@Test
	public void readaccountspage() {
			driver.findElement(By.id("user_name")).sendKeys("admin");
			driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
			driver.findElement(By.id("bigbutton")).click();
			driver.findElement(By.id("grouptab_0")).click();
			driver.findElement(By.id("moduleTab_9_Accounts")).click();
			Reporter.log("Able to navigate to accounts page successfully");
			List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class = 'list view table-responsive')]/tbody/tr"));
			Reporter.log("Number of rows: " + rows.size());
	}
	
	@AfterClass
	public void EndSteps() {
		
		driver.quit();
	}

}
