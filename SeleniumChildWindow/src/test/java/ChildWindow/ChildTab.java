package ChildWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		Thread.sleep(2000);
		//Searching laptop
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
		d.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		//Clicking the first product
		d.findElement(By.xpath("//div[@data-index='3']")).click();
		Thread.sleep(2000);
		Set<String> window=d.getWindowHandles();
		String parent=d.getWindowHandle();
		for(String child:window) {
			d.switchTo().window(child);
		}
		d.findElement(By.xpath("(//input[@data-hover='Select <b>__dims__</b> from the left<br> to add to Shopping Cart'])[2]")).click();
		Thread.sleep(2000);
		d.close();
	
		
		
		

	}

}
