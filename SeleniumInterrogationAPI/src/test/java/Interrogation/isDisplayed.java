package Interrogation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(10000);
		WebElement check=d.findElement(By.xpath("//button[.='Register']"));
		Thread.sleep(10000);
		System.out.println(check.isDisplayed());
		d.quit();

	}

}
