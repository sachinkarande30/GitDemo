package academy1;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.Base;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomePage extends Base {
	public static Logger log= LogManager.getLogger(Base.class.getName());

	
	@Test(dataProvider ="getData1")
	public void HomePage(String Username, String Password, String text) throws IOException 
	{
		
		 // Logger log = LogManager.getLogger(Base.class.getName());

		//driver = initializeDriver();
	   driver.get("http://qaclickacademy.com");
	   
		
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		
		LoginPage lp = new LoginPage(driver);
		
		
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		
		//System.out.println(text);
		
		log.info(text);
		lp.getLogin().click();
	//	
		
				
	}
	
	
	@DataProvider 
     public Object[][] getData1()
	{
		Object[][] data1 = new Object[2][3];
		
		
		data1[0][0]="nonresticteduser@qw.com";
		data1[0][1]="123456";
		data1[0][2]="Non restricted user";
		
		
		data1[1][0]="restricteduser@qw.com";
		data1[1][1]="456786";
	    data1[1][2]="restricted user";
		
		
		return data1;
		//return data;
		
		
		
		
		
		
	}
	
	@BeforeTest
	public void initialize() throws IOException 
	{
		driver=initializeDriver();
		//driver.get(prop.getProperty("url"));
		  driver.get("http://qaclickacademy.com");
	}
	
	
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
	}
	
	
	
	
	
	
	
	
	
	

}
