package com.thirtyfirst;

public class TestAnimals {

	public static void main(String[] args) {
       Dogs c1 = new Dogs();
       c1.Legs();
       Humans c2= new Humans();
       c2.Legs();
       Animals c3 = new Animals();
       c3.Legs();
	}

}
class Animals{
    void Legs() {
    	System.out.println("I have legs");
    }
}
class Dogs extends Animals{
	void Legs() {
		System.out.println("I have four legs");
	}
}
class Humans extends Animals{
	void Legs() {
		System.out.println("I have two legs");
	}
}
