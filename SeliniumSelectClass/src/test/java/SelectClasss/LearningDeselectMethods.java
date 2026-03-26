package SelectClasss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningDeselectMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(2000);
		Select sel=new Select(d.findElement(By.id("select-multiple-native")));
		sel.selectByVisibleText("John Hardy Women's L...");
		sel.selectByVisibleText("Mens Casual Premium ...");
		sel.selectByVisibleText("Pierced Owl Rose Gol...");
		sel.selectByVisibleText("SanDisk SSD PLUS 1TB...");
		sel.selectByVisibleText("White Gold Plated Pr...");
		Thread.sleep(2000);
		sel.deselectByIndex(1);
		Thread.sleep(2000);
		sel.deselectByValue("John Hardy Women's Legends Naga Gold & Silver Dragon Station Chain Bracelet");
		Thread.sleep(2000);
		sel.deselectByVisibleText("SanDisk SSD PLUS 1TB...");
		Thread.sleep(2000);
		sel.deSelectByContainsVisibleText("White Gold Plated Pr...");
		sel.deselectAll();
		

		
		
	}

}
