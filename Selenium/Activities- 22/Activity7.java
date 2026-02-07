package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://training-support.net/webelements/dynamic-controls");
		 //Get the title of the page and print it to the console
		 System.out.println("Title of the page: " + driver.getTitle());
		 
		 //Find the text field
		 WebElement textfield = driver.findElement(By.id("textInput"));
		 //Check if the text field is enabled and print it
		 System.out.println("Is text field enable: " + textfield.isEnabled());
		 
		 //Click the "Enable Input" button to enable the input field
		 driver.findElement(By.id("textInputButton")).click();
		 //Check if the text field is enabled again and print it
		 System.out.println("Is text field enabled: " + textfield.isEnabled());
		 
		 //Close the browser
		 driver.quit();
	}

}
