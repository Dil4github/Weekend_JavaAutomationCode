package com.javacode_5thMarch_2023;

public class MixAll {

	public static void main(String[] args) {

		int i=1; // i=1
		int j=--i;	//j=0; i=0
		int m=j++;
		int k= i++ - --i - --i + i++; 
		//		0- (1-1) - (0-1)	+ -1
		// 0-0- -1+-1
			//		1 		0		 -1 0
			// 0 			0		-1    -2 
		//    1

		
		System.out.println(m);//0
		System.out.println(i);//0
		System.out.println(j);//1
		System.out.println(k);//-1

		




		
		
		
	}

}
