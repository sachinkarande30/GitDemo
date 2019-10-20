package academy1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
//import academy.base;
import resources.Base;
import java.io.IOException;
import PageObjects.LandingPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
public class ValidateTitle extends Base {
	public static Logger log= LogManager.getLogger(Base.class.getName());
   public void basePageNavigation() throws IOException 
   {
	   

	  // driver = initializeDriver();
	  // driver.get("http://qaclickacademy.com");
	 
	   
	   LandingPage l = new LandingPage(driver);
	   Assert.assertEquals(l.getTitle().getText(), "FEATURED CO123URSES");
	 //  Assert.assertEquals(l.getTitle().getText(),"Featured courese 123");
	  // l.getTitle();
	  log.info("successfully validated test msg");
	  System.out.println("Test completed");
		 
   }
	
   @BeforeTest
	public void initializer() throws IOException 
	{
	   driver =initializeDriver();
	   driver.get("http://qaclickacademy.com");
		 log.info("Driver is initialized");
			
		//driver.get(prop.getProperty("url"));
		 log.info("Navigated to Home page");
	}
	
	
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
	}
	
	
}
