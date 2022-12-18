package javaproject;

import java.util.Scanner;

public class _007decisionmaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number();
	}
public static void Number() {
	Scanner in =new Scanner(System.in);
	System.out.println("enter number");
	
	int Number =in.nextInt();
	if (Number%2==0) {
		System.out.println("number is even");
	}
	else {
		System.out.println("number is odd");
	}
}
}
