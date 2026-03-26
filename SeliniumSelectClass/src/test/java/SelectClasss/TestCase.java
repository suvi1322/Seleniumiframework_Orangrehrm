package SelectClasss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
//		WebElement drop=d.findElement(By.id("oldSelectMenu"));
//		Select sel=new Select(drop);
//		Thread.sleep(2000);
//		System.out.println(sel.isMultiple());
//		d.quit();
		WebElement drop1=d.findElement(By.id("cars"));
		Select sel1=new Select(drop1);
		Thread.sleep(2000);
		System.out.println(sel1.isMultiple());
		d.quit();
		
		

	}

	
}
