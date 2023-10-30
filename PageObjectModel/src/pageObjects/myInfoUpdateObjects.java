package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myInfoUpdateObjects {

	@FindBy(xpath = "//*[@id=\"fadein\"]/div[1]/div/div/div[2]/ul/li[3]/a")
	public static WebElement myProfile;
	
	@FindBy(name = "phone")
	public static WebElement phone;
	
	@FindBy(name = "city")
	public static WebElement city;
	
	@FindBy(xpath = "//*[@id=\"Password\"]")
	public static WebElement profilePassword;

	@FindBy(xpath = "//*[@id=\"profile\"]/div/div[4]/div[1]/div/div/button")
	public static WebElement dropDown;
	
	@FindBy(xpath = "//span[contains(@class, 'text')]/span[contains(@class, 'text-dark') and contains(text(), 'United States')]")
	public static WebElement country;
	
	@FindBy(name = "state")
	public static WebElement state;
	
	@FindBy(name = "address1")
	public static WebElement address;
	
	@FindBy(xpath = "//*[@id='profile']/div/div[contains (@class,'btn-box mt-4')]/button")
	public static WebElement updateButton;
	
	
	
	
	
	
	
	
	
	
	/*
	 * public static WebElement myProfile(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"fadein\"]/div[1]/div/div/div[2]/ul/li[3]/a")); }
	 * 
	 * public static WebElement phone(WebDriver driver) { return
	 * driver.findElement(By.name("phone")); }
	 * 
	 * public static WebElement city(WebDriver driver) { return
	 * driver.findElement(By.name("city")); }
	 * 
	 * public static WebElement updateButton(WebDriver driver) { return
	 * driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div[6]/button")); }
	 */
}
