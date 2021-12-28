package First_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Down {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement amazon_logo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		
		JavascriptExecutor jr = (JavascriptExecutor) driver; //
		
		jr.executeScript("arguments[0].scrollIntoView();",amazon_logo);
		
		Thread.sleep(3000);
		
		jr.executeScript("window.scrollBy(0,-2000)");
		
        Thread.sleep(3000);
		
		jr.executeScript("window.scrollBy(0,1500)");
		
		
		
	}
	
}
