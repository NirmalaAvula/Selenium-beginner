package automation.project_01;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Log")).click();
		WebDriverWait wait1 = new WebDriverWait (driver,Duration.ofSeconds(200));
		//driver.findElement(By.xpath("//span[contains(text(),'Grocery')]")).click();
		WebElement str=driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
		str.sendKeys("avulanirmala97@gmail.com");
		WebDriverWait wait2 = new WebDriverWait (driver,Duration.ofSeconds(200));
		driver.findElement(By.xpath("//button[normalize-space()='Request OTP']")).click();
	}

}
