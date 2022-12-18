package javaproject;

import java.util.Scanner;

public class _006decisionmaking {

	public static void main(String[] args) {result();
	
		// TODO Auto-generated method stub
	}
public static void result() {
	Scanner in= new Scanner(System.in);
	System.out.println("ENTER MARKS");
	int subject1=in.nextInt();
	int subject2=in.nextInt();
	int subject3=in.nextInt();
	int percentage = (subject1 +subject2 +subject3 )/3;
		
	
	if (percentage>91) {
		System.out.println("grade A+");
		System.out.println(percentage);
	}
	else if(percentage>81) {
		System.out.println("grade A");
		System.out.println(percentage);
	}
	else if(percentage>71) {
		System.out.println("grade b");
		System.out.println(percentage);
	}
	else if(percentage>61) {
		System.out.println("grade b+");
		System.out.println(percentage);
	}
	else if(percentage>51) {
		System.out.println("grade C+");
		System.out.println(percentage);
	}
	else if(percentage>41) {
		System.out.println("grade C");
		System.out.println(percentage);
		
	}
	else {
		System.out.println("fail");
		System.out.println(percentage);
	}
}
}