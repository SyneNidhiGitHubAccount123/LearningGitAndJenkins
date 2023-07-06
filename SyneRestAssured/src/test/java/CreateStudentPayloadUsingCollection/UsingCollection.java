package CreateStudentPayloadUsingCollection;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UsingCollection 

{
	@Test
	public void name()
	{
		
		
		HashMap<String, Object> Student = new HashMap<String, Object>();
		
		Student.put("firstName", "Tojfhgfdjdd");
		Student.put("lastName", "Beck123");
		Student.put("email", "Fusce.dolor.quam@commodoauctor.org");
		Student.put("programme", "Financial Analysis");
		
		List<String> list = new ArrayList();
		list.add("Accounting");
		list.add("Statistics");
		
		
		Student.put("courses", list);
		
		
//		System.out.println(Student.toString());
		
		
		RestAssured.baseURI ="http://localhost:8888";
		RestAssured.basePath = "/student";
				
		
		Response res= given().contentType(ContentType.JSON).body(Student).log().all().post();
		
		
	}

}
