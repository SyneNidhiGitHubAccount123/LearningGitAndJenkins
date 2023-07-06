package Day2;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import TestngAnnotation.TestBase;

public class TestJavascript extends TestBase
{

	@Test
	public void javaScriptExecutorTest() throws InterruptedException
	
	{
		LaunchBrowser();
		//driver.get("https://paytm.com/");  //window.locaton
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://paytm.com/'");
		
		waitForPageToLoad();
		
		js.executeScript("window.scrollBy(0,1000)");
		
	}
	
	
	
	
	public void waitForPageToLoad() throws InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		int i=0;
		// page to load 100% -- wait for max 20 secs
		while(i!=10){
			String state = (String)js.executeScript("return document.readyState;");
			System.out.println(state);// complete, loading, interactive
	
			if(state.equals("complete"))
				break;
			else
				Thread.sleep(2000);
	
			i++;
		}
		// check for jquery/ajax status
		
		i=0;
		while(i!=10){

			Long d= (Long) js.executeScript("return jQuery.active;");
			System.out.println(d);//0,1
			if(d.longValue() == 0 )
				break;
			else
				Thread.sleep(2000);
			i++;

		}
		
	}

}



