package Day2;

import java.util.Iterator;
import java.util.Set;

import TestngAnnotation.TestBase;

public class Testwindow extends TestBase

{

	public void windowTest()
	
	{
		driver.get("https://paytm.com/");
		
	Set<String>	windows =   driver.getWindowHandles();
	
	
	Iterator itr = windows.iterator();
	
	while (itr.hasNext())
	{
		
	String window=(String) itr.next();
	
	
	if(window.equalsIgnoreCase(""))
	{
		driver.switchTo().window(window);
		
		
	}
	
	
	driver.switchTo().defaultContent();
	
	}
	
	}
	
}
