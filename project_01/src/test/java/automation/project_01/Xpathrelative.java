package automation.project_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathrelative {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		driver.manage().window().maximize();
		WebElement i=driver.findElement(By.className("btn-primary"));
				i.click();
				WebElement element=driver.findElement(By.xpath("//*[@id='welcomeDiv']"));
				String test=element.getText();
				System.out.println(test);

	}

}
