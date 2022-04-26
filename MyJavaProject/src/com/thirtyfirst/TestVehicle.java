package com.thirtyfirst;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Vehicle{
	void NoofEngine() {
		System.out.println("1");
	}
	void NoofWheels() {
		System.out.println("undefined");
	}
}
class Car extends Vehicle{
void NoofEngine() {
	System.out.println("1");
	}
	void NoofWheels() {
		System.out.println("4");
	}
}
