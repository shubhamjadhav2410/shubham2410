package javaproject;

public class variable2 {
	

public static void  main(String[] args) 
{
	ternaryoperator();
}
public static void operator1(){
	
	int a=10;
int b=13;
System.out.println((a>b)&&(a<b));
System.out.println((a>b)|| (a<b));
}
	
public static void  ternaryoperator() {
	int a=13;
	int b=20;
	int result=(a<b)?(a+b):(a*b);
	System.out.println(result);
}
}

