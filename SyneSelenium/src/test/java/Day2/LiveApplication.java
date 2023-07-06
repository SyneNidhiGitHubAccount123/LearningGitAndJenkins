package Day2;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import TestngAnnotation.TestBase;

public class LiveApplication extends TestBase

{
    @Test
	public void testPaytm() throws InterruptedException 
	{
		LaunchBrowser();
		
		driver.get("https://paytm.com/");
		
		//Thread.sleep(5000);
		
		isElementPresent();
		
		driver.findElement(By.xpath("//img[@alt='user']")).click();
		
		
	WebElement ele=	driver.findElement(By.xpath("//img[@alt='user']"));
	
	ele.isDisplayed();
	ele.isSelected();
	ele.isEnabled();
		
		
	}
    
      public Boolean isElementPresent()
        {
			
        	try{
        	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='user']")));
    		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@alt='user']"))));
    		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='user']")));
        	}catch(Exception e)
        	{
        		return false;
        	}
        	
        	return true;
		}
	
}


