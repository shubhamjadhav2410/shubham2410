package javaproject;

public class _01string {

	public static void main(String[] args) {
		 createstring();
	}
public static void createstring() {
	  
	
	String a[]={"shubham@123456"};
	System.out.println(a.length());//length of array
	System.out.println(a.charAt(2));//index value
	System.out.println(a.formatted(null));//formatted string
	System.out.println(a.substring(3));
	System.out.println(a.substring(0, 3));
	System.out.println(a.subSequence(0, 3));
	System.out.println(a.substring(0, a.indexOf("@")));

	
}
}
