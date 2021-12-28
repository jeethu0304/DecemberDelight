package First_Class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {
	


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement simplealert = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		
		simplealert.click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		Alert alert2 = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		alert2.accept();
		
		driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
		
		Alert alert3 = driver.switchTo().alert();
		
		alert3.sendKeys("Demo Alert");
		
		String text = driver.switchTo().alert().getText();
		
		System.out.println("Prompt Text Box:" +text);
		
		alert3.accept();
		
		
		
		
		
	}

}
