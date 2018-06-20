package test.java.exercisestest;

import static org.junit.Assert.*;
import main.java.exercises.*;
import org.junit.Test;

public class FactorTest {

	@Test
	public void testFact() {
		long exp[] = {1,1,2};
		long act[] = Factor.fact(2);
		assertEquals(exp[0] , act[0]);
		assertEquals(exp[1] , act[1]);
	}

}
