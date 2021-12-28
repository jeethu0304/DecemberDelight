package First_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		ChromeOptions ch= new ChromeOptions();
		ch.addArguments("incognito");
		WebDriver driver = new ChromeDriver (ch);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		Actions ac = new Actions(driver);
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		ac.moveToElement(signin).build().perform();
		ac.click().build().perform();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement scroll_1 = driver.findElement(By.xpath("//h1[@class='page-heading']"));
		js.executeScript("arguments[0].scrollIntoView();", scroll_1);
		driver.findElement(By.id("email")).sendKeys("bharathshankar86@yahoo.com");
		driver.findElement(By.id("passwd")).sendKeys("9790345831");
		driver.findElement(By.id("SubmitLogin")).click();
		WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		ac.moveToElement(tshirt).build().perform();
		ac.click().build().perform();
		WebElement centre_page = driver.findElement(By.xpath("//a[text()='Casual']"));
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", centre_page);
		Thread.sleep(2000);
		//Actions ac = new Actions(driver);
		WebElement qv = driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
		ac.moveToElement(qv).build().perform();
		ac.click(qv).build().perform();
		Thread.sleep(2000);
		WebElement frame_1 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(frame_1);
		Thread.sleep(2000);
		driver.findElement(By.name("qty")).clear();
		driver.findElement(By.name("qty")).sendKeys("5");
		WebElement size = driver.findElement(By.id("group_1"));
		Select s= new Select(size);
		s.selectByValue("3");
		
		
		
		
		
		
		
		
	}
	

}
