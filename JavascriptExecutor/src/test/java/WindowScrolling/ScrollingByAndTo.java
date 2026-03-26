package WindowScrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingByAndTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.amazon.in/");
		Thread.sleep(2000);
		//SCROLLING BY USING SCROLL ON
		JavascriptExecutor js=(JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1500)");
		//SCROLLING BY USING SCROLL TO
		js.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,1500)");
		
		
		
		
	

	}

}
