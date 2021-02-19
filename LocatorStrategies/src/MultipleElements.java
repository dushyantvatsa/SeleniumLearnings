import java.util.concurrent.TimeUnit;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// 1. set property for driver executable files
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
				//System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
				
		// 2. Create web driver object
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Automate as required
				/*
				 * findElements
				 * Open https://flipkart.com
				 * close the pop up
				 * print text of all anchor tags ending with "Camera"
				 * close browser
				 */
				
				driver.get("https://flipkart.com");	// open flipkart.com
				driver.findElement(By.className("_2doB4z")).click();	//close the popup
				
				List<WebElement> cameraList = driver.findElements(By.partialLinkText(" Camera"));
				
				for(WebElement camera: cameraList) {
					System.out.println(camera.getText());
				}
				
				Thread.sleep(3000);
				driver.quit();
	}

}
