package TestngAnnotation;

import java.lang.reflect.Method;

public class DataProvider

{

	
	@org.testng.annotations.DataProvider
	public Object[][] testDataProvider(Method m) 
	
	
	
	{
		System.out.println("method name  "+m.getName());
		Object[][] obj = new Object[4][3];
		obj[0][0]="Nidhi";
		obj[0][1]="pass";
		obj[0][2]="success";
		
		obj[1][0]="kajal";
		obj[1][1]="pass1";
		obj[1][2]="fail";
		
		obj[2][0]="Synechron";
		obj[2][1]="pass2";
		obj[2][2]="success";
		
		obj[3][0]="Synechron1";
		obj[3][1]="pass3";
		obj[3][2]="f";
		
		
		
		
	    return obj;
		
		
		
		
	}
	
	  
}
