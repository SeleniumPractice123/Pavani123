package testngconcepts;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	
	/**
	 * Pre and Post Condtion
	 */
	
	@BeforeSuite
	public void first() {
		
		System.out.println("1");
	}
	
	@BeforeTest
	public void second() {
		System.out.println("2");
	}
	
	@BeforeClass
	public void third() {
		System.out.println("3");
	}
	
	@BeforeMethod
	public void four() {
		System.out.println("4");
	}
	
	@Test(priority = 1,description = "Login")
	public void login() {
		System.out.println("Test Case 1");
		Assert.fail("depended method shouldn't be execute");
	}
	
	@Test(priority = 2,description = "Logout",dependsOnMethods = "login")
	public void registration() {
		System.out.println("Test Case 2");
	}
	
	
	@AfterMethod
	public void five() {
		System.out.println("5");
	}
	
	@AfterClass
	public void six() {
		System.out.println("6");
	}
	
	@AfterTest
	public void seven() {
		System.out.println("7");
	}
	
	
	@AfterSuite
	public void eight() {
		System.out.println("8");
	}
	
}
