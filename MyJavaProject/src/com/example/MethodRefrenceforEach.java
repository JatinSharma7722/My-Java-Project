package com.example;

import java.util.ArrayList;
import java.util.List;
public class MethodRefrenceforEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        
        list.forEach(System.out::println);
	}

}
