package com.orangehrm.seleniumiframework.pim;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.orangehrm.seleniumiframework.pim.object_repository.Dash;
import com.orangehrm.seleniumiframework.pim.object_repository.Login;
import com.orangehrm.seleniumiframework.pim.object_repository.PIM;

import GenericUtility.ActionsHelper;
import GenericUtility.BaseClassPimReason;
import GenericUtility.ExcelUtility;

public class Pimreasons extends BaseClassPimReason {
	@Test
	public void PimTermin() throws EncryptedDocumentException, IOException {
	ActionsHelper ah=new ActionsHelper(d);
	Login lp=new Login(d);
	Dash db=new Dash(d);
	PIM p=new PIM(d);
	ExcelUtility eu=new ExcelUtility();
    String filepath="./src/test/resources/OrangeHrm_TestScriptData/OrangeHRM_Recrutiment_Vacancy_TestData/ExcelUtilityVacancy.xlsx";
    eu.loadExcelFile(filepath, "Sheet1");
    db.setPim();
    
    
    
	}

}
