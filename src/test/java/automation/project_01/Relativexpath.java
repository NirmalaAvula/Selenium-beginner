package automation.project_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
		driver.manage().window().maximize();
		WebElement Ele1=driver.findElement(By.partialLinkText("Bad"));
		Ele1.click();
		WebElement Ele2=driver.findElement(By.xpath("//div[@class='brequest']"));
		String test=Ele2.getText();
		System.out.println(test);
		

	}

}
