package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	d.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
	WebElement ele=d.findElement(By.id("circle"));
	Actions act=new Actions(d);
	//if we call  ther perform method default build() will be there 
//	act.clickAndHold(ele).perform();
//	act.clickAndHold(ele).pause(4000).release().perform();
	act.moveToElement(ele).clickAndHold().pause(4000).release().perform();
	}
}
