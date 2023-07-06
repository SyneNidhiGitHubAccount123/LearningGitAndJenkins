package Basics;

import io.restassured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class LearnRestAssuredBasics

{
//    @Test
//	public void name()
//	{
//		RestAssured.baseURI="http://localhost:8888";
//		RestAssured.basePath="/student/";	
//		
//		
//		Response res = given().contentType(ContentType.JSON).get("/list");
//		res.prettyPrint();
//		
//		
//	}
    
//    @Test
//    public void studentwithspecificid()
//    {
//    	RestAssured.baseURI="http://localhost:8888";
//    	RestAssured.basePath="/student";
//    	
//    Response res=	given().contentType(ContentType.JSON).get("/10");
//    
//    res.prettyPrint();
//	}
	
//	@Test
//	public void studentprogrammeFinancial()
//	{
//		RestAssured.baseURI = "http://localhost:8888";
//		RestAssured.basePath ="/student";
//		
//		Response res =  given().contentType(ContentType.JSON).get("/list?programme=Financial Analysis");
//		res.prettyPrint();
//	}
	
	
//	@Test
//	public void studentprogrammeFinancialLimit()
//	{
//		RestAssured.baseURI="http://localhost:8888";
//		RestAssured.basePath="/student";
//		
//		Response res=given().contentType(ContentType.JSON).log().all().get("/list?programme=Financial Analysis&limit=2");
//		
//		res.prettyPrint();
//		
//	}
	
	
	@Test
	public void studentprogrammeFinancialLimit1()
	{
		RestAssured.baseURI="http://localhost:8888";
		RestAssured.basePath="/student";
		
		Response res=given().contentType(ContentType.JSON).log().headers().get("/list?programme=Financial Analysis&limit=2");
		
		res.prettyPrint();
		
	}
	
	
	
	
}
