package javaproject;

import java.util.Scanner;

public class _008decisionmaking {

	public static void main(String[] args) {
		revenue();
		// TODO Auto-generated method stub

	}
public static void revenue() {
	Scanner in =new Scanner(System.in);
	System.out.println("BILL");
	int price =in.nextInt();
	int quanity=in.nextInt();
	int revenue=price*quanity;
	int discount=revenue*10/100;
	
	if(revenue>5000) {
		
		System.out.println(revenue-discount);
		
	}
	else {
		System.out.println(revenue);
	}
}
}
