package com.example;

import java.util.List;
import java.util.function.Consumer;
import java.util.ArrayList;

public class ConsumerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Consumer<Integer> cl = i -> {
        	if(i%2 == 0)
        		System.out.println(i);
        };
        List<Integer> li = new ArrayList<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.forEach(n -> cl.accept(n));
	}

}
