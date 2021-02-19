import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1. set property for driver executable files
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
				
		// 2. Create web driver object
				WebDriver driver = new ChromeDriver();
				
				/* 3. carry out following steps:
				 *  Navigate to https://cleartrip.com
				 *  Select Multi-City radio button from the form present on the homepage of cleartrip.com.
				 *  Close browser
				 */

				driver.get("https://cleartrip.com");	// open https://cleartrip.com
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				driver.findElement(By.cssSelector("#MultiCity")).click();
				
				Thread.sleep(3000);
				driver.quit();
	}

}
