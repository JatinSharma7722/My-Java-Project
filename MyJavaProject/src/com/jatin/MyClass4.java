package com.jatin;
//Instance vs Static Variable
public class MyClass4 {
	static int a=10; //Static Variable
    public static void main(String[] args) {
  	  MyClass4 obj1=new MyClass4();
  	  MyClass4 obj2= new MyClass4();
  	  
  	  System.out.println(obj1.a);
  	  System.out.println(obj2.a);
  	  
  	  obj1.a=20;
  	  System.out.println(obj1.a);
  	  System.out.println(obj2.a);
    }
}
