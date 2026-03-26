package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyaxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()=\"14.1-inch Laptop\"]/parent::h2/parent::div/child::div[@class=\"add-info\"]/child::div//input")).click();	
        driver.get("https://www.makemytrip.com/flights/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("")).click();
        //driver.findElement(By.xpath("//p[text()='For Your Dream Europe Trip: Get Up to 40%OFF*']/parent::div/parent::div/parent::div//child::div[@class=\"sliderFoot\"]/child::div//a[text()='BOOK NOW']")).click();
        
	}

}
