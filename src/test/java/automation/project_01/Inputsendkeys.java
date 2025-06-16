package automation.project_01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputsendkeys {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); 
	      driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php"); 
	      WebElement elm = driver.findElement(By.xpath("//*[@id='fullname']"));
	      elm.sendKeys("Java");
	      String txt = driver.findElement(By.xpath("//*[@id='fullname']")).getAttribute("value");
	      System.out.println("Entered text: " + txt);
	      elm.clear();
	      // Get no text 
	      String txt1 = driver.
	      findElement(By.xpath("//*[@id='fullname']")).getAttribute("value");
	      System.out.println("Get text after clearing: " + txt1);

	      // Closing browser
	      //driver.quit();
	   }

}
