package com.javacode_5thMarch_2023;

public class Post_increment {

	public static void main(String[] args) {
		

		// variable is i which is before ++
		// ++ is coming after i. So ++ is post variable.
		
		//post increment operator
		int i=1;
		i++; //this is uni-body 1+1=2
		System.out.println(i); //2
		
		int j=i++; //1+1=2
		System.out.println(j); //2
		System.out.println(i); //2+1=3
		
		j=i++ + i++;
// 
		System.out.println(i);
		System.out.println(j);
		
		j=i+++i+++i+++i++;
		System.out.println(j);
		System.out.println(i);

	}

}
