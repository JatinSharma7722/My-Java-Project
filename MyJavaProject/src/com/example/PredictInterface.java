package com.example;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredictInterface implements Predicate<String>{
    @Override
    public boolean test(String t) {
    	return t.length() > 5;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String arr[] = { "Chennai" ,"Pune","Goa","London","Reading"};
        PredictInterface b = new PredictInterface();
        Arrays.stream(arr).filter(b).forEach(System.out::println);
	}

}
