import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCSS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1. set property for driver executable files
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
				//System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
				
		// 2. Create web driver object
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://amazon.in");	// open amazon.in
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone");
				Thread.sleep(5000);
				driver.quit();
	}

}
