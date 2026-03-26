package navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToString {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navgiate to  google
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.wikipedia.org/");
		Thread.sleep(2000);
		driver.quit();

	}

}
