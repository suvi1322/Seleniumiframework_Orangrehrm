package practice;

import org.testng.annotations.Test;

public class TesPrectice {
	@Test
	public void Login() {
		System.out.println("----Executing----");
	}
	@Test(dependsOnMethods="Login")
	public void logout() {
		System.out.println("--executing method2--");
	}

}
