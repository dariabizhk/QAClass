package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/user/Desktop/Selenium/chromedriver");
		
		WebDriver daria = new ChromeDriver();
		
		daria.get("https://www.facebook.com/login.php/");
		
		Thread.sleep(3000);
		
		daria.findElement(By.id("email")).sendKeys("dariabizhk@gmail.com");
		
		Thread.sleep(3000);
		
		daria.findElement(By.id("pass")).sendKeys("12345");
		
		Thread.sleep(3000);
		
		daria.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(3000);
		
		daria.close();

	}

}
