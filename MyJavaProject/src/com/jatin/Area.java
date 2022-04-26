package com.jatin;

import java.util.Scanner;

public class Area {
      static int setDim(){
    	  Scanner sc =new Scanner(System.in);
    	  System.out.println("Enter the length");
    	  int len = sc.nextInt();
    	  return len;
    	  }
      static int setDim2(){
    	  Scanner sc =new Scanner(System.in);
    	  System.out.println("Enter the breadth");
    	  int br = sc.nextInt();
    	  return br;
    	  }
      static float getArea(int l,int b){
    	  float ar=l*b;
    	  return ar;
      }
      public static void main(String[]args) {
    	  int ar[]=new int[2];
    	  ar[0] = setDim();
    	  ar[1] = setDim2();
    	  float a=getArea(ar[0],ar[1]);
    	  System.out.println("Area of the rectangle is "+a +"sq.");
      }
}
class dim {
	void rt(int l,int b) {
		
	}
}
