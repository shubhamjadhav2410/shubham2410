package javaproject;

import java.util.Scanner;

public class _010decisionmaking {
//static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
	 Scanner in =new Scanner(System.in);
	System.out.println("check signal");
	String checksignal = in.next();
	switch(checksignal.toLowerCase()) {
	case"green":
		System.out.println("go");
		break;
	case "red":
		System.out.println("stop");
		break;
	case "orange":
		System.out.println("be ready");
		break;
		default:
			System.out.println("be carefull");
	}
}
}