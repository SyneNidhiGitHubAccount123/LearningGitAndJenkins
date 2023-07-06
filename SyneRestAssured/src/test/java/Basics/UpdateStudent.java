package Basics;
import io.restassured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

public class UpdateStudent

{

	@Test
	public void name()
	{
		RestAssured.baseURI ="http://localhost:8888";
		RestAssured.basePath="/student";
		
		File f = new File("C://Users//Nidhi.Khandelwal//Workspace1//SyneRestAssured//StudentPut.json");
		
		 Response res =  given().contentType(ContentType.JSON).body(f).put("/10");
		 
		 res.prettyPrint();
	}
	
	

}
