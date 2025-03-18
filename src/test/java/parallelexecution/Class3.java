package parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {
	public void paralleltest3() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://cognine.com/");
		driver.manage().window().maximize();
		driver.quit();
	}

}
