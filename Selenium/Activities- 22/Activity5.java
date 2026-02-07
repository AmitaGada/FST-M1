package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		//the title of the page and print it to the console
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Title of the page: " + driver.getTitle());
		
		//Find the checkbox input element
		WebElement checkbox = driver.findElement(By.id("checkbox"));
		//
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		
		System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
		
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
				
		System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
		
		//Close the browser
		driver.quit();
	}

}
