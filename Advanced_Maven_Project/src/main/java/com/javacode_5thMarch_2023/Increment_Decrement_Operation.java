package com.javacode_5thMarch_2023;

public class Increment_Decrement_Operation {

	public static void main(String[] args) {
		
		int i=10; //latest value of i is 10
		i++;
		System.out.println(i); //11
		int j=i++;
		System.out.println(j); //11
		System.out.println(i); //10
		
		j=i++ + i++;
		
		System.out.println(j); //22
		System.out.println(i); //13
		
	}

}
