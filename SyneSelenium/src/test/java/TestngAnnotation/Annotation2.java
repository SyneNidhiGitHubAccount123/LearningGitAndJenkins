package TestngAnnotation;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation2 

{
	
	
	@BeforeSuite
	public void testBeforeSuite()
	{
		
		System.out.println("Annotation2_test BeforeSuite");
		
	}
	
	@AfterSuite
	public void testAfterSuite()
	{
		
		System.out.println("Annotation2_test AfterSuite");
		
	}
	
	
	@org.testng.annotations.BeforeClass
	public void testBeforeClass()
	{
		
		System.out.println("Annotation2_test BeforeClass");
		
	}
//	
//	
	
	@AfterClass
	public void AfterClass()
	{
		
		System.out.println("Annotation2_After Class");
		
	}
	
	
	
	@BeforeTest
	public void testBeforeTest()
	{
		
		System.out.println("Annotation2_test BeforeTest");
		
	}
	
	
	@AfterTest
	public void testAfterTest()
	{
		
		System.out.println("Annotation2_tes tAfterTest");
		
	}
	
	
	@BeforeMethod
	public void testBeforeMethod()
	{
		
		System.out.println("Annotation2_test BeforeMethod");
		
	}
	
	
	@AfterMethod
	public void AfterMethod()
	{
		
		System.out.println("Annotation2_tes AfterMethod");
		
	}
	
	
	@Test
	public void testMethod()
	{
		
		System.out.println("Annotation2_test Method");
		
	}
	
	
	@Test
	public void testMethod1()
	{
		
		System.out.println("Annotation2_test Method");
		
	}
	
	
	

}
