package automation.project_01;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.applitools.com/");
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		WebElement ele =driver.findElement(By.xpath("//input[@type='checkbox']"));
		ele.click();
		////ele.click();
		boolean res=ele.isSelected();
		System.out.println("Checking if a checkbox is selected: " + res);
		List<WebElement> totlcount=driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count=totlcount.size();
		System.out.println("Count the checkboxes: " + count);
		//driver.quit();
		}
}
