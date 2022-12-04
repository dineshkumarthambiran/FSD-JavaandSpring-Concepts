package myproject1.Junitbasics;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	
	BasicCalculator cal ;
	
	@Before
	public void setup()
	{
		cal = new BasicCalculator();
		System.out.println("before is executed");
	}
	
		
	@Test
	public void testAdd()
	{
		int res = cal.add(100, 100);
		System.out.println("add is executed");
//		Assertion
		assertEquals(200, res);
	}

	@Test
	public void testSub() {
		int res = cal.sub(100, 100);
		System.out.println("sub is executed");
//		Assertion
		assertEquals(0, res);
		
	}
	
	@After
	public void teardown() {
		cal =null;
		System.out.println("after is executed");
	}

}
