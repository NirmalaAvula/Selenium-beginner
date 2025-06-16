package automation.project_01;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {
	public void Dropdwn() {
	WebDriver driver=new ChromeDriver();	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
    WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));	
    WebElement username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
    username.sendKeys("Admin");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");	
    WebElement submit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
    submit.click();
    WebElement adminTab = wait.until(ExpectedConditions.elementToBeClickable(
     By.xpath("//span[text()='Admin']")));  /// or  By.xpath("//span[text()='Admin']/parent::a")));
    adminTab.click();
    WebElement organizationTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[normalize-space(text())='Organization']")));
    	//(By.xpath("//*[normalize-space(text())='Organization']")));
    organizationTab.click();
    System.out.println("Clicked Organization tab");
    WebElement dropdownoption=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[normalize-space(text())='Locations']")));
    dropdownoption.click();   
    System.out.println("Trying to click Locations...");
    }
	
public static void main(String[] args)  {
	
	Dropdown dp =new Dropdown();
	dp.Dropdwn();
	

}
}
