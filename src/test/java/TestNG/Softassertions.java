package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertions {
	SoftAssert softasert=new SoftAssert();
	@Test	
	public void Softasert() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://cognine.com/");
		driver.manage().window().maximize();
		String expectedTitle="Cognine - AI Powered Solutions";
		String actualtitle=driver.getTitle();
		softasert.assertEquals(actualtitle, expectedTitle);
		driver.quit();
		softasert.assertAll();
		
	}
}
