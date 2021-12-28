package First_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dom_Structure {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("123456789");
		
		WebElement pass = driver.findElement(By.id("pass"));
		
		pass.sendKeys("Angel");
		
		//pass.clear
		
		boolean dis = email.isDisplayed();
		
		System.out.println("Is Displayed or not; "+dis);   //concordination
		
		boolean en = email.isEnabled();
		
		System.out.println("Is Enabled or not; "+en);
		
		boolean sel = email.isSelected();
		
		System.out.println("Is Selected or not; "+sel);
		
		driver.findElement(By.name("login")).click();
		
		
	}

		
	}

