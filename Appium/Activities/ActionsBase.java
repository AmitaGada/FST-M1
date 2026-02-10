package Activity;

import static java.time.Duration.ofMillis;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;

import java.util.Arrays;

import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;

import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.PointerInput.Kind;

import io.appium.java_client.AppiumDriver;

public class ActionsBase {
private final static PointerInput finger = new PointerInput(Kind.TOUCH, "finger");
	
	//Create a swipe action
	public static void doSwipe(AppiumDriver driver, Point start, Point end, int duration) {
		
		//Create the sequence of Actions
		Sequence swipe = new Sequence(finger, 1);
		swipe.addAction(finger.createPointerMove(ofMillis(0), viewport(), start.getX(), start.getY()));
		swipe.addAction(finger.createPointerDown(LEFT.asArg())); // 0 = LEFT CLICK
		//swipe.addAction(null)
		swipe.addAction(finger.createPointerMove(ofMillis(duration), viewport(), start.getX(), start.getY()));
		swipe.addAction(finger.createPointerUp(LEFT.asArg()));
		
		//Perform the actions
		driver.perform(Arrays.asList(swipe));

}
}
