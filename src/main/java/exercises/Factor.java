package main.java.exercises;


import java.util.*;

public class Factor {
	public static long[] fact(int n)
    {   
		long a[] = new long[n+1];
        long res = 1; 
        int i=2;
        a[0] = 1;
        a[1] = 1;
        while(i<=n && res*(i+1)<= Integer.MAX_VALUE) {
            res *= i;
            a[i] = res;
            i++;
        }
        return a;
    }
}
