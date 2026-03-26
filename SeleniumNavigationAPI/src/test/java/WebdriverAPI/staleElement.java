package WebdriverAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staleElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement search=d.findElement(By.id("small-searchterms"));
		search.sendKeys("Mobile");
		Thread.sleep(2000);
		d.navigate().refresh();
		Thread.sleep(2000);
		d.findElement(By.id("small-searchterms")).sendKeys("Mobile");

		

	}

}
