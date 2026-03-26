package manage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GETandSETsize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println(driver.manage().window().getSize());
		//setting the size of the browser
		//Dimension dim=new Dimension(1500,500);
		//driver.manage().window().setSize(dim);
		driver.manage().window().setSize(new Dimension(1500, 500));
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(2000);
		driver.quit();
		

	}

}
