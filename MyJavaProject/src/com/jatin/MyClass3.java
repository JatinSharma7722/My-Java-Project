package com.jatin;
//Instance vs Staic Variable
public class MyClass3 {
      int a=10; //Instance Variable
      public static void main(String[] args) {
    	  MyClass3 obj1=new MyClass3();
    	  MyClass3 obj2= new MyClass3();
    	  
    	  System.out.println(obj1.a);
    	  System.out.println(obj2.a);
    	  
    	  obj1.a=20;
    	  System.out.println(obj1.a);
    	  System.out.println(obj2.a);
      }
}
