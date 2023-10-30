package testCases;

import java.time.Duration;

import javax.sql.CommonDataSource;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.loginPageObjects;
import pageObjects.myInfoUpdateObjects;

public class myInfoUpdate {

	@Test
	public void myInfoTestCase() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium learning\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net/login"); // Replace with the actual login page URL		

		PageFactory.initElements(driver, loginPageObjects.class);

		loginPageObjects.userName.sendKeys("agent@phptravels.com");

		loginPageObjects.password.sendKeys("demoagent");

		loginPageObjects.loginButton.click();

		Thread.sleep(3000);

		PageFactory.initElements(driver, myInfoUpdateObjects.class);

		myInfoUpdateObjects.myProfile.click();

		Thread.sleep(3000);

		myInfoUpdateObjects.phone.clear();
		myInfoUpdateObjects.phone.sendKeys("12345");
		myInfoUpdateObjects.city.clear();
		myInfoUpdateObjects.city.sendKeys("ANCHORAGE");
		myInfoUpdateObjects.profilePassword.sendKeys("demoagent");
		myInfoUpdateObjects.state.clear();
		myInfoUpdateObjects.state.sendKeys("ALASKA");
		myInfoUpdateObjects.address.clear();
		myInfoUpdateObjects.address.sendKeys("5800 ROWAN ST ANCHORAGE AK 99507-1929 USA");
		
		myInfoUpdateObjects.dropDown.click();
		myInfoUpdateObjects.country.click();
		
		Thread.sleep(4000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myInfoUpdateObjects.updateButton);
		
        // Wait for a moment to ensure the button is fully visible (you can replace this with explicit waits)
        Thread.sleep(1000); // 1 second
        // Now click the button
        myInfoUpdateObjects.updateButton.click();


	
        
        
        
        
        
        


		/*
		 * loginPageObjects.userName(driver).sendKeys("agent@phptravels.com");
		 * 
		 * loginPageObjects.password(driver).sendKeys("demoagent");
		 * 
		 * loginPageObjects.loginButton(driver).click();
		 */


		/*myInfoUpdateObjects.myProfile(driver).click();

		myInfoUpdateObjects.phone(driver).clear();
		myInfoUpdateObjects.phone(driver).sendKeys("88888");

		myInfoUpdateObjects.city(driver).sendKeys("Dallas");

		myInfoUpdateObjects.updateButton(driver).click();*/

	}

}
