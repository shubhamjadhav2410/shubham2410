package javaproject;

import java.util.Scanner;

public class _004userinput {
public static void main(String[] args) {
	exm1();}
public static void userinput() {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int a=sc.nextInt();
	int b= sc.nextInt();
	 
	int res = a+b;
	System.out.println(res);
}
public static void exm1() {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
	int a =sc.nextInt();
	for(int i=1; i<=10; i++) {
		int table=a*i;
		System.out.println(table);
	}
}
	}


