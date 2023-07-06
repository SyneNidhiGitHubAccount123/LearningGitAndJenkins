package Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import TestngAnnotation.TestBase;

public class MakeMytripFrame extends TestBase{
	
	
	@Test
	public void testMakeMytripFrame() throws InterruptedException
	
	{
		LaunchBrowser();
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(5000);
		
		
	int framessize =	driver.findElements(By.tagName("iframe")).size();
	System.out.println("framessize  "+ framessize);
	driver.switchTo().frame(2);
		
//	for(int i=0;i<framessize;i++)
//	{
//		driver.switchTo().frame(i);
//		
//	int eleSize =	driver.findElements(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-close-div']")).size();
//		
//		if(eleSize>0)
//		{
//			driver.findElement(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
//			break;
//		}
//		
//		else
//		{
//			driver.switchTo().defaultContent();
//		}
//		
//		
//	}
	driver.findElement(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
		
		
	}

}
