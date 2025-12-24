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

public class Activity7 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void BeforeSteps() {
	
			driver = new FirefoxDriver();
			wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			driver.get("http://alchemy.hguy.co/crm");
	}
			
	@Test
	public void ActivitiesMenu() {
			driver.findElement(By.id("user_name")).sendKeys("admin");
			driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
			driver.findElement(By.id("bigbutton")).click();
			driver.findElement(By.id("grouptab_0")).click();
			driver.findElement(By.id("moduleTab_9_Leads")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("moduleTitle")));
			//driver.findElement(By.id("adspan_77c0ebaa-448d-740d-a00f-605ae70266e9")).click();
			driver.findElement(By.xpath("//table[contains(@class,'list view table-responsive')]/tbody/tr[1]/td[10]")).click();
			//Reporter.log("Mobile num is: " + phone);
			String MobileNumber = driver.findElement(By.className("phone")).getText();
			Reporter.log("Mobile number of lead is " + MobileNumber);
	}
	
	@AfterClass
	public void EndSteps() {
		
		driver.quit();
	}
}