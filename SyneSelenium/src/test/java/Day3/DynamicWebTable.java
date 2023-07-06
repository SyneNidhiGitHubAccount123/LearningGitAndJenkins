package Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import TestngAnnotation.TestBase;

public class DynamicWebTable extends TestBase
 {

	@Test
	public void testDynamicWebTable() 
	{
		
		LaunchBrowser();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		String data = "Everest Kanto Cylind";
		
	int rolNum=	getColumndataasperrowdata(data);
	
	if(rolNum>0)
	{
		 String colNameXpath = "//table[@class='dataTable']//tr["+rolNum+"]//td[4]";
		 
		String respectPrice = driver.findElement(By.xpath(colNameXpath)).getText();
		
		System.out.println(data + "   " + respectPrice);
	}
		
		
//	List<WebElement> companycol =	driver.findElements(By.xpath("//table[@class='dataTable']//tr//td[1]"));
//	
//	//List<WebElement> pricecol =	driver.findElements(By.xpath("//table[@class='dataTable']//tr//td[4]"));
//	
//	List<WebElement> PrevClose =	driver.findElements(By.xpath("//table[@class='dataTable']//tr//td[3]"));
//	
//	
//	
//	for(int i=0;i<companycol.size();i++)
//	
//	{
//		String companycoltext =companycol.get(i).getText();
//		String PrevClosetext =PrevClose.get(i).getText();
//		
//		System.out.println(companycoltext  + "    " + PrevClosetext);
//	}
}
	
	
	
	  public int getColumndataasperrowdata(String data) 
	  
	  {
		  
		 List<WebElement>  rows =driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		 
		 for(int i=0;i<rows.size();i++)
		 {
			WebElement row =   rows.get(i);
			
			List<WebElement>  cols =  row.findElements(By.tagName("td"));
			
			for(int colNum=0;colNum<cols.size();colNum++)
			{
				String colName =cols.get(colNum).getText();
				
				if(colName.equalsIgnoreCase(data))
				{
					return i;
				}
			}
		 }
		return -1;
		 
		 
		 
		 
		
	  }
 }
