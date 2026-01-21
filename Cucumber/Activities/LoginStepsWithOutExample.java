package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginStepsWithOutExample extends BaseClass {
		@Given("the user is on the login page")
		public void onLoginPage() {
			driver.get("https://training-support.net/webelements/login-form");
			assertEquals("Selenium: Login Form", driver.getTitle());
		}
		@When("the user enters username and password")
		public void enterthecredentials() {
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("password");
		}
		@When("the user enters {string} and {string}")
		public void entertheCredentialsFromInputs(String username, String password) {
			WebElement usernameField = driver.findElement(By.id("username"));
			WebElement passwordField = driver.findElement(By.id("password"));
			usernameField.clear();
			passwordField.clear();
			usernameField.sendKeys("admin");
			passwordField.sendKeys("password");
		}

		@And("clicks the submit button")
		public void clickonsubmit() {
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
		}
		@Then("get the confirmation message and verify it")
		public void confirmationMessage() {
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("h2.mt-5"), "Welcome"));
	        String message = driver.findElement(By.cssSelector("h2.mt-5")).getText();
	        // Assert message
	        Assertions.assertEquals("Welcome Back, Admin!", message);
		}
		@Then("get the confirmation text and verify message as {string}")
	    public void confirmMessageAsInput(String expectedMessage) {
	    	// Find the confirmation message
	        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("h2.mt-5"), "Welcome Back, Admin!"));
	        String message = driver.findElement(By.cssSelector("h2.mt-5")).getText();
	        // Assert message
	        Assertions.assertEquals(expectedMessage, message);
	    }
}
