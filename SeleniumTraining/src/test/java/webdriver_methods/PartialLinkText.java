package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
        //if you access the linktext text it will thro the org.openqa.selenium.NoSuchElementException so go with partial linktext
//		driver.findElement(By.linkText("Computers\r\n"
//				+ "        ")).click();
		//in PLT make the entire text in short for example computer to comp
		driver.findElement(By.partialLinkText("Comp")).click();
		//test case 2
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
	}

}
