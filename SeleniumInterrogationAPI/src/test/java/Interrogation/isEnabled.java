package Interrogation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.shoppersstack.com/products_page/34");
		Thread.sleep(10000);
		WebElement check=d.findElement(By.id("Check"));
		Thread.sleep(9000);
		System.out.println(check.isEnabled());
		
		
		

	}

}
