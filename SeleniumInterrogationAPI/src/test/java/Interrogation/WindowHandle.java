package Interrogation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(9000);
		//Fectching the 32 char unique session id
		System.out.println(d.getWindowHandle());
		//refresh the page
		d.navigate().refresh();
		Thread.sleep(9000);
		System.out.println(d.getWindowHandle());
		d.navigate().back();
	}

}
