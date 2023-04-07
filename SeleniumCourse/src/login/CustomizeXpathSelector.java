package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizeXpathSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/user/Desktop/Selenium/chromedriver" );
		
		WebDriver customize = new ChromeDriver();
		
		customize.get("https://login.salesforce.com/");
		
		customize.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']")).sendKeys("Daria Bizhko");
		
		Thread.sleep(2000);
		
		customize.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).sendKeys("DariaBizhko");
		
		Thread.sleep(2000);
		
		customize.findElement(By.xpath("//input[@value=\'Log In\']")).click();
		
		Thread.sleep(2000);
		
		customize.close();
		
		
		
		
		//<input class="input r4 wide mb16 mt8 username" type="email" value="" name="username" id="username" aria-describedby="error" style="display: block;">
       //<input class="input r4 wide mb16 mt8 password" type="password" id="password" name="pw" aria-describedby="error" aria-required="true" onkeypress="checkCaps(event)" autocomplete="off">
		//<input class="button r4 wide primary" type="submit" id="Login" name="Login" value="Log In">
		
		
		//input[@class='input r4 wide mb16 mt8 username']
		//input[@class='input r4 wide mb16 mt8 password']
		//input[@class'button r4 wide primary'] 
		
	}

}
