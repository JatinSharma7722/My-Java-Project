package com.thirtyfirst;

public class Clothes {

	public static void main(String[] args) {
		 Shirt c1 = new Shirt();
    	 c1.Example();
    	 c1.Special();
    	 c1.Property();
    	 System.out.println("------------------");
    	 Pant c2 = new Pant();
    	 c2.Example();
    	 c2.Special();
    	 c2.Property();
	}

}
class Cloth{
	void Property() {
		System.out.println("Anything weared by a person");
	}
}
class UpperWear extends Cloth{
	void Special() {
		System.out.println("Anything weared on upper body by a person");
}
}
         class Shirt extends UpperWear{
        	 void Example() {
        			System.out.println("Shirt is an example of Upper body cloth ");
         }
         }
class LowerWear extends Cloth{
	void Special() {
		System.out.println("Anything weared on lower body by a person");
}
}
         class Pant extends LowerWear{
        	 void Example() {
     			System.out.println("Pant is an example of Lower body cloth ");
         }
         }
