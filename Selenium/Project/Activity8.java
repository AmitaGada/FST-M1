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

public class Activity8 {
	
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
		public void testreadaccountspage() {
				driver.findElement(By.id("user_name")).sendKeys("admin");
				driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
				driver.findElement(By.id("bigbutton")).click();
				driver.findElement(By.id("grouptab_0")).click();
				driver.findElement(By.id("moduleTab_9_Accounts")).click();
				Reporter.log("Able to navigate to accounts page successfully");
				List<WebElement> oddRows = driver.findElements(By.xpath("//tr[@class='oddListRowS1']"));
				Reporter.log("Odd rows found using xpath");
				for (WebElement row : oddRows) {
					
					List<WebElement> cells = row.findElements(By.tagName("td"));
					
					for (WebElement cell : cells) {
						Reporter.log(cell.getAttribute("innerHTML"));
						System.out.println(cell.getText());
					}
					
				}
		}
		
		@AfterClass
		public void EndSteps() {
			
			driver.quit();
		}
	

}
