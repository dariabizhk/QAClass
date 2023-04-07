package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javaloops {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/user/Desktop/Selenium/chromedriver" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		  
		driver.findElement(By.id("autosuggest")).sendKeys("Ge");
		
		Thread.sleep(3000);
		  
		List<WebElement> countries = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		 
		for (WebElement list : countries) {
		   
		if (list.getText().equalsIgnoreCase("Germany")) {
			
			Thread.sleep(3000);
		}
		    list.click();
		    
		    Thread.sleep(3000);
		    
		    break;
		   }


	}

}
