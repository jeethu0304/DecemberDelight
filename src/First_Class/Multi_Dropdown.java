package First_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Dropdown {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement multidrop = driver.findElement(By.xpath("(//select)[6]"));
		
		Select s= new Select(multidrop);
		
		s.selectByIndex(3);
		
		s.selectByValue("1");
		
		Thread.sleep(3000);
	
		s.selectByVisibleText("Appium");
		
		
		System.out.println("-------------");
		
		List<WebElement> mul = s.getOptions();
		
		for (WebElement webelement : mul) {
		
			String text = webelement.getText();
			
			System.out.println(text);
			
			
		}

		System.out.println("-------------");
		
		List<WebElement> welc = s.getAllSelectedOptions();
		
		for (WebElement webelement : welc) {
		
		String text1 = webelement.getText();
		
		System.out.println(text1);
		
	//	System.out.println(webelement.getText());
	}

		
		System.out.println("---------------");
		
		WebElement fir = s.getFirstSelectedOption();
		
		System.out.println(fir.getText());
		
		System.out.println("---------------");
		
		boolean tru = s.isMultiple();
		
		System.out.println("Is multiple or not: " +tru);
			
			
		}
		
		
	}
	

