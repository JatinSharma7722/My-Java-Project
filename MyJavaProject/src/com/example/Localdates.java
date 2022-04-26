package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Localdates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalDateTime Today = LocalDateTime.now();
	        System.out.println(Today);
	        
	        LocalDate Today1 = LocalDate.now();
	        System.out.println(Today1);
	        
	        LocalTime Today2 = LocalTime.now();
	        System.out.println(Today2);
	}

}
