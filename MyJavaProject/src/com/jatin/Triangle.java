package com.jatin;

public class Triangle{
	int s1;
	int s2;
	int s3;
	float ar;
        Triangle(){
        	this(3,4,5);
        }
        public Triangle(int s1,int s2,int s3){
        	this.s1=s1;
        	this.s2=s2;
        	this.s3=s3;
        	this.ar=s1+s2+s3;
        }
       void display(float ar) {
    	   System.out.println("Perimeter of the triangle is:"+ar);
       }
}
