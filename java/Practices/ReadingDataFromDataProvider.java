package Practices;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadingDataFromDataProvider {
	@DataProvider(name="KeyvalueData")
	Object[][] getdata(){
		return new Object[][] {
			{"Browser","Chrome","1"},
			{"username","Admin","2"},
			{"password","admin123","3"}
		};
		
	}
	@DataProvider(name="KeyvalueData1")
	Object[][] getdata1(){
		return new Object[][] {
			{"Browser","firefox","1"},
			{"username","Admin","2"},
			{"password","admin123","3"}
		};
	}
	@Test(dataProvider="KeyvalueData1")
	public void readingFromDataProvider(String key,String value,String Data) {
		System.out.println("My key is "+ key + " ==========> My value is " + value+" =========> My Data is "+Data);
		
	}

}
