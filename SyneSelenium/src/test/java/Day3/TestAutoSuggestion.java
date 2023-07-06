package Day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import TestngAnnotation.TestBase;

public class TestAutoSuggestion extends TestBase
{

	@Test
	public void AutoSuggestiontest() throws InterruptedException
	
	{
		
		{
			LaunchBrowser();
			driver.get("https://www.makemytrip.com/");
			
//			Thread.sleep(6000);
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
			
			
//		int framessize =	driver.findElements(By.tagName("iframe")).size();
//		System.out.println("framessize  "+ framessize);
//		driver.switchTo().frame(2);
//		
		driver.findElement(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-close-div']")).click();		
		
		driver.findElement(By.xpath("//*[@id='fromCity']")).click();
		
		
	List<WebElement>cities = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//li"));
	
	for(int i=0;i<cities.size();i++)
	{
		String city =cities.get(i).getText();
		
		if(city.contains("New Delhi"))
		{
			cities.get(i).click();
			break;
		}
	}
	}
}
}
