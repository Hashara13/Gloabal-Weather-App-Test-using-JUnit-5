import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import WeatherApp_FrontEnd.LandingPage;

public class TestingClass {
	   static WebDriver driverobj;
	 @BeforeClass
	public  void setTest() throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\Selenium\\Browser drivers\\geckodriver.exe");
	      
		 driverobj = new FirefoxDriver();

	}
	   @Test
	 public void checkWeather() throws InterruptedException {
		   setTest();
		   driverobj.manage().window().maximize();
	        LandingPage objsearch = new LandingPage(driverobj);
	        objsearch.checkLiveWeather("colombo", "", "Sri Lanka");
	    }
	   
	
	
}
