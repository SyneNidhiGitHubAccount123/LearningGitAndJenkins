package TestngAnnotation;

import org.testng.annotations.Test;

public class Login

{

	
	
		
	@Test(dataProviderClass=DataProvider.class,dataProvider="testDataProvider")
	public void Login(String Username ,String Password,String result) 
	{
		
		System.out.println("Username "+ Username +" "+ "Password "+ Password + " " + result);
		
		
	}
	
	
	
	
	@Test(dataProviderClass=DataProvider.class,dataProvider="testDataProvider")
	public void Login1(String Username ,String Password,String result) 
	{
		
		System.out.println("Username "+ Username +" "+ "Password "+ Password + " " + result);
		
	}
	
	
	
	@Test(dataProviderClass=DataProvider.class,dataProvider="testDataProvider")
	public void Login2(String Username ,String Password,String result) 
	{
		
		System.out.println("Username "+ Username +" "+ "Password "+ Password + " " + result);
		
	}
	
	
	
//	
//	@Test(dataProviderClass=DataProvider.class,dataProvider="testDataProvider")
//	public void Login2(String Username ,String Password,String result) 
//	{
//		
//		System.out.println("Username "+ Username +" "+ "Password "+ Password + " " + result);
//		
//	}
	
	
	
	
	
	
	
	
	
}
