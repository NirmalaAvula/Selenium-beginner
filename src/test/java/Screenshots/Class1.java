package Screenshots;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Class1 extends Class2 {
	@Test(priority=1)	
	public void LaunchURL() {	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	usernameField.sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	@Test(priority=2)
	public void Admin() {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement menuItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='oxd-main-menu-item active']")));
	        menuItem.click();
	    }
	}

