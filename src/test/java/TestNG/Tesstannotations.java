package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tesstannotations {
	@Test
public void TestGmail() {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://gmail.com");
	System.out.println(driver.getTitle());
	driver.quit();
}
	//We have two classes here, it will execute based on the alphabetical order by considering the methods
	@Test
	public void TestFacebook() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://Facebook.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
}


