package parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {
	public void paralleltest2() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://cognine.com/");
		driver.manage().window().maximize();
		driver.quit();
	}

}
