package First_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Redbus {
	
	public static void main(String[] args) throws InterruptedException {
		
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.com/");
		
		driver.manage().window().maximize();
		
		WebElement red = driver.findElement(By.xpath("//span[@class='flagicon icon-IND']"));
		
        JavascriptExecutor jr = (JavascriptExecutor) driver; //
		
		jr.executeScript("arguments[0].scrollIntoView();",red);
		
		Thread.sleep(3000);
		
		jr.executeScript("window.scrollBy(0,3000)");
		
        Thread.sleep(3000); 
        
        jr.executeScript("window.scrollBy(0,-1500)"); 
		
	}

}
