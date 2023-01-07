package javaproject;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _001arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraybasic() ;
	}
public static void arraydemo1() {
	Scanner in = new Scanner(System.in);
	System.out.println("ENTER NUMBER");
		int size = in.nextInt();
		int arr[]=new int[size];
		System.out.println("enter"+size+"of array");
		for(int i =0; i<arr.length; i++) {
			
		
			arr [i]=in.nextInt();
		}
			System.out.println(Arrays.toString(arr));
		}

	
public static void arraybasic() {
	int[]num=new int[5];//initilazatin and declirzation of aaray
	num[0]=10;
	num[1]=11;
	num[2]=12;
	num[3]=13;
	num[4]=14;

	for(int i=0;i<num.length; i++)
	//for (int i:num)
		
	{
		System.out.println(num[i]);
	}
}
public static void arr1() {
	int a[]= {10,12,11,13};//declaration, instantiation and initialization  
	for (int i=0; i<a.length; i++){
		System.out.println(a[i]);
	}
	}
public static void arr2() {
	
int a[]= {11,12,13,14};
for (int i:a) {
	System.out.println(i);//printing array using for-each loop  
}
}
}