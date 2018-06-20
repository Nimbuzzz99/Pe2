package test.java.exercisestest;

import static org.junit.Assert.*;
import main.java.exercises.*;
import org.junit.Test;

public class IsEvenTest {

	@Test
	public void testEven() {
		assertEquals(true , IsEven.even(16));
		assertEquals(false , IsEven.even(21));
	}

}
