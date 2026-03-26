package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LogInAndLogOut {
	WebDriver d;
	@Test(priority = 1,invocationCount = 2)
	public void Login() {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		//headless is used for only we can see in console it will not open the browser
		//opt.addArguments("--headless");
		d=new ChromeDriver(opt);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.saucedemo.com/");
		d.findElement(By.name("user-name")).sendKeys("standard_user");
		d.findElement(By.name("password")).sendKeys("secret_sauce");
		d.findElement(By.cssSelector("[type=\"submit\"]")).click();
		d.findElement(By.id("react-burger-menu-btn")).click();
	    d.findElement(By.linkText("Logout")).click();
		d.quit();;
	}
	
		
		 
		
	

}
