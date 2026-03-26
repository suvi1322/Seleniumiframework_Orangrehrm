package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		d.findElement(By.name("username")).sendKeys("Admin");
		d.findElement(By.name("password")).sendKeys("admin123");
		d.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(6000);
		d.findElement(By.linkText("Recruitment")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(3000);
		d.findElement(By.name("firstName")).sendKeys("Swetha");
		d.findElement(By.name("lastName")).sendKeys("B");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@placeholder='Type here' and @class='oxd-input oxd-input--active' ]")).sendKeys("Swethababupec@gmail.com");
		
	}

}
