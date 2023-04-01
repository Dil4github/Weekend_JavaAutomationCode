package com.javacode_26thMar_2023;

public class MethodsInJava {

	public static void main(String[] args) {
		System.out.println("This is the main method.");
		hello();
		int sumAgain = sample(10, 20, 30);
	}
	public static int sample (int i, int j) {
		i=10;
		j=20;
		int k=30;
		
		int sum=i+j+k;
		System.out.println(sum);
		return sum;
		
	}
	
	public static String test(String S1, String S2) {
		
		String S3=S1+S2;
		return S3;
	}
	
	public static void hello() {
		System.out.println("This is hello method.");
	}
}
