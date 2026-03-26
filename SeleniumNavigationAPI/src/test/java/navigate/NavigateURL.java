package navigate;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateURL {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		URL url=new URL("https://www.flipkart.com/");
		driver.navigate().to(url);
		Thread.sleep(2000);
//		URL url1=new URL("https://www.ubereats.com/in");
//		driver.navigate().to(url1);
		//both are same 
		driver.navigate().to(new URL("https://www.ubereats.com/in"));
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
