package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBasePage {

public static WebDriver driver;
	
static String url = "http://techfios.com/test/102/";
	public static void initDriver() {
	
		 System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
	}
	public static void tearDown()
	{
		driver.close();
		driver.quit();
	}
	
	
}
