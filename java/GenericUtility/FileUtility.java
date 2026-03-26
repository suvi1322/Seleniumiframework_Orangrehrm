package GenericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	Properties prop;
	FileInputStream fis;
	FileOutputStream fos;
	//Read
	public String getPropertyKeyValue(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/Orangehrm_CommonData/commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
		
		}
	//Write
	public void setPorpertyPair(String key,String value) throws IOException {
		prop=new Properties();
		fos=new FileOutputStream("./src/test/resources/Orangehrm_CommonData/commondata.properties");
		prop.setProperty(key, value);
		prop.store(fos, "Updated common data");
		fos.close();
		
	}
	

}
