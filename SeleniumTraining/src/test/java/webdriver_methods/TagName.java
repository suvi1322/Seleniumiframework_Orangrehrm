package webdriver_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//Locating all the links in the page
		List<WebElement> allinks= driver.findElements(By.tagName("a"));
		//Fetching the name of the each link
		for(WebElement link :allinks) {
			System.out.println(link.getText());
		}
		for(WebElement link:allinks) {
			System.out.println(link.getText());
			if(link.getText().contains("Store")) {
				link.click();
				break;
					
			}
		}
		
	}

}
