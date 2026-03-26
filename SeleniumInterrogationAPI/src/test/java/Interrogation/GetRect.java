package Interrogation;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement link=d.findElement(By.linkText("Register"));
		Rectangle rect=link.getRect();
		System.out.println(rect.getDimension());
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		System.out.println(rect.x);
		System.out.println(rect.y);
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getPoint());
		System.out.println(rect.height);
		System.out.println(rect.width);
		d.quit();
		

	}

}
