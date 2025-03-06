package automation.project_01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Set;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Handles {

	public static void main(String[] args) {
		// Initiate the Webdriver
	      WebDriver driver = new ChromeDriver();

	      // adding implicit wait of 12 secs
	      driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

	      // Opening the webpage where we will open a new tab
	      driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
	      driver.manage().window().maximize();
	      // click link and navigate to next tab
	      WebElement b = driver.findElement
	         (By.xpath("/html/body/main/div/div/div[2]/button[1]"));
	      b.click();
	      
	      // Get the window handle of the original window
	      String oW = driver.getWindowHandle();
	      
	      // get all opened windows handle ids
	      Set<String> windows = driver.getWindowHandles();

	      // Iterating through all window handles
	      for (String w : windows) {
	         if(!oW.equalsIgnoreCase(w)) {
	         
	            // switching to child tab
	            driver.switchTo().window(w);
	            
	            // accessing element in new tab
	            WebElement e = driver.findElement
	               (By.xpath("/html/body/main/div/div/h1"));
	            System.out.println("Text in new tab is: " + e.getText());
	            break;
	         }
	      }
	      
	      // quitting the browser
	      //driver.quit();
	  

	}

}
