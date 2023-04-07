package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HappyPath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/user/Desktop/Selenium/chromedriver");
		
		WebDriver daria = new ChromeDriver();
		
		daria.get("https://login.salesforce.com/");
		
		Thread.sleep(3000);
		
		daria.findElement(By.id("username")).sendKeys("DariaBizhko");
		
		Thread.sleep(3000);
		
		daria.findElement(By.id("password")).sendKeys("32451");
		
		Thread.sleep(3000);
		
		daria.findElement(By.id("Login")).click();
		
		Thread.sleep(3000);
		
		daria.close();
		
		
		
		
		
		

	}

}
