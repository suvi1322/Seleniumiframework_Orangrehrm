package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Relati{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
//		//navigate to the demo web shop
//		driver.get("https://demowebshop.tricentis.com/");
//		//wait statement to allow the web page  to load properly 
//		//along with all the elements
//		Thread.sleep(2000);
//		//typing computers in the search textfield
//		WebElement search=driver.findElement(By.id("small-searchterms"));
//		search.sendKeys("Computers");
//		//using relative locator to locate the search button
//		Thread.sleep(2000);
//		WebElement sb=driver.findElement(RelativeLocator.with(By.tagName("input")));
//		driver.findElement(RelativeLocator.with(By.tagName("a")).above(sb)).click();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("Swetha B");
		WebElement email=driver.findElement(RelativeLocator.with(By.tagName("input")).below(name));
		email.sendKeys("Swethababu[ec@gmail.com");
		WebElement pass=driver.findElement(RelativeLocator.with(By.tagName("input")).below(email));
		pass.sendKeys("#Swe*1322");
		driver.findElement(RelativeLocator.with(By.tagName("button")).below(pass)).click();
		
		
	}

}
