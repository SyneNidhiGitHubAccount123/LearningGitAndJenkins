package Basics;
import io.restassured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class DeleteStudent
{

	
	@Test
	public void testDeleteStudent()
	{
		RestAssured.baseURI = "http://localhost:8888";
		RestAssured.basePath ="/student";
		
		Response res=given().contentType(ContentType.JSON).delete("/101");
		
		res.prettyPrint();
		
	}
	
	
	
	
	
}
