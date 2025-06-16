package automation.project_01;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

	public class BMS {
		//public static WebDriver driver;
		public void test1() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://in.bookmyshow.com");
		driver.manage().window().maximize();
        String actualResult = driver.getCurrentUrl();
		String expectedResult= "https://in.bookmyshow.com/";
		System.out.println("After launching the URL:" + actualResult);
		boolean result=actualResult.equals(expectedResult);
		Assert.assertTrue(result, "Matched");
		System.out.println("Is Expected result is matched with actual result:" + result);
		//return result;
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement viewAllCities=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@cursor='pointer']")));
      //WebElement viewAllCities =driver.findElement(By.xpath("//span[@cursor='pointer']"));
       viewAllCities.click();
       System.out.println("Clicked on view all cities");
       WebElement locationElement = driver.findElement(By.xpath("//div[text()='Alakode']"));
       locationElement.click();
       System.out.println("Selected the Alakode");
       
       WebElement dpdown=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@fill='none']")));
       dpdown.click();
       System.out.println("Selected the Alakode");
		}
  
		public static void main(String[] args) {
     		BMS t=new BMS();
			t.test1();
		}			
	}


