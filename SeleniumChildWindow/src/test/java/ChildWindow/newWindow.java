package ChildWindow;

import org.openqa.selenium.WebDriver;import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		System.out.println(d.getTitle());
		//Triggering a new tab in the dame browser window and parallelly switching the tool control
		d.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);
		d.switchTo().newWindow(WindowType.TAB);
		d.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		System.out.println(d.getTitle());
		d.quit();
	}

}
