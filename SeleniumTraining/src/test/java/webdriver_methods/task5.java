package webdriver_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//label[.=\"Excellent\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//label[.=\"Good\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//label[.=\"Poor\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//label[.=\"Very bad\"]")).click();
		List<WebElement> l1=driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement l:l1) {
			l.click();
			Thread.sleep(2000);
		}
	}

}
