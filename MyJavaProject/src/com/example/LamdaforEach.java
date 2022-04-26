package com.example;

import java.util.ArrayList;
import java.util.List;

public class LamdaforEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.forEach(e ->{
        	System.out.println(e);
        });
        list.forEach(e ->{
        	if(e % 2 == 0)
        		System.out.println(e);
        });
	}

}
