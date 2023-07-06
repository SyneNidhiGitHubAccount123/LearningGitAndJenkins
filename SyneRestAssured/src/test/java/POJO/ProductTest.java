package POJO;

import org.apache.juneau.html.HtmlSerializer;
import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;
import org.testng.annotations.Test;

public class ProductTest
{
	
	@Test
	public void name() throws SerializeException, ParseException
	{
		//POJO to json
		
		JsonSerializer jsonserializer = JsonSerializer.DEFAULT_READABLE;
		
		String[] sellerName = {"Neon Enterpirse","ABC Software" ,"XYZ IT Solution"};
		
		Product product = new Product("MacbooPro","1000","White",sellerName);
		
		String json =jsonserializer.serialize(product);
		
		System.out.println(json);
		
//		
		XmlSerializer xmlserializer = XmlSerializer.DEFAULT_NS_SQ_READABLE;
		String xml =xmlserializer.serialize(product);
		
		System.out.println(xml);
		
		
		HtmlSerializer htmlserializer = HtmlSerializer.DEFAULT_SQ_READABLE;
		String html =   htmlserializer.serialize(product);
		
		System.out.println(html);
		
		
//		//Desealization
		
		
		JsonParser jsonparser = JsonParser.DEFAULT;
		
		String jsonVal = "{\"color\":\"White\",\"name\":\"MacbooPro\",\"price\":\"1000\",\"sellerNames\":[\"NeonEnterpirse\",\"ABCSoftware\",\"XYZITSolution\"]}";
		
		Product pro=jsonparser.parse(jsonVal, Product.class);
		
		System.out.println("color  " + pro.getColor());
		System.out.println("color  " + pro.getName());
		System.out.println("color  " + pro.getPrice());
		
		
		
		
	}
	
	
	
}
