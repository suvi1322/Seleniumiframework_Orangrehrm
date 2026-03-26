package manage;


import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningManage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.manage().window().minimize();
		Thread.sleep(2000);
		d.manage().window().fullscreen();
		Thread.sleep(2000);
		
		
		
		

	}

}
