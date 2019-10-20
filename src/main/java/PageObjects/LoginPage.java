package PageObjects;

import org.openqa.selenium.By;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class LoginPage {

	 public WebDriver driver;
	 public static Logger log = LogManager.getLogger(Base.class.getName());
	 By email = By.cssSelector("[id='user_email']");
	 
	 By password = By.cssSelector("[type='password']");
	 
	 By login = By.cssSelector("[value='Log In']");
	 
	 
	 
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
		
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
		
		
	}
	 
	public WebElement getPassword()
	{
		return driver.findElement(password);
		
	}
	 
	 public WebElement getLogin()
	 {
		 return driver.findElement(login);
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	
}
