package academy1;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ValidateNavigationBar extends Base {
  
	public static Logger log= LogManager.getLogger(Base.class.getName());

	public void ValidateAppNavBar() throws IOException
    {
    	//driver = initializeDriver();
    	//driver.get("http://qaclickacademy.com");
    	
		
		//driver.get(prop.getProperty("browser"));
    	
    	LandingPage l = new LandingPage(driver);
    	Assert.assertTrue(l.getNavigationBar().isDisplayed());
    	//driver.findElement(l.NavBar);
    	//l.getNavigationBar();
    	log.info("Navigation Bar is displayed");
		 System.out.println("Test completed");
    	
    	
    	
    	
    	Assert.assertTrue(l.getNavigationBar().isDisplayed());
    	
    	
    	
    	
    }
	
	@BeforeTest
	public void initializer() throws IOException 
	{
		driver=initializeDriver();
		driver.get("http://qaclickacademy.com");
		//driver.get(prop.getProperty("url"));
	}
	
	
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		//driver=null;
	}
	
}
