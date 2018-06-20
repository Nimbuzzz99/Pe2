package main.java.exercises;
import java.util.*;

public class Palindrome {

	public static String[] palin(int num) {
      int r,a=0,temp;    
      temp=num;  
      while(num>0){    
	       r=num%10; 
	       a = a * 10 + r;
	       num=num/10;    
	      }
      String str[] = new String[2];
      str[0] = Integer.toString(a);
      if(temp == a){
    	  str[1] = "true";
      }
      else {
    	  str[1] = "false";
      }
      return str;
	}
	
	public static String[] palin(String str) {
         String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        String str1[] = new String[2];
        str1[0] = reverse;
	      if(reverse.equals(str)){
	    	  str1[1] = "true";
	      }
	      else {
	    	  str1[1] = "false";
	      }
	      return str1;
		}
	 
}
