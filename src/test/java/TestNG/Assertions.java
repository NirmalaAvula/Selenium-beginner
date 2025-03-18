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
		driver.quit();
	}
	public class Assertions1 {
		@Test
		public void asser() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://cognine.com/");
			driver.manage().window().maximize();
			String expectedTitle="Cognine-AI Powered Solutions";
			String actualtitle=driver.getTitle();
			//hard assertions means if execution got failed for one method it stops the next step and proceed to execute next step
			Assert.assertEquals(actualtitle, expectedTitle,"Title is mismatched");
			driver.quit();
			Assert.assertTrue(false);
	}
	}
	
	//verifying URL
			public class TestURL{
				@Test
				public void testurl() {
					WebDriver driver=new ChromeDriver();
					driver.get("https://cognine.com/");
					driver.manage().window().maximize();
					String expectedURL="https://cogninee.com/";
					String actualURL=driver.getCurrentUrl();
					Assert.assertEquals(actualURL, expectedURL,"URL is matched");
					driver.quit();
					
				}
				/*public class getattribute {
					@Test
					public void abc() {
						WebDriver driver=new ChromeDriver();
						driver.get("https://www.facebook.com/");
						driver.manage().window().maximize();
						WebElement expectedelement=driver.findElement(By.name("email"));
						expectedelement.sendKeys("Nirmala");
						String actualelement=driver.findElement(By.name("email")).getAttribute("value");
						Assert.assertEquals(actualelement, expectedelement, "email text is matched");
						driver.quit();
						
					}
				}*/
			}
		
	}

