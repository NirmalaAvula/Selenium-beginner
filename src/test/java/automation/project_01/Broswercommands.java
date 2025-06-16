package automation.project_01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broswercommands {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		 driver.manage().window().maximize();
		 // Getting browser title after launch
		 System.out.println("Getting browser title after launch: " + driver.getTitle());
	      System.out.println("Getting URL after launch: " + driver.getCurrentUrl());
	      WebElement l = driver.findElement(By.xpath("//*[@id='collapseTwo']/div/ul/li[2]/a"));
	      l.click();
	      //driver.wait(500);
	      System.out.println("Getting browser title after clicking link: " + driver.getTitle());
	      System.out.println("Getting URL after clicking link: " + driver.getCurrentUrl());
	      driver.quit();
	   }


	}


