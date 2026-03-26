package JavaScriptPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		Thread.sleep(2000);
		String parent=d.getWindowHandle();
		d.findElement(By.cssSelector("[placeholder='Search for products, brands and more']")).sendKeys("Dresses");
		Thread.sleep(2000);
		d.findElement(By.xpath("//li[.='Dresses For Women']")).click();
		d.findElement(By.xpath("//a[@href=\"dresses/claura/claura-women-floral-printed--fit--flare-midi-dress/31375705/buy\"]")).click();
		Thread.sleep(2000);
		Set<String> wish=d.getWindowHandles();
		wish.remove(parent);
		for(String wi:wish) {
			d.switchTo().window(wi);
		}
		Thread.sleep(2000);
	    d.findElement(By.cssSelector("[class=\"myntraweb-sprite pdp-notWishlistedIcon sprites-notWishlisted pdp-flex pdp-center \"]")).click();
	    WebElement login=d.findElement(By.cssSelector("[class=\"welcome-header\"]"));
	    Thread.sleep(2000);
	    if(login.isDisplayed()) {
	    	System.out.println("Test case passed");
	    }
	    else {
	    	System.out.println("Failes!!!");
	    }
	
		
		
		
		

	}

}
