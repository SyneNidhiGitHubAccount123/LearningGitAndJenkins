package Day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import TestngAnnotation.TestBase;

public class testAlert extends TestBase

{

	 @Test
	 public void testAlert() throws InterruptedException
	 
	{
		 
		 LaunchBrowser();
		 driver.get("C:\\Users\\Nidhi.Khandelwal\\Desktop\\Selenium_Training\\Day2\\alert.html");
		 
		 driver.findElement(By.xpath("//input[@type='button']")).click();
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.alertIsPresent());
		 
	     Alert al= driver.switchTo().alert();
	     
	     Thread.sleep(3000);
	     
	     al.accept();
		 
		 
		 
		
		
	}
}
