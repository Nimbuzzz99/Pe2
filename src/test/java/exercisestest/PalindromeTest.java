package test.java.exercisestest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import main.java.exercises.*;

public class PalindromeTest {
    
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		
	}
	@SuppressWarnings("deprecation")
	@Test
	public void testPalin() {
		assertEquals(new String[]{"121","true"} , Palindrome.palin(121));
		assertEquals(new String[]{"12345","false"} , Palindrome.palin(54321));
		assertEquals(new String[]{"madam","true"} , Palindrome.palin("madam"));
	}

}
