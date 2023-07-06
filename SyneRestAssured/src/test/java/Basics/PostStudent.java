package Basics;
import io.restassured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

public class PostStudent

{

	@Test
	public void createStudent()
	{
		RestAssured.baseURI ="http://localhost:8888";
		RestAssured.basePath = "/student";
		
		File f = new File("C://Users//Nidhi.Khandelwal//Workspace1//SyneRestAssured//Student.json");
		
		Response res= given().contentType(ContentType.JSON).body(f).post();
		
		int statuscode =res.statusCode();
		
		System.out.println("statuscode  "+ statuscode);
		
//		res.prettyPrint();
		
		
	}
}
