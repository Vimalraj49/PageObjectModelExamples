package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.loginPageObjects;

public class loginPageTestCase {
	
	@Test
	public void loginTest() {
		
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium learning\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://phptravels.net/login"); // Replace with the actual login page URL
      
        PageFactory.initElements(driver, loginPageObjects.class);
        
        loginPageObjects.userName.sendKeys("agent@phptravels.com");
        loginPageObjects.password.sendKeys("demoagent");
        loginPageObjects.loginButton.click();
        
        
        
        
		/*
		 * loginPageObjects.userName(driver).sendKeys("agent@phptravels.com");
		 * 
		 * loginPageObjects.password(driver).sendKeys("demoagent");
		 * 
		 * loginPageObjects.loginButton(driver).click();
		 */
        

	}

}
