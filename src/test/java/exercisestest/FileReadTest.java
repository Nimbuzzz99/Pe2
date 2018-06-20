package test.java.exercisestest;

import static org.junit.Assert.*;

import java.io.IOException;

import main.java.exercises.*;
import org.junit.Test;

public class FileReadTest {

	@Test
	public void testFiledis() throws IOException {
		assertEquals("HEY!WHO ARE YOU." , FileRead.Filedis("/home/user/eclipse-workspace/PE2/src/test/java/exercisestest/test.txt"));
	}

}
