package manage;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GETandSetPos {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		System.out.println(d.manage().window().getPosition());
		d.manage().window().maximize();
		System.out.println(d.manage().window().getPosition());
		Thread.sleep(2000);
		d.manage().window().setPosition(new Point(100, 100));
		Thread.sleep(2000);
		d.manage().window().setPosition(new Point(400, 100));
		

	}

}
