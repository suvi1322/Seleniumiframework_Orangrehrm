package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(2000);
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		//same ClassName not working
////		driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("Admin");
////		driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("admin123");
////		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("Admin");
////		driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("admin123");
//		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		driver.get("https://www.youtube.com/");
		Thread.sleep(6000);
		driver.findElement(By.name("search_query")).sendKeys("Nee etti etti");
		driver.findElement(By.cssSelector("[title=\"Search\"]")).click();
		driver.findElement(By.xpath("")).click();
		
		
		
		
		
		
		

	}

}
