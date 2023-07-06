package WithPayload3Simple;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class PostReq3Simple
{
	
	@Test
	public void name() 
	{
		
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8888;
		RestAssured.basePath= "/student";
		
		Student stu = new Student("Abhinav","Kaushik","CSE","ahdhfffdh@gmail.com");
		
		Course course = new Course("Java","C++");
		Course course1 = new Course("Java","70");
		
		stu.addCourse(course);
		stu.addCourse(course1);
			
		
		Response res=given().contentType(ContentType.JSON).body(stu).log().all().post();
		
		res.prettyPrint();
		
		
	}

}
