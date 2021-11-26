package testngdemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*TestNG dependonMethods, enabled = false, Synchronisation point and Exception Handling*/

public class FeaturesTest {

	@Test
	public void first() {
		System.out.println("Hello");
	}

	@Test(dependsOnMethods = "first")
	public void second() {
		System.out.println("World");
	}

	@Test
	public void demo() {
		System.out.println("s1");
	}

	@Test(enabled = false)
	public void display() {
		System.out.println("s4");
	}

	@Test(timeOut = 10000)
	public void display1() {
		System.out.println("s5");
	}

	@Test(enabled = false, expectedExceptions = ArithmeticException.class)
	public void modulo() {
		int a = 10, b = 0, c = 0;
		c = a%b;
		System.out.println("The modulus is:"+c);
	}

	@Test @Parameters("empname")
	public void param_test(String empname) {
		System.out.println("Parameter is "+empname);
	}

}