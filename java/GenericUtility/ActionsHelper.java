package GenericUtility;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsHelper {
	WebDriver d;
	Actions act;
	public ActionsHelper(WebDriver d) {
		this.d=d;
		act=new Actions(d);
	}
	//MovetoElement and click
	public void ClickOnElement(WebElement element) {
		act.moveToElement(element).click().perform();
	}

	public void navigateDownDrop(WebElement element,int count,long timeInSec) {
		act.click(element).pause(3000).perform();
		for(int i=0;i<=count;i++) {
			act.keyDown(Keys.DOWN).keyUp(Keys.DOWN).perform();
		}
		act.keyDown(Keys.ENTER).keyUp(Keys.DOWN).perform();
	}
	public void scrollDownAutoSuggestion(String Text,WebElement element,long timeInSec,int count) {
		act.sendKeys(element,Text).pause(Duration.ofSeconds(timeInSec)).perform();
		for(int i=0;i<=count;i++) {
			act.keyDown(Keys.DOWN).keyUp(Keys.DOWN).perform();
		}
		act.keyDown(Keys.ENTER).keyUp(Keys.DOWN).perform();
	}
	



}
