package WebAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("[value=\"Male\"]")).click();
		

	}

}
