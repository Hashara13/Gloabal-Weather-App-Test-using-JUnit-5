package WeatherApp_FrontEnd;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	WebDriver driverobj =null;
	By cityInput = By.id("cityName");
    By stateInput = By.id("stateName");
    By countryInput = By.id("countryName");
    By checkButton = By.xpath("/html/body/div/form/div[2]/button");
    By weatherCard = By.xpath("/html/body/div/div");
	public LandingPage(WebDriver driverobj) {
		this.driverobj = driverobj;
	}
	
	public void checkLiveWeather(String city,String state, String country ) throws InterruptedException {
		driverobj.get("http://127.0.0.1:5000/");
		driverobj.findElement(cityInput).sendKeys(city);
		Thread.sleep(3000);
		driverobj.findElement(stateInput).sendKeys(state);
		Thread.sleep(3000);
		driverobj.findElement(countryInput).sendKeys(country);
		Thread.sleep(3000);
		driverobj.findElement(checkButton).click();
		driverobj.findElement(weatherCard);
        assertTrue("Weather card is not displayed", ((WebElement) weatherCard).isDisplayed());
		
	}
	
}
