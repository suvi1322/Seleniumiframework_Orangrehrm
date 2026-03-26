package com.orangehrm.seleniumiframework.pim;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.oranghrm.seleniumiframework.object_repository.AddEmployee;
import com.oranghrm.seleniumiframework.object_repository.Dashboard;
import com.oranghrm.seleniumiframework.object_repository.LoginPage;
import com.oranghrm.seleniumiframework.object_repository.PIMpage;

public class AddEmployeesTest {
	WebDriver d;
	@Test
	public void addnew() throws InterruptedException  {
		d=new ChromeDriver();
		LoginPage lp=new LoginPage(d);
		Dashboard db=new Dashboard(d);
		PIMpage pi=new PIMpage(d);
		AddEmployee ae=new AddEmployee(d);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(20));
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//login
		lp.EnterCredentials("Admin", "admin123");
		lp.log();
		db.pim();
		pi.addbtn();
	    wait.until(ExpectedConditions.elementToBeClickable(ae.getCreatelogin()));
		ae.Enter("Swetha","Kumari", "B", "1322");
		ae.clicks();
		wait.until(ExpectedConditions.visibilityOf(ae.getUser()));
		ae.user("Swetha", "#Swe*1304", "#Swe*1304");
		ae.save();	
		
	}

}
