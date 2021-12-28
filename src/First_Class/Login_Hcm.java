package First_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Hcm {
	
	public static void main(String[] args) throws InterruptedException {
		
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cee-apac.exelatech.com/");
		
		driver.manage().window().maximize();
		
        WebElement email = driver.findElement(By.xpath("//input[@class='form-control col-12']"));
		
		email.sendKeys("bharath.shankar@exelaonline.com");
		
		driver.findElement(By.id("password-field")).sendKeys("Welcome123");
		
		
	}

}
