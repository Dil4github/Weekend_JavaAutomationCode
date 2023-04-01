package com.automationcode_5thMar_2023;

public class SmallestBetweenDecimalNumbers {

	public static void main(String[] args) {

		double a = 10.01;
		double b = 10.10;
		double c = 10.11;
		double d = 10.12;
		
		if (a>b && a>c && a>d) {
			System.out.println("a is the greatest:"+a);		
		}else if (b>a && b>c && b>d) {
			System.out.println("b is the greatest:"+b);
		}else if (c>a && c>b && c>d) {
			System.out.println("c is the graetest:"+c);
		}else if (d>a &&d>b &&d>c) {
			System.out.println("d is the greatest:"+d);
	}
		if (a<b && a<c && a<d) {
			System.out.println("a is the smallest:"+a);		
		}else if (b<a && b<c && b<d) {
			System.out.println("b is the smallest:"+b);
		}else if (c<a && c<b && c<d) {
			System.out.println("c is the smallest:"+c);
		}else if (d<a && d<b && d<c) {
			System.out.println("d is the smallest:"+d);
		}
	}

}
