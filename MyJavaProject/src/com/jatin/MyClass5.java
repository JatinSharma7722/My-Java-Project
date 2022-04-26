package com.jatin;
//Types of Method
public class MyClass5 {
      void myMethod1() {
    	  System.out.println("Instance Method");
      }
      static void Method2() {
    	  System.out.println("Static Method");
      }
      public static void main(String[] args) {
    	  MyClass5 obj1 = new MyClass5();
    	  obj1.myMethod1();
    	  
    	  obj1.Method2();
    	  Method2();
    	  MyClass5.Method2();
      }
}
