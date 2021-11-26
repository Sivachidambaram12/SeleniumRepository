package junitdemo;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/*JUnit Exception Handling, Synchronisation point and Assertions*/

public class Test1 {

	@Test(expected = ArithmeticException.class)
	public void demo() {
		int a = 10, b = 0, c = 0;
		c = a % b;
		System.out.println("The modulus is: "+c);
	}

	@Test(timeout = 10000)
	public void demo1() {
		System.out.println("Timeout Demo");
	}

	/*Boolean Assert Methods*/
	@Test
	public void checkBoolean() {
		boolean bool = true, bool1 = true;
		assertTrue(bool==bool1);
		System.out.println("Check Boolean");
	}

	@Test
	public void checkBoolean1() {
		boolean bool = true, bool1 = false;
		assertFalse(bool==bool1);
		System.out.println("Check Boolean1");
	}

	@Test
	public void checkArray() {
		int[] arr = {10, 20, 30};
		int[] arr1 = {10, 20, 30};
		assertEquals(arr[2], arr1[2]);
		System.out.println("Check Array");
	}

	@Test
	public void checkArray1() {
		int[] arr = {10, 20, 30};
		int[] arr1 = {10, 20, 30};
		assertArrayEquals(arr, arr1);
		System.out.println("Check Array1");
	}
}
