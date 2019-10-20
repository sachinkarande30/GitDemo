package PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import resources.Base;

public class LandingPage {
	public static Logger log= LogManager.getLogger(Base.class.getName());
	  public WebDriver driver;
	  
	  By signin = By.cssSelector("a[href*='sign_in']");
	   
	//  By title = By.cssSelector(".text-center>h2");
		// By NavBar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
		
	//  #content > div > div > h2
	  By title = By.cssSelector("#content > div > div > h2");
	
	  //  By title = By.cssSelector(".text-center>h2");
	 //By NavBar = By.cssSelector(".text-center>h2");
	  
	 By NavBar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	  
	public LandingPage( WebDriver driver)
	{
		 
		this.driver=driver;
		
		
	}
	
	 public WebElement getLogin()
	 {
		 
		 return driver.findElement(signin);
	 }
	
	 
	 public WebElement getTitle()
	 {
		 return driver.findElement(title);
		 
	 }
	 
	 public WebElement getNavigationBar()
	 {
		 return driver.findElement(NavBar);
		 
	 }
	
}
