package First_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_code {

	
	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement ccc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		ccc.click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("Jeethu");
		
		driver.findElement(By.name("lastname")).sendKeys("Bharath");
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("7654321908");
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("dhge&hj");
		
		WebElement drop = driver.findElement(By.id("day"));
		
		Select s = new Select(drop);
		
	    s.selectByValue("29");
	    
	    WebElement month = driver.findElement(By.id("month"));
	    
	    Select s1 = new Select(month);
	    
	    s1.selectByIndex(4);
	    
	    WebElement year = driver.findElement(By.id("year"));
	    
	    Select s2 = new Select(year);
	    
	    s2.selectByVisibleText("1986");
	    
	    boolean multi = s.isMultiple();
	    
	    System.out.println("Is multiple or not: "+multi);
	    
	    List<WebElement> opt = s1.getOptions();
	    
	    for (WebElement webelement : opt) {
	    	
	    String text = webelement.getText();
	    
	    System.out.println(text);
	    
	    
	    
	    }
	    
	    System.out.println("-------------");
	    
	    WebElement fso = s2.getFirstSelectedOption();
	    
	    System.out.println(fso.getText());
	    
		
	}
}
