package main.java.exercises;
import java.io.*;

public class FileRead {
	public static String Filedis(String filename) throws IOException {
		  File file = new File("test.txt");
		  
		  BufferedReader br = new BufferedReader(new FileReader(file));
		 
		  String st = "";
		  while ((st = br.readLine()) != null)
		    System.out.println(st);
		  return st;
	}

}
