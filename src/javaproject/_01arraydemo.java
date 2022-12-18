package javaproject;

import java.util.Arrays;
import java.util.Scanner;

public class _01arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
tarray();
	}
	public static void arraydemo() {
	char a[]= {'a','b','s','h','u','m'};
		char b[]=new char[3]	;
		System.arraycopy(a, 02, b, 0, 03);
		System.out.println(String.copyValueOf(b));
	}
	public static void tarray() {
		int a[] []= {{1,2,3},{4,5,6}};
		int b [][]= {{1,2,3},{4,5,6}};
		int c[][]=new int[2][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"");
		}
			System.out.println();
		}
	}
}

