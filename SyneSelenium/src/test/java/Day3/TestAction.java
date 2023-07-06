package Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import TestngAnnotation.TestBase;

public class TestAction extends TestBase 

{
	
	@Test
	public void ActionTest() throws InterruptedException
	{
		LaunchBrowser();
		driver.get("http://americangolf.co.uk");
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='termly-code-snippet-support']/div/div/div/div/div/div[2]/button[2]")));
		
	driver.findElement(By.xpath("//*[@id='termly-code-snippet-support']/div/div/div/div/div/div[2]/button[2]")).click();
	WebElement golf =	driver.findElement(By.xpath("//*[@id='header-navigation']/div/ul/li[3]/a"));
		
		
		
		Actions act = new Actions(driver);
		act.moveToElement(golf).build().perform();
		
		
		driver.navigate().to("https://www.americangolf.co.uk/golf-clubs/drivers/ladies");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		int size =driver.findElements(By.xpath("//*[@id='termly-code-snippet-support']/div/div/div/div/div/div[2]/button[2]")).size();
		
		if(size>0)
		{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='termly-code-snippet-support']/div/div/div/div/div/div[2]/button[2]")));
		
		driver.findElement(By.xpath("//*[@id='termly-code-snippet-support']/div/div/div/div/div/div[2]/button[2]")).click();
		}
		
		
		WebElement ele =driver.findElement(By.xpath("//*[@id='a8dfe3f3f6ef352b302ad67f35']/h3"));
		
	int y=	ele.getLocation().y;
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,"+y+")");
		
	
	
		WebElement odffset =driver.findElement(By.xpath("//*[@id='secondary']/div[1]/div[4]/div/div/div[1]/div/div/div[2]"));
		
		act.click(odffset).moveByOffset(0, 100).build().perform();
		
		Thread.sleep(3000);
		
		
		
	}

}
