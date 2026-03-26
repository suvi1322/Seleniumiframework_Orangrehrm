package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;



public class task9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement fn=d.findElement(By.cssSelector("[placeholder=\"First Name\"]"));
		fn.sendKeys("Swetha");
		WebElement ln=d.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(fn));
		ln.sendKeys("B");
		WebElement add=d.findElement(RelativeLocator.with(By.cssSelector("[ng-model=\"Adress\"]")).below(ln));
		add.sendKeys("Puliyankannu Ranipet");
		WebElement email=d.findElement(RelativeLocator.with(By.cssSelector("[ng-model=\"EmailAdress\"]")).below(add));
		email.sendKeys("Swethababupec@gmail.com");
		
		
		
	}

}
