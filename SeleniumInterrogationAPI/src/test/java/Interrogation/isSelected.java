package Interrogation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		Thread.sleep(10000);
		WebElement check=d.findElement(By.id("pollanswers-1"));
		Thread.sleep(10000);
		System.out.println(check.isSelected());
		check.click();
		Thread.sleep(10000);
		System.out.println(check.isSelected());
		d.quit();
	}

}
