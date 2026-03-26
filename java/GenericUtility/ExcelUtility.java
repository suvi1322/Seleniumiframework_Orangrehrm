package GenericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	Workbook wb;
	 Sheet sh;
	
	//load Excel
	public void loadExcelFile(String filepath,String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
        wb = WorkbookFactory.create(fis);
        sh = wb.getSheet(sheetName);

	}

   public String getDataFromSingleCell(int rowNum,int cellNum) throws IOException {
   	//Read data
   	String value="";
       CellType data=sh.getRow(rowNum).getCell(cellNum).getCellType();
       if(data==CellType.STRING) {
       	value=sh.getRow(rowNum).getCell(cellNum).getStringCellValue();
       }
       else if(data==CellType.NUMERIC) {
       	value=String.valueOf((int)sh.getRow(rowNum).getCell(cellNum).getNumericCellValue());
       }
       
       return value;
       
   }
   
   //Write Data
   public void writeDataIntheCell(String filepath,String sheetName,int rowNum,int cellNum,String data) throws EncryptedDocumentException, IOException {
   	FileInputStream fis=new FileInputStream(filepath);
   	Workbook wb=WorkbookFactory.create(fis);
   	Sheet sheet=wb.getSheet(sheetName);
   	Row row=sheet.getRow(rowNum);
   	if(row==null) {
   		row=sheet.createRow(rowNum);
   	}
   	Cell cell=row.getCell(cellNum);
   	if(cell==null) {
   	cell=row.createCell(cellNum);
   }
   	cell.setCellValue(data);
   	FileOutputStream fos=new FileOutputStream(filepath);
   	wb.write(fos);
   	fos.close();
   	
}
//Get entire data using DataProvider
   
   public Object[][]getDataFromTheExcelSheet() throws IOException{
   	int rowno=sh.getLastRowNum();
   	int cellno=sh.getRow(0).getLastCellNum();
   	
   	Object[][]data=new Object[rowno][cellno];
   	for(int i=1;i<=rowno;i++) {
   		for(int j=0;j<cellno;j++) {
   			data[i-1][j]=getDataFromSingleCell(i,j);
   		}
   	}
   	return data;
   }


}
