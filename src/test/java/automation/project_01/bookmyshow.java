package automation.project_01;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.Assert;

public class bookmyshow {
	public static WebDriver driver;
	public String test1() {
	WebDriver driver= new ChromeDriver();
	driver.get("https://in.bookmyshow.com");

	String actualresult = "https://in.bookmyshow.com";
	String expectedresult=driver.getCurrentUrl();
	Assert.assertEquals("actualresult","expectedresult","URl's are matched");
	WebElement ele=driver.findElement(By.className("bwc__sc-ttnkwg-5 jhbnqL"));
	ele.click();
	return expectedresult;
		}
	
	public static void main(String[] args) {
		
		bookmyshow t=new bookmyshow();
		t.test1();
		
		
	}
		
}
