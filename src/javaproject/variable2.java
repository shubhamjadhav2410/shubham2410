package javaproject;

public class variable2 {
	

public static void  main(String[] args) 
{
	 exm3();
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
public static void exm1(){
	int a = -5+8*6;
	double b=(55+9)/9;
	double c=20+-3*5/8;
	double d=5+15/3*2-8%3;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	
}
public static void exm2() {
	int a=10;
	float b=a;            //variable widening
	System.out.println(a);
	System.out.println(b);
	
}
public static void exm3() {
	float a=10.05f;     
	int b=(int)a;           //variable typecasting
	System.out.println(b);
}
}

