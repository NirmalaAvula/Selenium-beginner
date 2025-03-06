package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM {
	WebDriver driver;
	
	@Test
	public void LaunchApp() {
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();		
	}
	/*@Test
	public void userlogin() {
		//WebElement ele=driver.findElement(By.className("oxd-input oxd-input--active oxd-input--error"));
		//ele.sendKeys("Admin");
		WebElement ele1=driver.findElement(By.name("password"));
		ele1.sendKeys("pass");
		
	}*/
	@Test
	public void testgoogle() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("Cognine Technologies",Keys.ENTER);	
	}

}
