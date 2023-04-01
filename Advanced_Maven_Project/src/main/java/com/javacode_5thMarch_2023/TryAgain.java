package com.javacode_5thMarch_2023;

public class TryAgain {

	public static void main(String[] args) {

		int i=1;
		int j= --i;
		int k = i++ - --i + i++;
		//		0-(1-1)+0
		int l = j++ + ++k + --i -i--;
			// 0+(1+0)+(1-1) -0
		
		System.out.println(i); //-1
		System.out.println(j); //1
		System.out.println(k);//1
		System.out.println(l);//1
	}

}
