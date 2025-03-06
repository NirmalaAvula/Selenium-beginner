package automation.project_01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigationcommands {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
	      System.out.println("Getting browser title after launch: " + driver.getTitle());
	      WebElement l = driver.findElement(By.xpath("//*[@id='collapseTwo']/div/ul/li[2]/a"));
	      l.click();
	      System.out.println("Getting browser title after clicking link: " + driver.getTitle());
	      driver.navigate().back();
	      System.out.println("Getting browser title after navigating back: " + driver.getTitle());
	      driver.navigate().forward();
	      System.out.println("Getting browser title after navigating forward: " + driver.getTitle());
	      driver.navigate().refresh();
	      System.out.println("Getting browser title after browser refresh: " + driver.getTitle());
	      driver.quit();
	   }
	}

