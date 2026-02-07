package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		//Get the title of the page and print it to the console.
		driver.get("https://training-support.net/webelements/target-practice");
		System.out.println("Title of the page: " + driver.getTitle());
		
		//3rd header on the page and print it's text to the console
		
		String header3_message = driver.findElement(By.xpath("//h3[contains(text(), '#3')]")).getText();
		System.out.println("Header 3 message is: "  + header3_message);
		
		//5th header on the page and print it's color
		Color header5_color = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(), '#5')]")).getCssValue("color"));
		System.out.println("Header5 color RGB: " + header5_color.asRgba());
		System.out.println("Header5 color as hexcode: " + header5_color.asHex());
		
		//purple button and print all it's classes
		WebElement element = driver.findElement(By.xpath("//button[contains(text(), 'Pu')]"));
		String att_value = element.getAttribute("Class");
		System.out.println("Color of the button: " + att_value);
		
		//slate button and print it's text.
		WebElement element2 = driver.findElement(By.xpath("//button[contains(text(), 'Sl')]"));
		String button_text = element2.getText();
		System.out.println("text of Slate button: " + button_text);
		
		//Close the browser
		driver.quit();
		
	}

}
