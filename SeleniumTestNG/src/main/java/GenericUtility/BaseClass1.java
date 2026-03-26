package GenericUtility;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass1 {

    @BeforeSuite
    public void beforeSuite() {
    	System.out.println("Executing BeforeSuite");
    	
    }
    @BeforeTest
    public void beforeTest() {
    	System.out.println("Executing BeforeSuite");
    	
    }
    @BeforeClass
    public void beforeClass() {
    	System.out.println("Executing BeforeClass");
    	
    }
    @BeforeMethod
    public void beforeMethod(Method m) {
    	System.out.println("Executing BeforeClass:-"+ m);
    	
    }
    @AfterMethod
    public void afterMethod(Method m1) {
    	System.out.println("Executing AfterMethod:-"+ m1);
    	
    }
    @AfterClass
    public void afterClass() {
    	System.out.println("Executing Afterclass");
    	
    }
    @AfterTest
    public void afterTest() {
    	System.out.println("Executing AfterTest");
    	
    }
    @AfterSuite
    public void afterSuite() {
    	System.out.println("Executing AfterSuite");
    	
    }
  
    
   
}
