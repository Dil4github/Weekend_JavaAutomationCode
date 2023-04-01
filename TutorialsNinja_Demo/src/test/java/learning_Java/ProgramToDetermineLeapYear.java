package learning_Java;

import java.time.Year;

public class ProgramToDetermineLeapYear {

	public static void main(String[] args) {

		int year=2024;
		
		if (year%4==0 && year%400==0 && year%100!=0) {
			System.out.println(year+"Is a leap year");
	} else {
		System.out.println(year+" is not a leap year");
	}
		}
}