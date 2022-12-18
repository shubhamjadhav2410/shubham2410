package javaproject;

public class Variable1{
String name;
static String coursename;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

String name="shubham";

Variable1 obj1= new Variable1();
Variable1 obj2= new Variable1();
obj1.name ="shubham";
coursename="selenium";

obj2.name="amit";
obj1.name="rahul";
coursename="java";
System.out.println(obj1.name);
System.out.println(coursename);
System.out.println(obj2.name);
System.out.println(coursename);
}
}
