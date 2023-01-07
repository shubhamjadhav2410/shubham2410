package javaproject;

import java.util.Scanner;

public class _011loopstatements {
	public static void main(String[] args) {
		forloop2();
	}

	private static void forloop() {
	
		for(int i=1; i<=4; i++) {
			//number fo columns
			for(int j=1; j<=i; j++ ) {
				System.out.print("*" );      
				
			}
			System.out.println();
		}
	
		}	
	public static void forloop1(){
		
		for(int i=4;i<=1;i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		}
	public static void forloop2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int i=sc.nextInt();
		int n=0;
		for(  ;i!=0; i/=10,n++) {
			
			
		}
		System.out.println(n);
	}
	public static void noofDigit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int i=sc.nextInt();
		int n=0;
		while(i!=0) {
			n++;
			i /=10;
			
		}
		System.out.println(n);
	}
	public static void whileloop() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int i=0;
		while(num!=0) {
			num/=10;
			i++;
		}
		System.out.println(i);
	}
	}


