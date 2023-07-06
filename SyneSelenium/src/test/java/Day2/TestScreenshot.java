package Day2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import TestngAnnotation.TestBase;

public class TestScreenshot extends TestBase

{
    @Test
	public void ScreenshotTest() throws IOException 
	
	{
		LaunchBrowser();
		driver.get("https://paytm.com/");
		
		completeScreenshot();

		takeScreenshotForElement();
		
	}
    
    
    public void completeScreenshot() throws IOException 
    {
    	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);    	
    	FileUtils.copyFile(src, new File("C://Users//Nidhi.Khandelwal//Workspace1//SyneSelenium//src//test//resources//ScreesnShot//sample.jpg"));
	}
    
     
    
    public void takeScreenshotForElement() throws IOException
    {
    	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);    	
       BufferedImage fullimg =	ImageIO.read(src);       
       WebElement ele = driver.findElement(By.xpath("//*[@id='app']/header/div/div[1]/a/div"));           
     Point point=  ele.getLocation();     
      int width =  ele.getSize().getWidth();
       int height = ele.getSize().getHeight();       
       BufferedImage subimageEle=  fullimg.getSubimage(point.x, point.y, width, height);       
       ImageIO.write(subimageEle, "png", src);       
       FileUtils.copyFile(src , new File("C://Users//Nidhi.Khandelwal//Workspace1//SyneSelenium//src//test//resources//ScreesnShot//sample123.jpg"));
       
	}
    
    
}
