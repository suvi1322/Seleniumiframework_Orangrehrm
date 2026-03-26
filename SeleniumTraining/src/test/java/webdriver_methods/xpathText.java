package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/login3.0?sublist=0&scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.=\"X Path\"]")).click();
		driver.findElement(By.xpath("//section[.=\"Login 3.0\"]")).click();
		driver.findElement(By.id("username_62")).sendKeys("Swetha");
		Thread.sleep(2000);
		driver.findElement(By.id("password_316")).sendKeys("#Swe*1322");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.=\"Login\"]")).click();
		
		

	}

}
