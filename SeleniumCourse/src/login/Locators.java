package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/user/Desktop/Selenium/chromedriver" );
		
		WebDriver locators = new ChromeDriver();
		
		locators.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		locators.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip > tbody > tr > td:nth-child(2) > label")).click();
		
		
		Thread.sleep(3000);
		
		locators.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		
		Thread.sleep(3000);
		
		
		locators.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[1]/li[5]/a")).click();
		
		Thread.sleep(3000);
		
		
		locators.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[1]/li[5]/a")).click();
		
		
		Thread.sleep(3000);
		
		
		locators.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[5]/td[5]/a")).click();
		
		Thread.sleep(3000);
		
		
		locators.close();
		
		
		
		
		
		
		
		
		//ctl00$mainContent$rbtnl_Trip
		
		//ctl00_mainContent_ddl_originStation1_CTXTaction
		
		

	}

}
