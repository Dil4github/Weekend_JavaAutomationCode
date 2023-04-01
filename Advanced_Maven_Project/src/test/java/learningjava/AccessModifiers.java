package learningjava;

public class AccessModifiers {

	public static int age=20;
	private static String name="Don";
	protected static double height=6.0;
	String color="Red";
	
	
	public static void main(String[] args) {

	}

public static void sample() {
	System.out.println("This is public sample method");
}
protected static void sample1() {
	System.out.println("This is protected sample method");
}
private static void name() {
	System.out.println("This is a pribate method.");
}

}
