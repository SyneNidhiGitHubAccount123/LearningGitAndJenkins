package Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import TestngAnnotation.TestBase;

public class Testiframe  extends TestBase
 {

	@Test
	public void iframetest() 
	
	{
		LaunchBrowser();
		driver.get("https://paytm.com/");
		
		driver.findElement(By.xpath("//*[@id='app']/header/div/div[2]/div/img")).click();
		
		
		List<WebElement> frames =driver.findElements(By.tagName("iframe"));
		
		int iframesize = frames.size();
		
		System.out.println("iframesize "+ iframesize);
		
		
		for(int i=0;i<iframesize;i++)
		{
			
			driver.switchTo().frame(i);
			
		int eleSize=	driver.findElements(By.xpath("//*[@id='main-container']/div/div/div/div/div/div/div[1]/div/p")).size();
			
			if(eleSize>0)
			{
				String QRtest=	driver.findElement(By.xpath("//*[@id='main-container']/div/div/div/div/div/div/div[1]/div/p")).getText();
				
				System.out.println(QRtest);
				break;
			}
			
			driver.switchTo().defaultContent();
		}
		
		
		
	
	}
}
