import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1. set property for driver executable files
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
// 2. Create web driver object
		WebDriver driver = new ChromeDriver();
		
		/* 3. carry out following steps:
		 *  Navigate to site
		 *  select first 2 options in the multiselect drop down
		 *  Close browser
		 */

		driver.get("http://www.leafground.com/pages/Dropdown.html");	// open http://www.leafground.com/pages/Dropdown.html
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select selection = new Select(element);
		selection.selectByValue("1");
		selection.selectByValue("2");
		
		Thread.sleep(3000);
		driver.quit();

	}

}
