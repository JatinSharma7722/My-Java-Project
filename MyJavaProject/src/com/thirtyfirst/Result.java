package com.thirtyfirst;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------------------Students Detail---------------------");
		Exam obj = new Exam();
		obj.getDetails();
		System.out.println("========================Student Data===================");
		obj.Student();
		System.out.println("========================Marks Details==================");
		obj.Grade();
	}

}
class Student{
	int Rollno,Semester;
	String Name ,Course;
	int arr[] = new int[5];
	Scanner sc =new Scanner(System.in);
	void getDetails() {
		System.out.println("Roll No :");
		Rollno =sc.nextInt();
		System.out.println("Name :");
		Name=sc.next();
		System.out.println("Course :");
		Course=sc.next();
		System.out.println("Semester :");
		Semester=sc.nextInt();
		System.out.println("----------------------------Marks for Subjects-------------------");
		for(int i=0;i<5;i++) {
			System.out.println("Subject"+(i+1));
			arr[i]=sc.nextInt();
		}
	}
}


class Exam extends Student{
	void Student() {
		System.out.println("Roll No :"+Rollno);
		System.out.println("Name :"+Name);
		System.out.println("Course :"+Course);
		System.out.println("Semester:"+Semester);
	}
	void Grade() {
		int Total=0;
		for(int i=0;i<5;i++) {
			System.out.println("Marks for Subject "+(i+1)+"                 :"+arr[i]);
			Total=Total+arr[i];
		}
		System.out.println("Total                                  :"+Total);
		float Percentage=Total/5;
		System.out.println("Percentage                             :"+Percentage);
		String Grade="";
		if(Percentage>=70) {
			Grade="A";
		}
		else if(Percentage>=60) {
			Grade="B";
		}
		else if(Percentage>=50) {
			Grade="C";
		}
		else if(Percentage>=40) {
			Grade="D";
		}
		else if (Percentage<40) {
			Grade="F";
		}
		System.out.println("Grade                                    "+Grade);
		
	}
}
