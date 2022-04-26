package com.jatin;

public class Employeethis {
	   int id;
	   String name;
	   float salary;
	   
	   Employeethis() {
		   this(101, "Jatin", 2000.0f);
	   }
	   
	   Employeethis(int id, String name, float salary){
		   this.id = id;
		   this.name = name;
		   this.salary = salary;
		   
		   this.displayEmployee();
	   }
	   
	   void displayEmployee(){
		   System.out.println("Employee Id : " + id);
		   System.out.println("Employee Name : " + name);
		   System.out.println("Employee Salary : " + salary);
	   }

}
