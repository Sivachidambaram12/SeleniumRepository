package testngdemo;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*TestNG Assertions and Data Provider*/

public class CalculatorTest {

	String str = "Automation";

	String str1 = "Automate";

	Calculator cal = new Calculator();

	SoftAssert soft = new SoftAssert();

	@Test
	public void testadd() {
		Assert.assertEquals(10, cal.add1(5, 5));	
	}

	@Test
	public void testsub() {
		Assert.assertEquals(3, cal.sub1(6, 3), "This is an assertion error");
	}

	@Test
	public void testadd1() {
		Assert.assertNotEquals(5, cal.add1(3, 3), "This is an assertion error");
	}

	@Test
	public void testsub1() {
		Assert.assertNotEquals(4, cal.sub1(10, 5));
	}

	@Test
	public void checkBoolean() {
		boolean bool = true, bool1 = true;
		Assert.assertTrue(bool==bool1);
	}

	@Test
	public void checkBoolean1() {
		boolean bool = true, bool1 = false;
		Assert.assertFalse(bool==bool1);
	}

	@Test
	public void testSoftAssertion() {
		soft.assertTrue(str==str1, "This is an assertion error");
		soft.assertFalse(str==str1);
		soft.assertEquals(str, str1, "This is an assertion error");
		soft.assertNotEquals(str, str1);

	}

	@Test(dataProvider = "addition")
	public void testadd2(int exp, int a, int b) {
		Assert.assertEquals(exp, cal.add1(a, b));
	}

	@DataProvider(name = "addition")
	public Object[][] getData(){
		return new Object[][] {{10,5,5},{20,15,5}};
	}

	@Test(dataProvider = "subtraction")
	public void testsub2(int exp, int a , int b) {
		soft.assertEquals(exp, cal.sub1(a, b));
	}

	@DataProvider(name = "subtraction")
	public Object[][] getData1(){
		return new Object[][] {{4,7,3},{3,9,6}};
	}

}
