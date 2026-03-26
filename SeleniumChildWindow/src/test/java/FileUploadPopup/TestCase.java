package FileUploadPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(3000);
		d.findElement(By.cssSelector("[class=\"main-2\"]")).click();
		Thread.sleep(2000);
		d.findElement(By.id("resumeUpload")).sendKeys("D:\\\\swetha B.pdf");
		//d.findElement(By.cssSelector("[type=\"file\"]")).sendKeys("D:\\swetha B.pdf");
		
		

	}

}
