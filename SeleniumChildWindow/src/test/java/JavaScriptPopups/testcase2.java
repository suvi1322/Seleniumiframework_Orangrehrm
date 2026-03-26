package JavaScriptPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("[value=\"Search\"]")).click();
		Thread.sleep(2000);
		d.switchTo().alert().accept();
		d.findElement(By.cssSelector("[value=\"Search store\"]")).sendKeys("Computers");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("[value=\"Search\"]")).click();
		
		
		
		
		

	}

}
