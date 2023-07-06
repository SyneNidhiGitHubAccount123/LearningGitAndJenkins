package CreateStudentPayloadUsingCollection;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.util.JSONPObject;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreatePostUsingObjectArray 

{

	
	@Test
	public void name()
	{
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8888;
		RestAssured.basePath= "/student";
		
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("firstName", "Tojfhgfdjdd");
		jsonObj.put("lastName", "Beck123");
		jsonObj.put("email", "sddsdfgdfgaFusce.dolor.quam@commodoauctor.org");
		jsonObj.put("programme", "Financial Analysis");
		
		
		JSONArray arr = new JSONArray();
		arr.put("Accounting");
		arr.put("Statistics");
		
		jsonObj.put("courses", arr);
		
		Response res =given().contentType(ContentType.JSON).body(jsonObj.toString()).log().all().post();
	
		res.prettyPrint();
		
		
		
	}
}
