package Practices;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
	@Test
	public void test() throws EncryptedDocumentException, IOException  {
		FileInputStream fis=new FileInputStream("D:\\SELENIUM\\SeleniumUIFramework.OrangeHRM\\src\\test\\resources\\OrangeHrm_TestScriptData\\OrangeHRM_Recrutiment_Vacancy_TestData\\OrangeHRM.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Sheet1");
		for(int i=0;i<=sheet.getLastRowNum();i++) {
			String vacancyName=sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(vacancyName);
		}
//		Row row=sheet.getRow(1);
//		Cell cell=row.getCell(1);
//		String vacancyName=cell.getStringCellValue();
//		System.out.println(vacancyName);
		workbook.close();
		
	}

}
