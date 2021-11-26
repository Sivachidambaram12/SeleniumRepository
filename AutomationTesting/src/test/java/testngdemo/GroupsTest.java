package testngdemo;

import org.testng.annotations.Test;

/*TestNG Groups*/

public class GroupsTest {

	@Test(groups = "A")
	public void func1() {
		System.out.println("s1");
	}

	@Test(groups = {"A", "B"})
	public void func2() {
		System.out.println("s2");
	}

	@Test(groups = "B")
	public void func3() {
		System.out.println("s3");
	}

}
