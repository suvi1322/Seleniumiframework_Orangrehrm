package SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.shoppersstack.com/products_page/34");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//writing the pin
		d.findElement(By.id("Check Delivery")).sendKeys("123456");
		WebElement checkBtn=d.findElement(By.id("Check"));
		//waiting for the check button to be enabled before clicking
		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(checkBtn));
		//clciking on ckeck button
		checkBtn.click();
		

	}

}
