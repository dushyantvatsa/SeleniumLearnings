import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SingleDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1. set property for driver executable files
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
// 2. Create web driver object
		WebDriver driver = new ChromeDriver();
		
		/* 3. carry out following steps:
		 *  Navigate to https://cleartrip.com
		 *  Select and fill details of number of adults/children and infants on the homepage of cleartrip.com.
		 *  Close browser
		 */

		driver.get("https://cleartrip.com");	// open https://cleartrip.com
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement children = driver.findElement(By.id("Childrens"));
		Select child = new Select (children);
		child.selectByIndex(1);
		
		WebElement adults = driver.findElement(By.id("Adults"));
		adults.sendKeys("2");
		
		WebElement infants = driver.findElement(By.id("Infants"));
		infants.sendKeys("1");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
