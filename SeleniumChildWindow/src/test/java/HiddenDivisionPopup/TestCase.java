package HiddenDivisionPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver d=new ChromeDriver(options);
		d.manage().window().maximize();
		d.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(2000);
		d.findElement(By.cssSelector("[class=\"ng-tns-c69-9 ui-calendar\"]")).click();
		d.findElement(By.linkText("11")).click();

		

	}

}
