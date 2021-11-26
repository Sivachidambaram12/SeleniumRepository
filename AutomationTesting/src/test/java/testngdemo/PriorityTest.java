package testngdemo;

import org.testng.annotations.Test;

/*TestNG Priority*/

public class PriorityTest {

	@Test(priority = 1)
	public void print() {
		System.out.println("s2");
	}

	@Test(priority = -1)
	public void test() {
		System.out.println("s3");
	}

	@Test(priority = 0)
	public void display() {
		System.out.println("s4");
	}

}
