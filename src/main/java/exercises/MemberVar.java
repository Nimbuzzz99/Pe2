package main.java.exercises;

public class MemberVar {
		public static String[] check(String n, int a , int s) {
		Member obj = new Member();
		obj.setvar(n,a,s); 
		String str[] = new String[3];
		str[0] = obj.Name;
		str[1] = Integer.toString(obj.age);
		str[2] = Long.toString(obj.salary);
		return str;
	}
}
