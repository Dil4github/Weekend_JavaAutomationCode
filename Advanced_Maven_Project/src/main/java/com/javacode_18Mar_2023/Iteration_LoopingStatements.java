package com.javacode_18Mar_2023;

public class Iteration_LoopingStatements {

	public static void main(String[] args) {

		//While loop syntax
		//1. initialize a value of a variable
		//2. pass the condition in the while
		//3. if the condition is true, the control will go inside the body of the while loop
		//4. if false, the control will not go inside the body of the while loop
		//5. to control your logic, you may chose to increment or decrement a certain value
	
	
	boolean b1=true;
	
			while (b1!=false) {
		System.out.println("The grass is green.");
		break;
		
}
			int i=1;
			while (i<=10) {
			System.out.print(i+"");
			i++;
}
			
			int j=20;
			 while (j>0) {
				 System.out.print(j+"");
				 j--;
			 }
			 
			  int k=2;
			  while (k<21) {
				  System.out.print(k+"");
				  k+=2;
			  }
			  
			  int l=1;
			  while (l<=20) {
				  System.out.print(k*2+"");
				  l=l+1;
			  }
			  
			  int m=100;
					  while (m>=5) {
						  System.out.print(m+"");
						  m=m-5;
					  }
			}
	}