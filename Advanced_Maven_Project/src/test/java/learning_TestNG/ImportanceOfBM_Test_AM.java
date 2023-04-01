package learning_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.cucumber.java.AfterStep;

public class ImportanceOfBM_Test_AM {

	@BeforeMethod
	public void beforeMethodAnnotation() {
	System.out.println("This is bm.");
	}
	
	@Test
	public void testCase1() {	
		System.out.println("Test1");
	}

	@Test
	public void testCase2() {	
		System.out.println("Test2");
	}
	
	@Test
	public void testCase3() {	
		System.out.println("Test3");
	}
	
	@AfterMethod
	public void afterMethodAnnotations() {
		System.out.println("This is am.");
	}
	
	
	}
