import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2exercises {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// 1. set property for driver executable files
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
		
		// 2. Create web driver object
		WebDriver driver = new ChromeDriver();
		
//		// Problem 1a
//		driver.get("https://amazon.in");
//		WebElement searchboxamazon = driver.findElement(By.id("twotabsearchtextbox"));
//		System.out.println("Google search box id is : " +searchboxamazon.getAttribute("id"));
//		
//		// Problem 1b
//		driver.get("https://google.com");
//		WebElement searchboxgoogle = driver.findElement(By.className("gLFyf"));
//		System.out.println("\nGoogle search box name is : " +searchboxgoogle.getAttribute("name"));

//		// Problem 1ef
//		driver.get("https://facebook.com");
//		WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("dangermancool@gmail.com");
//		WebElement login = driver.findElement(By.name("login"));
//		login.click();
//		System.out.println("\nGoogle search box name is : " +searchboxgoogle.getAttribute("name"));
//		
//		// Problem 1g
//		driver.get("https://google.com");
//		WebElement element = driver.findElement(By.tagName("a"));
//		element.click();
		
		// Problem 4
		driver.get("http://www.leafground.com/pages/Button.html");
		WebElement element = driver.findElement(By.tagName("img"));
		element.click();
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
