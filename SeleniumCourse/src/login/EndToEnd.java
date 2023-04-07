package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/user/Desktop/Selenium/chromedriver" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement countryTextBox = driver.findElement(By.id("autosuggest"));
		
		countryTextBox.sendKeys("Ta");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		List<WebElement> countries = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for (WebElement countryName : countries) {
					
			if (countryName.getText().equalsIgnoreCase("TAJIKISTAN")) {
				
				Thread.sleep(3000);
				
				countryName.click();
				
				break; 
			}
			
		}
		Thread.sleep(5000);
		
		driver.quit();

	}

}
