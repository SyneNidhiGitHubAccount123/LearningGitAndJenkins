package POJO1;

import org.apache.juneau.html.HtmlSerializer;
import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;
import org.testng.annotations.Test;

public class ProductTest
{
	
	//POJO to Json
	
//	JsonSerializer jsonserializer1 = JsonSerializer.DEFAULT_READABLE;
//	
	String[] sellerNames = {"Neon Enterprise","ABC Software","XYZ IT Solutions"};
	
	Product product = new Product("MacbookPro","1000","White",sellerNames);
	
	
	//POJO to XML
	
	XmlSerializer xml = XmlSerializer.DEFAULT_NS_SQ_READABLE;
	
	

}
