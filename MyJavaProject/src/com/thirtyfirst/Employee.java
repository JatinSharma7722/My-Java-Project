package com.thirtyfirst;

import java.util.*;
import java.math.*;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncomeTax obj = new IncomeTax();
		obj.input();
		obj.input_basic();
		obj.Calculate();
		System.out.println("=============================Employee Details=============================");
		obj.display();
		System.out.println("\n");
		obj.show_detail();
		System.out.println("\n");
		obj.calTax();
	}

}
class Emp {
	String Empid;
    String Name;
	String desig;
	int age;
	Scanner sc=new Scanner(System.in);
   void input(){
	   System.out.println("Enter the Employee Id");
	   Empid=sc.next();
	   System.out.println("Enter the Employee Name");
	   Name=sc.next();
	   System.out.println("Enter the Employee Designation");
	   desig=sc.next();
	   System.out.println("Enter the Employee Age");
	   age=sc.nextInt();
       }
   void display(){
	   System.out.println("Employee Id              :"+Empid);
	   System.out.println("Employee Name            :"+Name);
	   System.out.println("Employee Designation     :"+desig);
	   System.out.println("Employee Age             :"+age);
    }
}


class Salary extends Emp{
     float basic;
      float DA, TA, PF,HRA, NetSal, Gross;
      void input_basic(){
    	 System.out.println("Enter the Basic Salary");
    	 basic=sc.nextInt();
         }
     void Calculate(){
    	 DA=(10*basic)/100;
    	 TA=(10*basic)/100;
    	 PF=(12*basic)/100;
    	 HRA=(40*basic)/100;
    	 Gross= basic+HRA+DA+TA;
    	 NetSal=Gross-PF;
		  }
     void show_detail(){
    	 System.out.println("Basic Salary              :"+basic);
    	 System.out.println("DA                        :"+DA);
    	 System.out.println("TA                        :"+TA);
    	 System.out.println("PF                        :"+PF);
    	 System.out.println("HRA                       :"+HRA);
    	 System.out.println("Gross Salary              :"+Gross);
    	 System.out.println("Net Salary                :"+NetSal);
      }			   

}

class IncomeTax extends Salary{
      float AnualSalary;
      int tax;
	  void calTax(){
			 AnualSalary=NetSal*12;
			 int tax=0;
			    if(AnualSalary<=50000) {
			    	tax=0;
			    }
			    else if(AnualSalary<=1000000) {
			    	tax=10;
			    }
			    else if(AnualSalary<=1500000) {
			    	tax=15;
			    }
			    else if(AnualSalary<=2000000) {
			    	tax=20;
			    }
			    else if(AnualSalary>2000000) {
			    	tax=45;
			    }
               System.out.println("Tax                        :"+tax+"%");
		}
}
