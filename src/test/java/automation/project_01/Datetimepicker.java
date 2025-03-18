package automation.project_01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Datetimepicker {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='datetimepicker1']")).click();
		WebElement month=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/select[1]"));
		month.click();
		Select select=new Select(month);
		select.selectByVisibleText("November");
		month.click();
		WebElement date=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[2]"));
		date.click();
		
		
		
}
}
