package TestngAnnotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestBase

{
	public WebDriver driver;
	
	
	public void LaunchBrowser()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
		options.addArguments("--disable-notifications");
		options.addArguments("ignore-certificate-errors");

		
		driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
	}
	
	
	
}
