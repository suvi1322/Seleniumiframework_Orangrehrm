package SelectClasss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		//Locating the skills dropdown
		WebElement drop=d.findElement(By.id("Skills"));
		//Making object of select class
		Select sel=new Select(drop);
		sel.selectByIndex(2);
		
		

	}

}
