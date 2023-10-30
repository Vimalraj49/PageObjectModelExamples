package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.loginPageObjects;



public class LoginWithoutFindBy {

	public static WebElement email;
	public static WebElement password;
	public static WebElement submitBTN;

	@Test
	public void login() {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium learning\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net/login"); // Replace with the actual login page URL

		PageFactory.initElements(driver, LoginWithoutFindBy.class);

		email.sendKeys("agent@phptravels.com");

		password.sendKeys("demoagent");

		submitBTN.click();

	}

}

