package Interrogation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndTag {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement link=d.findElement(By.id("navbarDropdown"));
		System.out.println("Name of the link:"+link.getText());
		System.out.println("Name of the Tagname:"+link.getTagName());
		d.quit();
	}

}
