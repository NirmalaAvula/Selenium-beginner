package automation.project_01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobtn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		WebElement rdnbtn = driver.findElement(By.xpath("//input[@id='gender']"));
		rdnbtn.click();
		WebElement rdnbtn1 = driver.findElement(By.xpath("//div[3]//div[1]//div[1]//div[2]//input[1]"));
		rdnbtn1.click();
		boolean result=rdnbtn.isSelected();
		System.out.print("Checking if a radio button is selected: " + result);
		boolean result1=rdnbtn1.isSelected();
		System.out.print("\nChecking if a radio button is selected: " + result1);
		driver.wait(500);
		driver.close();
		
	}

}
