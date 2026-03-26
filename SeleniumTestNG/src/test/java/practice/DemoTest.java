package practice;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import GenericUtility.BaseClass1;

public class DemoTest extends BaseClass1{
	@Test(priority = 0)
	public void login(Method m1) {
		System.out.println("Executing:-"+ m1);
	}
	@Test(dependsOnMethods = "login")
	public void addEmployee(Method m2) {
		System.out.println("Executing:-"+ m2);
	}
	@Test(dependsOnMethods = "login")
	public void logOut(Method m3) {
		System.out.println("Executing:-"+ m3);
	}

}
