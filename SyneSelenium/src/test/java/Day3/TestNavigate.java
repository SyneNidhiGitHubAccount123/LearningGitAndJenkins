package Day3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TestngAnnotation.TestBase;

public class TestNavigate extends TestBase

{

	@Test
	public void Navigatetest()
	{
		LaunchBrowser();
		//driver.get("https://www.redbus.in/");
		
		driver.navigate().to("https://www.redbus.in/");
		
		String tittle =driver.getTitle();
		String  CurrentUrl =  driver.getCurrentUrl();
		
		
		System.out.println("tittle " + tittle);
		System.out.println("CurrentUrl " + CurrentUrl);
		
		
		driver.findElement(By.xpath("//*[@id='bus_tickets_vertical']/img")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		
		
	}
}
