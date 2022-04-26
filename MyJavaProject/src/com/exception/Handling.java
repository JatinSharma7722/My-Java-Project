package com.exception;

import java.util.*;

public class Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     int a =sc.nextInt();
     try {
    	 System.out.println(12/a);
     }
     catch(ArithmeticException e){
        System.out.println("A number can not be divided by zero");    	 
     }
	}

}
