package First_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	
	

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		System.out.println("----------All dates-------"); 
		
		List<WebElement> all_data = driver.findElements(By.xpath("//table/tbody/tr/td")); 
        for (WebElement WebElement : all_data) { 
			String text = WebElement.getText(); 
			System.out.println(text); 
			}
			
			System.out.println("----------Row Data-------"); 
			
		List<WebElement> Row_data = driver.findElements(By.xpath("//table/tbody/tr[3]/td")); 
		for (WebElement row : Row_data) { 
				String text = row.getText(); 
				System.out.println(text); 
					}		
				
		  System.out.println("----------Column Data-------"); 
				
		List<WebElement> Column_data = driver.findElements(By.xpath("//table/tbody/tr/td[5]")); 
		for (WebElement Column : Column_data) { 
			String text = Column.getText(); 
			System.out.println(text); 
		
		}
		
		System.out.println("----------Parti Data-------"); 
		WebElement parti_data = driver.findElement(By.xpath("//table/tbody/tr[5]/td[6]")); 
		String text = parti_data.getText(); 
		System.out.println(text); 
		
		System.out.println("----------Header-------"); 
		List<WebElement> Header_data = driver.findElements(By.xpath("//table/tbody/tr/th")); 
		for (WebElement Header : Header_data) { 
	     String text1 = Header.getText(); 
		System.out.println(text1); 
		
		}
		
						
			
		
		
	}
		
	

		

		
		}

	
