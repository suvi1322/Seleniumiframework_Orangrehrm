package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathContains {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
		//method 1
//		driver.findElement(By.xpath("//a[contains(@class,'ico-cart')]")).click();
		//method 2
		//driver.findElement(By.xpath("//span[contains(.,'Shopping cart')]")).click();
		//Test case1
		//driver.findElement(By.xpath("//a[contains(@class,'ico-login')]")).click();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'b3wTlE')]")).click();
		driver.findElement(By.xpath("")).click();
		
		
		
		
		

	}

}
