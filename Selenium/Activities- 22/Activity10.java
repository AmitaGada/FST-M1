package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		
		driver.get("https://training-support.net/webelements/drag-drop");
		System.out.println("Title of the page is: " + driver.getTitle());
		
		WebElement FootBall = driver.findElement(By.id("ball"));
		WebElement DropZone1 = driver.findElement(By.id("dropzone1"));
		WebElement DropZone2 = driver.findElement(By.id("dropzone2"));
		
		builder.clickAndHold(FootBall).moveToElement(DropZone1).pause(5000).release().build().perform();
		if(DropZone1.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
			System.out.println("Ball was dropped in dropzone 1");
		}
		
		builder.dragAndDrop(FootBall, DropZone2).pause(5000).build().perform();
		if(DropZone2.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
			System.out.println("Ball was dropped in dropzone 2");
		}
		driver.quit();
				
	}

}
