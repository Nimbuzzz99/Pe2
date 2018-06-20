package test.java.exercisestest;

import static org.junit.Assert.*;
import main.java.exercises.*;
import org.junit.Test;

public class Power4Test {
	
	@Test
	public void test() {
       assertEquals(true , Power4.four(64));
       assertEquals(true , Power4.four(256));
       assertEquals(false , Power4.four(100));
	}

}
