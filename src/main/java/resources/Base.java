package resources;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;




import java.io.IOException;





public class Base {
	
	public static Logger log= LogManager.getLogger(Base.class.getName());

     public WebDriver driver;
     public Properties prop;
     
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop = new Properties();
		
		//C:\Users\Only Sachin\E2EProject\src\main\java\resources\data.properties
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Only Sachin\\E2EProject\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
	
	
	
	if(browserName.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver","H:\\software\\Oxygen\\eclipse\\chromedriver_win32 (12)\\chromedriver.exe");

		 driver = new ChromeDriver();	
	}
	else if(browserName.equals("Firefox"))
	{
		
		 System.setProperty("webdriver.Firefox.driver","H:\\software\\Oxygen\\eclipse\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		 driver= new FirefoxDriver();
		
	}
	
	
/*	else if(browserName.equals("IE"))
	{
		
		
	} */
	
 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	
	return driver;
	
	

	
	}

	public void getScreenshot1 (String result) throws IOException
	{
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("C://test//screenshot.png"));
		
	}
	/*public void getScreenshot(String result)
	{
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           
		
		
	}*/
	
	
	
}
