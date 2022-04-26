package com.jatin;
//Types of variables
public class MyClass2 {
        static int b=20;//Static or class Variable
        int c=30; //Instance or Object Variable
public static void main(String[] args) {
	int a =10; //Local Variable
	System.out.println("Local Variable :"+a);
	MyClass2 obj = new MyClass2();
	System.out.println("Instance Variable : " + obj.c);
    
    System.out.println("Static Variable : " + b);
    System.out.println("Static Variable : " + obj.b);
    System.out.println("Static Variable : " + MyClass2.b);

}
}