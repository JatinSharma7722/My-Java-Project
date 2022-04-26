package com.jatin;

public class Employee {
        int id;
        String name;
        float salary;
        Employee(int id,String name,float salary){
        	this.id=id;
        	this.name=name;
        	this.salary=salary;
        }
        void displayEmployee() {
        	System.out.println("Employee id :"+id);
        	System.out.println("Employee name :"+name);
        	System.out.println("Employee salary :"+salary);
        }
}
