package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();;
		driver.get("https://github.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-action=\"click:qbsearch-input#searchInputContainerClicked\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"query-builder-test\"]")).sendKeys("Selenium");
		driver.findElement(By.xpath("//span[@class=\"ActionListItem-label text-normal\"]")).click();
	}

}
