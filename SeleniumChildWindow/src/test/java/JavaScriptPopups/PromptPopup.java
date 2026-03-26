package JavaScriptPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		d.findElement(By.partialLinkText("Alert with Textbox")).click();
		Thread.sleep(2000);
		d.findElement(By.cssSelector("[class=\"btn btn-info\"]")).click();
		Thread.sleep(2000);
		Alert pop=d.switchTo().alert();
		System.out.println(pop.getText());
		pop.sendKeys("Swetha");
		pop.accept();
		

	}

}
