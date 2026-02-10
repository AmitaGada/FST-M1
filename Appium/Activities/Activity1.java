package Activity;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity1 {
	
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
		
		driver.get("https://training-support.net");
		
	}
	
	@Test
	public void testMethod() {
		
		String pageHeading = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Training Support']")).getText();
 
        // Print to console
        System.out.println("Heading: " + pageHeading);
 
        // Find and click the About Us link
        driver.findElement(AppiumBy.accessibilityId("About Us")).click();
 
        // Find heading of new page and print to console
        String aboutPageHeading = driver.findElement(AppiumBy.xpath(
                "//android.widget.TextView[@text='About Us']"
        )).getText();
        System.out.println(aboutPageHeading);
		
	}
	
	@AfterClass
	public void EndTest() {
		driver.quit();
	}

}
