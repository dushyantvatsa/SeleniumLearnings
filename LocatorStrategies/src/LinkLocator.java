import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// 1. set property for driver executable files
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
		
		// 2. Create web driver object
		WebDriver driver = new ChromeDriver();
		
		/*Steps we want to do:
		 * open browser
		 * visit website http://amazon.in
		 * locate link with text "Today's Deals"
		 * click on this link
		 * print current url and title of the page
		 * wait for 3 seconds
		 * exit
		 */
	
		// 3. LinkText Locator Strategy
	driver.get("https://amazon.in");
	WebElement element = driver.findElement(By.linkText("Today's Deals"));
	element.click();
	System.out.println("Current URL is : " + driver.getCurrentUrl() + "\nPage Title is : " + driver.getTitle());
	Thread.sleep(3000);
	driver.quit();
	}

}
