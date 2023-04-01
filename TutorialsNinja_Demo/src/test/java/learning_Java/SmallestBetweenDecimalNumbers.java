package learning_Java;

public class SmallestBetweenDecimalNumbers {

	public static void main(String[] args) {

		double a=20.00;
		double b=20.01;
		double c=20.10;
		double d=20.11;
		
		if (a<b && a<c && a<d) {
			System.out.println("a is the smallest number="+a);
		}
		else if (b<a && b<c && b<d) {
			System.out.println("b is the smallest number="+b);
		}
		else if (c<a && c<b && c<d) {
			System.out.println("c is the smallest number="+c);
		}
		else if (d<a && d<b && d<c) {
			System.out.println("d is the smallest number="+d);

		}
	}


	}

