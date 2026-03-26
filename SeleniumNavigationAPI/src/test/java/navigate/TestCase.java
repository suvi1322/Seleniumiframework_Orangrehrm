package navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com/");
		Thread.sleep(2000);
		d.findElement(By.id("APjFqb")).sendKeys("Automation");
		d.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		System.out.println(d.getTitle());
		Thread.sleep(2000);
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Tools");
		Thread.sleep(2000);
		d.navigate().refresh();
		Thread.sleep(2000);
		d.navigate().back();
		System.out.println(d.getTitle());

	}

}
