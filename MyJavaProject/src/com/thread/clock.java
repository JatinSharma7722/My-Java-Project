package com.thread;

class bike{
	int speed = 90;
}
public class clock extends bike
{
	int speed = 120;
	public static void main(String args[])
	{
		bike obj= new clock();
		System.out.println((~3&6)|(3&~6));
	}
}