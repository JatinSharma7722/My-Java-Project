package com.interface_abstract;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Paid obj =new Net();
        System.out.println("===============Salary Details==========");
        System.out.println("Manager               :"+obj.Manager);
        System.out.println("Developer             :"+obj.Developer);
        System.out.println("Tester                :"+obj.Tester);
	}

}
interface Salary{
	float basic=20000;
}
abstract class Paid implements Salary{
	float Manager= basic+20000;
	float Developer =basic+10000;
	float Tester =basic +5000;
}
class Net extends Paid{
	
}