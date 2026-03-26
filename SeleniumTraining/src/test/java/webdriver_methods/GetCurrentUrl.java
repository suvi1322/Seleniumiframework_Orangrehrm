package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		// Launching the browser
		WebDriver driver =new ChromeDriver();
		driver.get("https://gemini.google.com/app");
		//wait statement
		Thread.sleep(3000);
		//fetching the url of the current web page
		System.out.println(driver.getCurrentUrl());
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		//fetching the source code of the page
		System.out.println(driver.getPageSource());
		driver.close();
		
	}

}
