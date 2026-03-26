package manage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetMethod {

	public static void main(String[] args)throws InterruptedException {
		// Launching the browser
		WebDriver driver=new ChromeDriver();
		//navigating to utube
		//driver.get("https://www.youtube.com/");
		//driver.get("https://web.whatsapp.com/");
		driver.get("https://www.amazon.in/");
		//fetching the tittle of the webpage
		//wait statement
		Thread.sleep(2000);
		String t=driver.getTitle();
		System.out.println(t);

	}

}
