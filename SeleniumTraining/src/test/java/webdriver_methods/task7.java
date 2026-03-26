package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
//		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//section[.=\"X Path\"]")).click();
//		Thread.sleep(3000);
		driver.get("https://demoapps.qspiders.com/ui/duplicate");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[@href=\"/ui/duplicate\"]")).click();
		driver.findElement(By.xpath("//label[.='Samsung']/..//input[@class='mr-2 h-5 w-5']")).click();
		

	}

}
