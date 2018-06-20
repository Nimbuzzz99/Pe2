package test.java.exercisestest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.exercises.Students;

public class StudentsTest {

	@Test
	public void test() {
		int [] a = new int[]{86,65,98,77};
		int [] act = Students.stu(a);
		int [] exp = new int[]{81, 65, 98};
		assertEquals(exp[0],act[0]);
		assertEquals(exp[1],act[1]);
		assertEquals(exp[2],act[2]);
	}

}
