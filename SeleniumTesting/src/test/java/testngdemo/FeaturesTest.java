package testngdemo;

import org.testng.annotations.Test;

public class FeaturesTest {
	
	@Test
	public void first() {
		System.out.println("Hello");
	}
	
	@Test(dependsOnMethods = "first")
	public void second() {
		System.out.println("World");
	}
	
	@Test(enabled=false)
		public void demo() {
		System.out.println("Ignore Test");
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void demo1() {
	int a=10, b=0, c=0;
	c=a/b;
	System.out.println("The division is"+c);
	}
	
	@Test(timeOut=10000)
	public void demo2() {
		System.out.println("Timeout Test");
	}
	
	@Test(priority=0)
	public void demo3() {
		System.out.println("Priority=0");
	}
	
	@Test(priority=1)
	public void demo4() {
		System.out.println("Priority=1");
	}
	
	@Test(priority=-1)
	public void demo5() {
		System.out.println("Priority=-1");
	}
}
