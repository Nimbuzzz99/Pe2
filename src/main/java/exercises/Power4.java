package main.java.exercises;

public class Power4 {
     public static boolean four(int n) {
         while(n != 1)
         { 
             if(n % 4 != 0)
             return false;
             n = n / 4;     
         }
    	 return true;
     }
}
