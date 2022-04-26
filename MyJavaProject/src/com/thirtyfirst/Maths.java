package com.thirtyfirst;

public class Maths {
     public static void main(String[]args) {
    	 Rectangle c1 = new Rectangle();
    	 c1.Special();
    	 c1.Sides();
    	 c1.closed();
    	 System.out.println("------------------");
    	 Equilateral c2 = new Equilateral();
    	 c2.Special();
    	 c2.Sides();
    	 c2.closed();
     }
}     
class Shapes{
    	 void closed(){
    		 System.out.println("I am a closed figure");
    	 }
     }
     class Triangle extends Shapes{
    	 void Sides() {
    		 System.out.println("I have three sides");
    	 }
     }
                class Equilateral extends Triangle{
    	                 void Special() {
    		                   System.out.println("All my sides are Equal");
    	 }
     }
     class Quadrilateral extends Shapes{
    	 void Sides() {
    	 System.out.println("I have four sides");
         }
     }
                class Rectangle extends Quadrilateral{
    	                 void Special() {
    		                  System.out.println("My opposite sides are Equal");
    	 }
     }
     class Square extends Quadrilateral{
    	 void Special() {
    		 System.out.println("All my sides are Equal");
    	 }
     }
