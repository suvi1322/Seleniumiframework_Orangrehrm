package WebAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextField {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement fn=d.findElement(By.cssSelector("[placeholder=\"First Name\"]"));
		fn.sendKeys("Swetha");
		Thread.sleep(2000);
		WebElement ln=d.findElement(By.cssSelector("[placeholder=\"Last Name\"]"));
		ln.sendKeys("B");
		Thread.sleep(2000);
		fn.clear();
		Thread.sleep(2000);
		ln.clear();
		Thread.sleep(2000);
		fn.sendKeys("Santha");
		Thread.sleep(2000);
		ln.sendKeys("kumar");
		
		
		
		
		

	}

}
