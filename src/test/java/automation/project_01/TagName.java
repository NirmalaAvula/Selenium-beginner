package automation.project_01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		WebElement obj= driver.findElement(By.tagName("input"));
		obj.sendKeys("Test");
		String text=obj.getText();
		System.out.println("Entered text is: "+ text);
	      //driver.quit();
		

	}

}
