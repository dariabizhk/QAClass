package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/user/Desktop/Selenium/chromedriver" );
		
		WebDriver daria = new ChromeDriver();
		
		daria.get(null);
		
		Thread.sleep(3000);
		
		daria.findElement(By.id("")).sendKeys("");
		
		Thread.sleep(3000);
		
		daria.findElement(By.id("")).sendKeys("");
		
		Thread.sleep(3000);
		
		daria.findElement(By.id("")).click();
		
		Thread.sleep(3000);
		
		daria.close();
		

	}

}
