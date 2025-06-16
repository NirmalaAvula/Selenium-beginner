package Screenshots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class2 {
public static WebDriver driver;
@Test
public void launchURL() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}
public void closewindow() {
	driver.quit();
}

}
