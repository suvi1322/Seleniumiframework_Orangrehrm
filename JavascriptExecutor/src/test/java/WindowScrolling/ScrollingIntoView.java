package WindowScrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingIntoView {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://doodles.google/");
		WebElement ele=d.findElement(By.xpath("//div[.='When is your birthday?']"));
		Thread.sleep(2000);
		//SCROLLING BY USING SCROLL INTO VIEW
		JavascriptExecutor js=(JavascriptExecutor) d;
//		js.executeScript("arguments[0].scrollIntoView(true)",ele);
		Thread.sleep(2000);
//		js.executeScript("arguments[0].scrollIntoView(false)",ele);
		
		//default it is taken as true
		js.executeScript("arguments[0].scrollIntoView()",ele);
		
	}

}
