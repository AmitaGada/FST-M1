package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginSteps extends BaseClass {
	@Given("the user is on the login page")
	public void LoginPage() {
		driver.get("https://training-support.net/webelements/login-form");
		assertEquals("Selenium: Login Form", driver.getTitle());
	}
	@When("the user enters username and password")
	public void entercredentials() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
	}

	@And("clicks the submit button")
	public void clicksubmit() {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}
	@Then("get the confirmation message and verify it")
	public void confirmMessage() {
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("h2.mt-5"), "Welcome"));
        String message = driver.findElement(By.cssSelector("h2.mt-5")).getText();
        // Assert message
        Assertions.assertEquals("Welcome Back, Admin!", message);
	}


}
