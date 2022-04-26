package com.example;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x = 4;
        Function<Integer , Integer> fn = (num) -> (x*x);
        System.out.println(fn.apply(x));
        String s = "Jatin";
        Function<String , Integer> fn2 = (s1) ->s1.length();
        System.out.println(fn2.apply(s));
	}

}
