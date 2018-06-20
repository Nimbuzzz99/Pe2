package main.java.exercises;

import java.util.Arrays;

public class Students {
    public static int[] stu(int[] a) {
    	int avg = avg(a);
    	int min = min(a);
    	int max = max(a);
    	int total[] = new int[3];
    	total[0] = avg;
    	total[1] = min;
    	total[2] = max;
    	return total;
    }
    public static int avg(int []b) {
    	int sum = 0;
    	for(int val:b) {
    		sum+=val;
    	}
    	return (int)(sum/b.length);
    }
    public static int min(int []b) {
    	Arrays.sort(b);
    	return b[0];
    }
    public static int max(int []b) {
    	Arrays.sort(b);
    	return b[b.length-1];
    }
}
