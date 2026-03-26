package WindowScrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionOnDiabledElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.oracle.com/java/technologies/javase-jdk25-doc-downloads.html");
		//click the link
		d.findElement(By.cssSelector("[class='license-link icn-download-locked']")).click();
		WebElement ele=d.findElement(By.linkText("Download jdk-25.0.2_doc-all.zip"));
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("arguments[0].click()",ele);
		
	}

}
