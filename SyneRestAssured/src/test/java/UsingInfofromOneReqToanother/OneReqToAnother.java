package UsingInfofromOneReqToanother;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class OneReqToAnother
{

	int id;
	String firstName;
	
	@Test
	public void name()
	{
		
		RestAssured.baseURI="http://localhost:8888/";
		RestAssured.basePath="student";
		
	    Response res =  given().contentType(ContentType.JSON).get("/list");
		
	     JsonPath extractor =   res.jsonPath();
	     
	     id =extractor.get("[89].id");
	     
	     firstName =extractor.get("[89].firstName");
	     
	     
	     
	     //90
	     System.out.println("id  "+ id);
	    
	}
	
	
	
	@Test
	public void name1()
	{
		
		RestAssured.baseURI="http://localhost:8888/";
		RestAssured.basePath="student";
		
	    Response res =  given().contentType(ContentType.JSON).get("/"+id+"");
	
	     res.prettyPrint();
	     
	     System.out.println("firstNamfromPreviousReq  "+ firstName);
	  
	    
	}
	
	
}
