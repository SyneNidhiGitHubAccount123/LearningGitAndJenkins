package Day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import TestngAnnotation.TestBase;

public class TestCalender extends TestBase
{
	@Test
	public void Calendertest() throws InterruptedException 
	
	{
		LaunchBrowser();
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(3000);
		
		
	int framessize =	driver.findElements(By.tagName("iframe")).size();
	System.out.println("framessize  "+ framessize);
	driver.switchTo().frame(2);
	
	driver.findElement(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
	
	
	driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']")).click();
	
	List<WebElement> dates = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
	
	for(int i=0;i<dates.size();i++)
	{
		String dateText =dates.get(i).getAttribute("aria-label");
		
		if(dateText.contains("Jul 22 2023"))
		{
			dates.get(i).click();
			break;
			
		}
	}
	
	
	
	}

}
