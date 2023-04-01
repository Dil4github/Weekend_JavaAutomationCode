package com.javacode_18Mar_2023;

public class Understanding_ForLoops {

	public static void main(String[] args) {

		// (initialize; condition; inc/dec 
		
		//Flow of Logic
		//1. initialized value is taken into consideration
		//2. check for the condition
		//3. if the condition is true, the control flow will go inside the body of the for loop
		//4. if the condition is false, then it will exit
		//5. then control goes to iteration and it is compared with the condition
		//6. then the logic again goes back in the same flow till the condition is false.
		
		
		for (int i=1; i<=5; i++) {
			System.out.println("the value of i is: "+i+"");
		}
		
		for (int j=1; j<=20; j++) {
			System.out.println(j+"");
		}
		// 5*5... 10 times
		//100-10 to 0
		//first 20 multiplies of 2 and add all the values and give the sum
		
		for (int k=5; k<=50; k+=5) {
				System.out.println("The value of k is :"+k+"");
				
	}
		for(int m=100; m>=0; m-=10) {
			System.out.println("The value of m is:"+m+"");
		}
		int sum = 0;
		for (int g=1; g<=20; g++) {
			//System.out.println("The value of g is: "+g+"");
			System.out.print(g*2 + " ");
			
			sum = sum + ( g * 2);
			
		}
		System.out.print(sum);
		} 	
		
	}