import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1. set property for driver executable files
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
// 2. Create web driver object
		WebDriver driver = new ChromeDriver();
		
		/* 3. carry out following steps:
		 * navigate to link
		 * find checkbox
		 * select and unselect required checkbox
		 * exit
		*/
		driver.get("http://www.leafground.com/pages/checkbox.html");	// open given link
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebElement checkBox = driver.findElement(By.id("defaultCheck1"));
		//checkBox.click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
