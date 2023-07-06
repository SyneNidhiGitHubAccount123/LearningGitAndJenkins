package WithPayload2Simple;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class PostReq2Simple 
{
	
	@Test
	public void name()
	{
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8888;
		RestAssured.basePath= "/student";
		
	     
		Student stu = new Student("Abhinav","Kaushik","ahdhfffdh@gmail.com","CSE");
		Course course = new Course("Java","80"); 
		
		stu.setCourse(course);
		
		
		Response res=given().contentType(ContentType.JSON).body(stu).log().all().post();
	
		res.prettyPrint();
		
		
		
		
	}

}
