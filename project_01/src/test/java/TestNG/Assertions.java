package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	@Test
	public void asser() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://cognine.com/");
		driver.manage().window().maximize();
		String expectedTitle="Cognine - AI Powered Solutions";
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, expectedTitle);	
	}
	public class Assertions1 {
		@Test
		public void asser() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://cognine.com/");
			driver.manage().window().maximize();
			String expectedTitle="Cognine-AI Powered Solutions";
			String actualtitle=driver.getTitle();
			Assert.assertEquals(actualtitle, expectedTitle,"Title is mismatched");
			Assert.assertTrue(false);
	}
	}
}
