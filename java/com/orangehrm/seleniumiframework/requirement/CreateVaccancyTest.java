package com.orangehrm.seleniumiframework.requirement;

import java.io.IOException;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.orangehrm.seleniumiframework.requirement.object_repository.ClickVacancy;
import com.orangehrm.seleniumiframework.requirement.object_repository.LoginPage;
import com.orangehrm.seleniumiframework.requirement.object_repository.addVacancy;
import com.orangehrm.seleniumiframework.requirement.object_repository.addValuesInVacancy;
import com.orangehrm.seleniumiframework.requirement.object_repository.dashboard;
import com.orangehrm.seleniumiframework.requirement.object_repository.recruitment;
import com.oranghrm.seleniumiframework.object_repository.AddEmployee;
import com.oranghrm.seleniumiframework.object_repository.Dashboard;

import com.oranghrm.seleniumiframework.object_repository.PIMpage;

import GenericUtility.ActionsHelper;
import GenericUtility.BaseClassTest3;
import GenericUtility.ExcelUtility;
import GenericUtility.JavaUtility;
import GenericUtility.ScreenshotUtility;

public class CreateVaccancyTest extends BaseClassTest3 {
	@Test
	public void addVacancy() throws IOException {
		    ActionsHelper ah=new ActionsHelper(d);
//		    Actieons act=new Actions(d);
		    LoginPage lp=new LoginPage(d);
		    dashboard db=new dashboard(d);
		    recruitment r=new recruitment(d);
		    ClickVacancy cv=new ClickVacancy(d);
		    addVacancy av=new addVacancy(d);
		    addValuesInVacancy avv=new addValuesInVacancy(d);
		    ExcelUtility eu=new ExcelUtility();
		    JavaUtility ju=new JavaUtility();
		    ScreenshotUtility sc=new ScreenshotUtility();
		    String random=ju.getRandomValue();
		    String filepath="./src/test/resources/OrangeHrm_TestScriptData/OrangeHRM_Recrutiment_Vacancy_TestData/Vacancy.xlsx";
		    eu.loadExcelFile(filepath, "Sheet1");
		    db.setRecruit();
		    r.setAdd();
		    cv.setVacancy();
		    av.addbtn();
		    avv.setName(eu.getDataFromSingleCell(1, 1));
		    ah.navigateDownDrop(avv.getJob(), 1, 10);
		    avv.setDescription(eu.getDataFromSingleCell(1, 2));
		    ah.scrollDownAutoSuggestion("t",avv.getManager(), 4, 1);
		    avv.setPositions(eu.getDataFromSingleCell(1, 3));
		    avv.ClickSave();
		    sc.captureScreenShot(d, "AfterVacancyCreation");
//		    act.click(avv.getJob()).pause(3000).keyDown(Keys.DOWN).keyDown(Keys.DOWN).perform();
//		    avv.setDescription("Hii");
//		    act.sendKeys(avv.getManager(),"t").pause(Duration.ofSeconds(20)).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.ENTER).perform();
//		    avv.setPositions("15");
//		    avv.setSave();
//		    db.setLogoutdrop();
		    SoftAssert s=new SoftAssert();
//			List<WebElement>  check=d.findElements(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border']"));
//			for(WebElement c:check) {
//				String name=c.getText();
//				s.assertEquals(name,eu.getDataFromSingleCell(1, 1));
//				if(name.equals(eu.getDataFromSingleCell(1, 1))) {
//					Reporter.log("Test case:PASS");
//				}
//				else {
//					Reporter.log("Test case:Fail");
//				}
//			}
//			s.assertAll();

		    List<WebElement> check = d.findElements(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border']"));

		    for (WebElement ra : check) {
		        ////label[text()='Vacancy Name']/../../..//input
		        // Get only Vacancy Name column (1st column)
		        String vacancyName = ra.findElement(By.xpath("label[text()='Vacancy Name']/../../..//input")).getText();
		        s.assertEquals(vacancyName,eu.getDataFromSingleCell(1, 1));
		        if (vacancyName.equals(eu.getDataFromSingleCell(1, 1))) {
		        	Reporter.log("Test case:PASS");
		        }
		        else {
		        	Reporter.log("Test case:Fail");
		        }
		    }

		    s.assertAll();
		    
		    

		}

		
	}


