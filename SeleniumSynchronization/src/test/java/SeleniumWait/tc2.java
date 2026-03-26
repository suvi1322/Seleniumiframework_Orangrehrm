package SeleniumWait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc2 {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://demowebshop.tricentis.com/");
		String paret=d.getWindowHandle();
		d.findElement(By.linkText("Facebook")).click();
		d.findElement(By.linkText("Twitter")).click();
		d .findElement(By.linkText("YouTube")).click();
		Set<String> all=d.getWindowHandles();
		for(String child:all) {
		d.switchTo().window(child);
		if(d.getTitle().equals("YouTube")) {
			d.switchTo().window(child);
		}
		}
		d.findElement(By.cssSelector("[type=\"text\"]")).sendKeys("Nelothi");
		d.findElement(By.cssSelector("[title=\"Search\"]")).click();
		
	
	
		
		
		;

	}

}
