package testngdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*TestNG Annotations*/

public class AnnotationsTest {

	@BeforeSuite
	public void beforeSuiteMethod() {
		System.out.println("Before suite to be executed");
	}

	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("Before class to be executed");
	}

	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("Before test to be executed");
	}

	@BeforeMethod
	public void testngBeforeMethod() {
		System.out.println("Before test method to be executed");
	}
	@Test
	public void demo() {
		System.out.println("Hello");
	}

	@AfterMethod
	public void testngAfterMethod() {
		System.out.println("After test method to be executed");
	}

	@AfterTest
	public void afterTestMethod() {
		System.out.println("After test to be executed");
	}

	@AfterClass
	public void afterClassMethod() {
		System.out.println("After class to be executed");
	}

	@AfterSuite
	public void afterSuiteMethod() {
		System.out.println("After suite to be executed");
	}
}
