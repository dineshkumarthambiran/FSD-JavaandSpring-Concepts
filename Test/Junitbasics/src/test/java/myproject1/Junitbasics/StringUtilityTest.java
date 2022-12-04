package myproject1.Junitbasics;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringUtilityTest {
	
	StringUtility String1;
	
	@Before
	
	public void setup()
	{
		String1 = new StringUtility();
	}
	
	@After
	public void teardown()
	{
		String1=null;
	}

	@Test
	public void testStrLen() {
	
		int len = String1.strLen("Dinesh");
		assertEquals(6, len);
	}
	
	@Test(expected = NullPointerException.class)
	public void throwingexception() {
		String1.strLen(null);
	}
	

	@Test
	public void testConcat() {
		
		String res = String1.concat("dinesh", "kumar");
		assertEquals("dineshkumar", res);
	
	}

	@Test
	public void testIsStartswith() {
		boolean res = String1.isStartswith("dinesh", "d");
		assertTrue(res);
	}

	@Test
	public void testStrContains() {
		boolean res = String1.StrContains("dinesh", "d");
		assertTrue(res);
	}

}
