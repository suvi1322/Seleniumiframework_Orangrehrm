package Practices;

import java.awt.RenderingHints.Key;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.orangehrm.seleniumiframework.requirement.object_repository.LoginPage;

public class ReadingDataFromCsvFile {
	WebDriver d;
	@Test
	public void readCsv() throws IOException {
		String line="";
		String split=",";
		BufferedReader br=new BufferedReader(new FileReader("D:\\SELENIUM\\SeleniumUIFramework.OrangeHRM\\src\\test\\resources\\Orangehrm_CommonData\\sample.csv"));
		while((line=br.readLine())!=null) {
			String data[]=line.split(",");
			String d1=data[0];
			String d2=data[1];
//			String d3=data[2];
			System.out.println("Key:"+d1+ "  Value:"+ d2);
			WebDriver d=new ChromeDriver();
			LoginPage lp=new LoginPage(d);
			d.manage().window().maximize();
			if(d1.contains("url")) {
				d.get(d2);
			}
			if(d1.contains("username")) {
				lp.setUsername(d2);
			}
			if(d1.contains("password")) {
				lp.setPassword(d2);
				lp.setLogin();
			}
		}
			}

}
