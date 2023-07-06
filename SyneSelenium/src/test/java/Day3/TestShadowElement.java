package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import TestngAnnotation.TestBase;

public class TestShadowElement extends TestBase

{

	@Test
	 public void ShadowElementtest()
	 {
		 LaunchBrowser();
		 
		 driver.get("https://www.google.com/");
		 
		// driver.findElement(By.xpath("//*[@id='input']")).sendKeys("TestTest");
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 WebElement tesxtbox =	(WebElement) js.executeScript("return document.querySelector('#APjFqb')");
	
		 tesxtbox.sendKeys("TestTest");
		 
	}
}
