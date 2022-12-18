package javaproject;

public class _012whiledemo {
public static void main(String[] args) {
	forloop3();
			
			}
public static void forloop3(){
	int j=0;
	 for(int i =0; i<5;i++) {
		 for( j=2*(5-i);j>=0;j--) {
			 System.out.print( " ");
		 }
		 for(j=0;j<=i;j++) {
			 System.out.print(" *");
		 }
		 System.out.println();
	 }
		}
}


