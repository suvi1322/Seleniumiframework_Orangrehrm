package SelectClasss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		Select sel=new Select(d.findElement(By.id("Skills")));
		List<WebElement> option=sel.getOptions();
		for(WebElement op:option) {
			System.out.println(op.getText());
		}
		Thread.sleep(2000);
		d.navigate().to("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(2000);
		Select se=new Select(d.findElement(By.id("options")));
		Thread.sleep(2000);
		List<WebElement> allopt=se.getOptions();
		Thread.sleep(2000);
		for(WebElement op1:allopt) {
			System.out.println(op1.getText());
		}
		d.navigate().to("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		WebElement listbox=(d.findElement(By.id("cars")));
		Select sele=new Select(listbox);
		Thread.sleep(2000);
		sele.selectByVisibleText("Opel");
		sele.selectByVisibleText("Volvo");
		sele.selectByVisibleText("Saab");
		sele.selectByVisibleText("Audi");
		System.out.println(sele.getFirstSelectedOption().getText());
		List<WebElement> options=sele.getAllSelectedOptions();
		for(WebElement opt:options) {
			System.out.println(opt.getText());
		}
		d.quit();
				
		
	}

}
