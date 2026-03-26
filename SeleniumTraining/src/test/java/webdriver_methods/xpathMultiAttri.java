package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathMultiAttri {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads') and @href]")).click();
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[contains(@type,'text') and @id='gh-ac' and @class='gh-search-input gh-tb ui-autocomplete-input']")).sendKeys("Toys");
//		driver.findElement(By.xpath("//input[@title='Search']")).click();
		driver.findElement(By.xpath("//a[@_sp=\"p4624852.m1379.l3250\"and @href='https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545']")).click();

	}

}
