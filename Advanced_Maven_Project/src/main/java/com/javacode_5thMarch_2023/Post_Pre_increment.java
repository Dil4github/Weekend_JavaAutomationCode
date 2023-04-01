package com.javacode_5thMarch_2023;

public class Post_Pre_increment {

	public static void main(String[] args) {

		int i=1;    //i=1
		int j=i++ + ++i; //j=4; i=3
		int k=j++ + i++ + ++j + j++; // 4+3+6+6=19
		//i=4; j=7
		int g=i++ + ++j + ++i; //4+8+6
		//i=6; j=8
		System.out.println("G is:" +g);
		
		System.out.println("---------------------------");
		
		int gh=i+ ++j + j++ + i++ + ++i + ++j + ++j;
		//			6		9	9		 6			8			11		12
				//	6, 7, 8
				//9, 10, 
		

		System.out.println(gh);
		
		System.out.println("-----------------------------");
		
		
		int ghi=i+ ++j + j++ + ++i + ++j + ++j ;
			// 		6  +9      +9     +7   +10   +11
		System.out.println("gh is"+ghi); //
		System.out.println(i); //7
		System.out.println(j); //11
		System.out.println(k); //19
		
		
			
	}

}

