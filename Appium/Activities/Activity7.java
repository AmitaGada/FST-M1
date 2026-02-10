package Activity;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity7 {
	AppiumDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, URISyntaxException {
		//Desired capabilities
		UiAutomator2Options caps = new UiAutomator2Options();
		caps.setPlatformName("android");
		caps.setAutomationName("UiAutomator2");
		caps.setAppPackage("com.android.chrome");
		caps.setAppActivity("com.google.android.apps.chrome.Main");
		caps.noReset();
		
		// Set the Appium server URL
		URL serverURL = new URI("http://localhost:4723").toURL();
				
		// Initialize the IOS driver
		driver = new AndroidDriver(serverURL, caps);	
		
		driver.get("https://training-support.net/webelements/sliders");
	}
	
	@Test
	public void volume25Test() {
		
		Dimension dims = driver.manage().window().getSize();
		System.out.println(dims.getWidth() + " , " + dims.getHeight());
		
		int startX = (int) (0.5 * dims.getWidth());
		int startY = (int) (0.77 * dims.getHeight());
		Point start = new Point(startX, startY);
		
		int endX = (int) (0.33 * dims.getWidth());
		int endY =  (int) (0.77 * dims.getHeight());
		Point end = new Point(endX, endY);
		
		ActionsBase.doSwipe(driver, start, end, 1500);
		
		String volumeText = driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text, '%')]")).getText();
		
		assertEquals(volumeText, "25%");
		
	}
	
	@Test
	public void volume75Test() {
		
		Dimension dims = driver.manage().window().getSize();
		System.out.println(dims.getWidth() + " , " + dims.getHeight());
		
		int startX = (int) (0.5 * dims.getWidth());
		int startY = (int) (0.77 * dims.getHeight());
		Point start = new Point(startX, startY);
		
		int endX = (int) (0.67 * dims.getWidth());
		int endY =  (int) (0.77 * dims.getHeight());
		Point end = new Point(endX, endY);
		
		ActionsBase.doSwipe(driver, start, end, 1500);
		
		String volumeText = driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text, '%')]")).getText();
		
		assertEquals(volumeText, "75%");
		
	}
	
	@AfterClass
	public void endTest() {
		
		driver.quit();
	}
	

}
	
