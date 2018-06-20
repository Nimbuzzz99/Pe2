package test.java.exercisestest;

import static org.junit.Assert.*;
import main.java.exercises.*;
import org.junit.Test;

public class MemberTest {

	@Test
	public void test() {
     assertEquals(new String[] {"sharoon", "22" , "1000000"},MemberVar.check("sharoon", 22 , 1000000));
     assertEquals(new String[] {"booo", "22" , "1000000"},MemberVar.check("booo", 22 , 1000000));
	}

}
