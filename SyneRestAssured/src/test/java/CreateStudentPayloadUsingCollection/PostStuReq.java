package CreateStudentPayloadUsingCollection;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostStuReq
{
	@Test
	public void name() 
	{
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8888;
		RestAssured.basePath= "/student";
		List<String> course = new ArrayList();
		course.add("java");
		course.add("c++");
		course.add("c");
		
		Student stu = new Student("Abhinav","kaushik","abhinav.kaushik@gmail.com","computer science");
		stu.setCourses(course);
		
		
		Response res=given().contentType(ContentType.JSON).body(stu).log().all().post();
		
		res.prettyPrint();
		
		
	}

}
