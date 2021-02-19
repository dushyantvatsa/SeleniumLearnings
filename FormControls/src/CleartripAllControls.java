import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CleartripAllControls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. set property for driver executable files
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
				
		// 2. Create web driver object
				WebDriver driver = new ChromeDriver();
				
				/* 3. carry out following steps:
				 *  Navigate to https://cleartrip.com
				 *  Give details of trip as: One Way, Delhi to Mumbai
				 *  Select and fill details of number of adults/children and infants
				 *  Select date
				 *  Close browser
				 */

				driver.get("https://cleartrip.com");	// open https://cleartrip.com
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				driver.findElement(By.cssSelector("#OneWay")).click();	// Find and select the radio button for one way
				driver.findElement(By.cssSelector("#FromTag")).sendKeys("New Delhi, IN - Indira Gandhi Airport (DEL)"); // Find the from text box and give location
				driver.findElement(By.cssSelector("#ToTag")).sendKeys("Mumbai, IN - Chatrapati Shivaji Airport (BOM)"); // Find the to text box and give location
				
				driver.findElement(By.xpath("//*[@id=\"DepartDate\"]")).sendKeys("Fri, 26 Feb, 2021");
				
				WebElement children = driver.findElement(By.id("Childrens"));
				Select child = new Select (children);
				child.selectByIndex(1);
				
				WebElement adults = driver.findElement(By.id("Adults"));
				adults.sendKeys("2");
				
				WebElement infants = driver.findElement(By.id("Infants"));
				infants.sendKeys("1");
	}

}
