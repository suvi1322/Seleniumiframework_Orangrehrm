package SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class usingFluentWait {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.shoppersstack.com/products_page/34");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.findElement(By.id("Check Delivery")).sendKeys("123456");
		WebElement a=d.findElement(By.id("Check"));
		//giving a fluent wait to check if the codition is satisified 
		FluentWait wait= new FluentWait(d);
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.withTimeout(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(a));
		a.click();
	}

}
