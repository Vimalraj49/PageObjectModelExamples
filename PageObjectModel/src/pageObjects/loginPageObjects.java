package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPageObjects {

	@FindBy(how=How.ID, using="email")
	public static WebElement userName;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(id="submitBTN")
	public static WebElement loginButton;
}


/*
 * //static keyword used to return elements and accessed without creating a new  object in "loginPageTestCase" class 
 * 
 * public static WebElement userName(WebDriver driver) 
 * { return driver.findElement(By.id("email")); }
 * 
 * public static WebElement password(WebDriver driver) { return
 * driver.findElement(By.id("password")); }
 * 
 * public static WebElement loginButton(WebDriver driver) { return
 * driver.findElement(By.id("submitBTN")); }
 */