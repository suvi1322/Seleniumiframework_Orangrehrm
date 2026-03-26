package ChildWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		d.findElement(By.xpath("//h2[.='Laptop']/..//button")).click();
		String parent=d.getWindowHandle();
		Set<String> all=d.getWindowHandles();
		Thread.sleep(2000);
		all.remove(parent);
		for(String child:all) {
			d.switchTo().window(child);
		}
		Thread.sleep(2000);
		WebElement cart=d.findElement(By.xpath("//h1[.='High-Performance Laptop']/..//button"));
		cart.click();
		cart.click();
		Thread.sleep(2000);
		WebElement logo=d.findElement(By.xpath("//*[local-name()='svg']"));
		logo.click();
		Thread.sleep(2000);
		WebElement shopping=d.findElement(By.tagName("h2"));
		if(shopping.isDisplayed()) {
			System.out.println("Test case Passed!!");
		}
		else {
			System.out.println("Test case Failes");
		}
		d.close();
		
		
		
		
}

}
