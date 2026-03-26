package Interrogation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValue {

	public static void main(String[] args) throws InterruptedException {
			WebDriver d=new ChromeDriver();
			d.manage().window().maximize();
			d.get("https://www.selenium.dev/");
			Thread.sleep(2000);
			WebElement logo=d.findElement(By.xpath("//*[name()='svg' and @id='Layer_1']"));
			System.out.println(logo.getCssValue("Font"));
			System.out.println(logo.getCssValue("color"));
			System.out.println(logo.getCssValue("background-color"));
			System.out.println(logo.getCssValue("display"));
		    d.quit();

	}

}
