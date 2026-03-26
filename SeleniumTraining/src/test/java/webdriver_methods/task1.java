package webdriver_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		//cssselectore model 
		driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("swetha");
		driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("B");
	
		


	}

}
