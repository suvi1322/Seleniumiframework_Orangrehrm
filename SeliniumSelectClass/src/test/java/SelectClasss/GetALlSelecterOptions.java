package SelectClasss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetALlSelecterOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		WebElement listbox=(d.findElement(By.id("cars")));
		Select sele=new Select(listbox);
		Thread.sleep(2000);
		sele.selectByVisibleText("Opel");
		sele.selectByVisibleText("Volvo");
		sele.selectByVisibleText("Saab");
		sele.selectByVisibleText("Audi");
		List<WebElement> options=sele.getAllSelectedOptions();
		for(WebElement opt:options) {
			System.out.println(opt.getText());
		}
		d.quit();

	}

}
