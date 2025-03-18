package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testannotations {
	WebDriver driver;
	@BeforeTest
	public void openbrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
      @AfterTest                        
	public void closebrowser() {
    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Facebook']")));
		driver.quit();
	}
      @Test
      public void test() {
    	  driver.navigate().to("https://www.facebook.com/");
      }

}
