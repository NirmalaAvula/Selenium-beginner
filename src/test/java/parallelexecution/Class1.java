package parallelexecution;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import TestNG.Allannotations;

public class Class1 {
	private static final Logger logger = LogManager.getLogger(Class1.class);
	@Test
	public void paralleltest1() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://cognine.com/");
	driver.manage().window().maximize();
	//Logger.info("Setup for method: " + Thread.currentThread().getName());
	System.out.println("Setup for method: " + Thread.currentThread().getName());
	//driver.quit();
	}

}
