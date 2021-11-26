package junitdemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/*JUnit Annotations and Assertions*/

public class CalculatorTest {

	Calculator cal = new Calculator();

	@BeforeClass
	public static void beforeClassMethod() {
		System.out.println("Execution Start");
	}

	@AfterClass
	public static void afterClassMethod() {
		System.out.println("Execution End");
	}

	@Before
	public void beforeMethod() {
		System.out.println("Calculation Start");
	}

	@After
	public void afterMethod() {
		System.out.println("Calculation End");
	}

	@Test
	public void testAdd() {
		assertEquals(cal.add(3, 3), 6);
		System.out.println("Addition");
	}

	@Test
	public void testSub() {
		assertEquals(cal.sub(3, 2), 1);
		System.out.println("Subtraction");
	}

	/*Identical Assert Methods*/
	@Test 
	public void testAdd1() {
		assertSame(cal.add(3, 3), 6);
		System.out.println("Addition1");
	}

	@Test 
	public void testSub1() {
		assertSame(cal.sub(3, 3), 0);
		System.out.println("Subtraction1");
	}

	@Test
	public void testAdd2() {
		assertNotSame(cal.add(3, 3), 7);
		System.out.println("Addition2");
	}

	@Test
	public void testSub2() {
		assertNotSame(cal.sub(3, 2), 2);
		System.out.println("Subtraction2");
	}

	/*Null Object Assert Methods*/
	@Ignore
	@Test
	public void check() {
		assertNull(cal);
		System.out.println("check");
	}

	@Test 
	public void check1() {
		assertNotNull(cal);
		System.out.println("check1");
	}


}
