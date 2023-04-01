package learning_TestNG;

import static org.junit.Assert.fail;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {

		//@AnnotationName (First step in TestNG. Ctrl+Shift+O doesn't change error here.)
		// Then you have to create Mehod below the annotation.
	
	@BeforeSuite
	public void beforeSuiteAnnotation() {
		System.out.println("This is Before Suite.");
	}
	
	 @BeforeTest
	 public void beforeTestAnnotation() {
	System.out.println("This is Before Test.");
	 }
	 
	 @BeforeClass
	 public void beforeClassAnnotation() {
			System.out.println("This is Before Class.");

	 }
	 
	 @BeforeMethod
	 public void beforeMethodAnnotation() {
			System.out.println("This is Before Method.");

}
	 @Test 
	 public void testCase1Annotaion() {
		 System.out.println("This is TestCase1.");
}
	 @Test
	 public void TestCase2Annotation() {
		 System.out.println("This is TestCase2.");
	 }

	 @AfterMethod
	 public void afterMethodAnnotaion() {
		 System.out.println("This is AfterMethod.");
	 }
	 
	 @AfterClass
	 public void afterClassAnnotation() {
		 System.out.println("This is Afterclass.");
	 }
	 
	 @AfterTest
	 public void afterTestAnnotation() {
		 System.out.println("This is AfterTest.");
	 }
	 
	 @AfterSuite
	 public void afterSuiteAnnotation() {
		 System.out.println("This is Ater Suite.");
	 }
	 }