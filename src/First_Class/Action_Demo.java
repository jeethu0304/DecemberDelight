package First_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Demo {
	
	

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
	
		WebElement Dresses = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		
		Actions ac = new Actions(driver);
		
	    ac.moveToElement(Dresses).build().perform();
	    
	    WebElement Summer = driver.findElement(By.xpath("((//a[text()='Summer Dresses'])[2]"));
	    
	    ac.click(Summer).build().perform();
	    
	    
		
		
		
		
			}

}
