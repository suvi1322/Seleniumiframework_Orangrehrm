package JavaScriptPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		//Clicking on the butoon to trigger the popup
		d.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		Thread.sleep(2000);
		d.switchTo().alert().accept();
		


	}

}
