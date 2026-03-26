package WebAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEBSubmit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(9000);
		d.findElement(By.id("username")).sendKeys("Admin");
		d.findElement(By.id("password")).sendKeys("admin123");
		Thread.sleep(8000);
		d.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
		
		
		
	}

}
