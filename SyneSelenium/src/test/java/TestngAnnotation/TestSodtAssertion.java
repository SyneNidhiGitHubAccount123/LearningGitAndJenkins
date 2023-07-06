package TestngAnnotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSodtAssertion

{

	SoftAssert soft = new SoftAssert();
	
	
	@Test
	public void testSoftAssert()
	
	{
		
		soft.assertEquals(true, false);
		
		
		soft.fail();
		soft.assertSame("Nidhi", "Kajal");
		soft.assertSame("Nidhi1", "Kajal1");	
		
		
		soft.assertEquals(true, false);
		soft.fail();
		soft.assertSame("Nidhi", "Kajal");
		soft.assertSame("Nidhi1", "Kajal1");
		
		
		soft.assertEquals(true, false);
		soft.fail();
		soft.assertSame("Nidhi", "Kajal");
		soft.assertSame("Nidhi1", "Kajal1");
		
		
		soft.assertEquals(true, false);
		soft.fail();
		soft.assertSame("Nidhi", "Kajal");
		soft.assertSame("Nidhi1", "Kajal1");
		soft.assertAll();
		
		
		
	}
	
	
	@AfterMethod
	public void afterTest() 
	{
		
	}
	
	
	
}
