package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testlogindeleteafter {
	
	@Test
    public void phplogin() {
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium learning\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://phptravels.net/login"); // Replace with the actual login page URL

        // Locate and interact with the login form
        WebElement usernameField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("submitBTN"));

        usernameField.sendKeys("agent@phptravels.com");
        passwordField.sendKeys("demoagent");
        loginButton.click();

        // Dismiss JavaScript confirmation dialogs
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.confirm = function() { return false; }");

        // Continue with the rest of your test script or assertions
    }
}

