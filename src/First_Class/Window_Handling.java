package First_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {
	


	public static void main(String[] args) throws AWTException {
		
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement Mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		Actions ac = new Actions(driver);
		
		ac.contextClick(Mobiles).build().perform();
		
		Robot r =new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
        WebElement Best = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		
		ac.contextClick(Best).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
        WebElement Elect = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		
		ac.contextClick(Elect).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
        WebElement prime = driver.findElement(By.id("nav-link-prime"));
		
		ac.contextClick(prime).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
	    Set<String> all_Window_Id = driver.getWindowHandles();
	    
	    for (String id : all_Window_Id) {
		
	    	String title = driver.switchTo().window(id).getTitle();
	    	
	    	System.out.println(title);
		

		
		
	}

	}
}
