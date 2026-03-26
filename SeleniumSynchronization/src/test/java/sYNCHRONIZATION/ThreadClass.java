package sYNCHRONIZATION;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		Thread.sleep(2000);
		d.navigate().to("https://www.ebay.com/");
		Thread.sleep(1500, 500);
		d.navigate().to("https://www.shopify.com/in");
		Thread.sleep(Duration.ofSeconds(5));
		
		}

}
