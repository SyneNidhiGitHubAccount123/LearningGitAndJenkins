package Day3;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import TestngAnnotation.TestBase;

public class TestTooltip extends TestBase
{

	@Test
	public void Tooltiptest() 
	
	{
		LaunchBrowser();
		driver.get("https://demo.guru99.com/test/social-icon.html");
		String ToolTip ="Github";
		WebElement GitHub = driver.findElement(By.xpath("//*[@id='page']/div[2]/div/a[4]"));
		String gitHubTittle =GitHub.getAttribute("tittle");
		
		assertEquals(gitHubTittle, gitHubTittle);
		
		
	}
}
