import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// 1. set property for driver executable files
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
				//System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
				
				// 2. Create web driver object
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize(); //to maximize window
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //to wait for 5 seconds for elements to load in case net speed is slow.
				/*Locators we want to try and use:
				 * ID Locator: ID are usually unique for a given page. Usually used for images/buttons/any other element
				 * Name Locator: Names are usually unique for a given page. Usually used for form elements of input/select type
				 * Class Name locator
				 * Tag Locator
				 * 
				 * Uniqueness
				 * ID > Class Name > Name (usually don't use this)> Tag
				 */
				
				
				// FOR NAME AND ID LOCATOR FUNCTIONALITY
				/* Steps we want to take:
				 * Open browser
				 * Visit website http://amazon.in
				 * Locate searchbox
				 * Type iPhone into search box
				 * wait for 3 seconds
				 * exit
				 */
				
//				driver.get("https://amazon.in");
//				WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox")); //for searching by id locator
//				WebElement searchbox = driver.findElement(By.name("field-keywords")); //for searching by name locator
//				searchbox.sendKeys("iPhone");
				
				//FOR NAME AND ID LOCATOR FUNCTIONALITY
				/*
				 * Open https://flipkart.com
				 * close pop up
				 * type iphone in search box
				 * wait for 3 sec
				 * close browser
				 */
				
//				driver.get("https://flipkart.com");
//				//Click on close button
//				driver.findElement(By.className("_2doB4z")).click(); 
//				//Type iPhone in searchbox
//				WebElement searchBox = driver.findElement(By.className("_3704LK")); //for searching by class locator
//				searchBox.sendKeys("iphone");
//				WebElement searchButton = driver.findElement(By.className("L0Z3Pu"));
//				searchButton.click();
				
				// FOR TAG LOCATOR FUNCTIONALITY: In case only individual element with given tag is present
				/*
				 * Open https://google.com
				 * locating img tag
				 * printing value of 'alt' attribute (alternate text)
				 */
				
				driver.get("https://google.com");
				WebElement image = driver.findElement(By.tagName("img"));
				String altText=image.getAttribute("alt");
				System.out.println(altText);
				Thread.sleep(3000);
				driver.quit();
	}

}
