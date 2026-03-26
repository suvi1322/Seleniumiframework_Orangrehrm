package NotificationPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifictions");
		options.addArguments("--incognito");
		WebDriver d=new ChromeDriver(options);
		d.manage().window().maximize();
		d.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		Thread.sleep(2000);
		d.findElement(By.id("browNotButton")).click();
		
		

	}

}
