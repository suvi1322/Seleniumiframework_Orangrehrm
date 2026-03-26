package SelectClasss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement drop=d.findElement(By.id("Skills"));
		//Making object of select class
		Select sel=new Select(drop);
		sel.selectByValue("Backup Management");
		Thread.sleep(2000);
		//Method 3 SelectVisible Text
		sel.selectByVisibleText("AutoCAD");
		Thread.sleep(2000);
		//Method 4 SelectContainsVisibleText
		//by contains visible text to click on javascript
		sel.selectByContainsVisibleText("Client");
	}

}
